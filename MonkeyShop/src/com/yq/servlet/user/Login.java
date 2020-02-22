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

@WebServlet("/manage/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("userName");
        String passWord = request.getParameter("passWord");

        int count = LMONKEY_USERDao.selectByNM(username,passWord);

        if(count >0){
            HttpSession session = request.getSession();

            LMONKEY_USER user = LMONKEY_USERDao.selectAdmin(username,passWord);

            session.setAttribute("name",user);
            session.setAttribute("isLogin",1);
            response.sendRedirect("/index.jsp");
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
