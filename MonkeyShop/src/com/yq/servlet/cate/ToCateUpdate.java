package com.yq.servlet.cate;

import com.yq.entity.LMONKEY_CATEGORY;
import com.yq.service.LMONKEY_CATEGORYDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/manage/admin_tocateupdate")
public class ToCateUpdate extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        LMONKEY_CATEGORY cate = LMONKEY_CATEGORYDao.selectById(id);
        ArrayList<LMONKEY_CATEGORY> catelist= LMONKEY_CATEGORYDao.selectAll();

        request.setAttribute("catelist",catelist);
        request.setAttribute("cate1",cate);
        request.getRequestDispatcher("admin_catemodify.jsp").forward(request,response);

    }
}

