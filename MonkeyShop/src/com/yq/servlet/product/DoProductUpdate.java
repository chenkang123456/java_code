package com.yq.servlet.product;

import com.yq.entity.LMONKEY_PRODUCT;
import com.yq.service.LMONKEY_PRODUCTDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/manage/admin_doproductupdate")
public class DoProductUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String pname = request.getParameter("productName");
        String id = request.getParameter("parentId");
        String price = request.getParameter("productPrice");
        String desc = request.getParameter("productDesc");
        String stock = request.getParameter("productStock");
        //创建用户实体
        LMONKEY_PRODUCT p=new LMONKEY_PRODUCT(0,pname,
                desc,Integer.parseInt(price),Integer.parseInt(stock),0,0,null);
        //加入到数据库的用户表中
        LMONKEY_PRODUCTDao.update(p);

        response.sendRedirect("admin_productselect?");
    }
}
