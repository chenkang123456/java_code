package com.yq.servlet.user;

import com.yq.entity.LMONKEY_USER;
import com.yq.service.LMONKEY_USERDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/manage/adminlogin")
public class AdminLogin extends HttpServlet {
    private static final long serialVersionUID=1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        int count = LMONKEY_USERDao.selectByNM(userName, passWord);
        if(count >0){
            LMONKEY_USER user = LMONKEY_USERDao.selectAdmin(userName,passWord);
            HttpSession session = request.getSession();
            session.setAttribute("name",user);
            session.setAttribute("isLogin",1);
            if (user.getUSER_STATUS()==2){
                session.setAttribute("isAdminLogin",1);
                response.sendRedirect("/manage/admin_index.jsp");
            }else{
                response.sendRedirect("/index.jsp");
            }
        }else{
            PrintWriter out = response.getWriter();
            out.write("<script>");
            out.write("alert('用户登录失败');");
            out.write("location.href='login.jsp'");
            out.write("</script>");
            out.close();
        }
    }
}
