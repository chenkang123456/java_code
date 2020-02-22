package com.yq.servlet.product;

import com.yq.service.LMONKEY_CATEGORYDao;
import com.yq.service.LMONKEY_PRODUCTDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/manage/admin_doproductdel")
public class DoProductDel extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        LMONKEY_PRODUCTDao.del(id);
        response.sendRedirect("admin_productselect");
    }
}
