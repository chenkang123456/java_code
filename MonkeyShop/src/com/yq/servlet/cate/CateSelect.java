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

@WebServlet("/manage/admin_cateselect")
public class CateSelect extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        ArrayList<LMONKEY_CATEGORY> catelist = LMONKEY_CATEGORYDao.selectAll();
        request.setAttribute("catelist",catelist);

        request.getRequestDispatcher("admin_cate.jsp").forward(request,response);
    }
}
