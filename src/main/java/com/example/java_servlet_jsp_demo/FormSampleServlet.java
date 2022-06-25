package com.example.java_servlet_jsp_demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormSampleServlet", value = "/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //　リクエストパラメーターを取得
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");

        // リクエストパラメーターをチェック
        String errorMsg = "";
        if (name == null || name.length() == 0) {
            errorMsg += "名前が入力されていません<br>";
        }
        if (gender == null || gender.length() == 0) {
            errorMsg += "性別が選択されていません<br>";
        } else {
            if (gender.equals("0")) {
                gender = "男性";
            } else if (gender.equals("1")) {
                gender = "女性";
            }
        }

        // 表示するメッセージを設定
        String msg = name + "さん(" + gender + ")を登録しました";
        if (errorMsg.length() != 0) {
            msg = errorMsg;
        }

        // HTMLを出力
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ユーザー登録結果</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>" + msg + "</p>");
        out.println("</body>");
        out.println("</html>");


    }
}
