package com.wang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Wang Yadong
 * @date 2022/3/18 17:08
 */
@WebServlet("/get")
public class getSessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String session = (String)req.getSession().getAttribute("session");
        PrintWriter writer = resp.getWriter();
        writer.println(session);
        System.out.println("我是hot分支");
        System.out.println("我是hot分支");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
