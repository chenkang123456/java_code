package com.yq.servlet.cart;

import com.yq.entity.LMONKEY_CART;
import com.yq.entity.LMONKEY_USER;
import com.yq.service.LMONKEY_CARTDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet("/showcart")
public class ShowCart extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        HttpSession session =  request.getSession();

        String isLogin = String.valueOf(session.getAttribute("isLogin"));

        LMONKEY_USER user=(LMONKEY_USER)session.getAttribute("name");

        if(user!=null && isLogin.equals("1")) {
            String uid = (String)user.getUSER_ID();

            ArrayList<LMONKEY_CART> list= LMONKEY_CARTDao.getCart(uid);

            request.setAttribute("shoplist", list);

            request.getRequestDispatcher("cart.jsp").forward(request, response);

        }else{
            PrintWriter out = response.getWriter();

            out.write("<script>");
            out.write("alert('登录后，再购买')");
            out.write("location.href='login.jsp'");
            out.write("</script>");
            out.close();
        }
    }
}
