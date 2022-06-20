package com.example.java_servlet_jsp_demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "SampleServlet", value = "/SampleServlet")
public class SampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 運勢をランダムで決定
        String[] luckArray = {"超スッキリ", "スッキリ", "最悪"};
        int index = (int) (Math.random() * 3);
        String lack = luckArray[index];
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
