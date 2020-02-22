package com.yq.servlet.cate;

import com.yq.entity.LMONKEY_CATEGORY;
import com.yq.service.LMONKEY_CATEGORYDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/manage/admin_docateupdate")
public class DoCateUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        int id=Integer.parseInt(request.getParameter("id"));
        int fid=Integer.parseInt(request.getParameter("parentId"));
        String name=request.getParameter("className");
        LMONKEY_CATEGORY cate = new LMONKEY_CATEGORY(id,name,fid);
        LMONKEY_CATEGORYDao.update(cate);

        response.sendRedirect("admin_cateselect");

    }
}
