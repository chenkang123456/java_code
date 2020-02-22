package com.yq.servlet.cart;

import com.yq.service.LMONKEY_CARTDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/cartshopdel")
public class CartShopDel extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String esid = request.getParameter("esid");

        LMONKEY_CARTDao.getDeleteDD(Integer.parseInt(esid));
    }
}
