package com.yq.servlet.product;

import com.yq.entity.LMONKEY_CATEGORY;
import com.yq.entity.LMONKEY_PRODUCT;
import com.yq.service.LMONKEY_CATEGORYDao;
import com.yq.service.LMONKEY_PRODUCTDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/manage/admin_toproductupdate")
public class ToProductUpdate extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        LMONKEY_PRODUCT pro = LMONKEY_PRODUCTDao.selectById(id);
        ArrayList<LMONKEY_PRODUCT> prolist= LMONKEY_PRODUCTDao.selectAll();
        request.setAttribute("pro1",pro);
        ArrayList<LMONKEY_CATEGORY> flist =  LMONKEY_CATEGORYDao.selectCat("father");
        request.setAttribute("flist", flist);

        ArrayList<LMONKEY_CATEGORY> clist =  LMONKEY_CATEGORYDao.selectCat("child");
        request.setAttribute("clist", clist);
        request.getRequestDispatcher("admin_promodify.jsp").forward(request,response);
    }
}

