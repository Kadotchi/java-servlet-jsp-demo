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
        String luck = luckArray[index];

        //　実行日を取得
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
        String today = sdf.format(date);

        // HTMLを出力
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>スッキリ占い</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>"+today+"の運勢は「"+ luck + "」です</p>");
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
