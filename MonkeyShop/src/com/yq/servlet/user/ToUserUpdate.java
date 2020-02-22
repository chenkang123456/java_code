package com.yq.servlet.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.yq.entity.*;
import com.yq.service.LMONKEY_USERDao;
@WebServlet("/manage/admin_touserupdate")
public class ToUserUpdate extends HttpServlet {
    private static final long serialVersionUID=1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String id=request.getParameter("id");
        LMONKEY_USER user = LMONKEY_USERDao.selectById(id);
        request.setAttribute("user",user);

        request.setAttribute("cpage",request.getParameter("cpage"));
        request.getRequestDispatcher("admin_usermodify.jsp").forward(request,response);
    }
}
