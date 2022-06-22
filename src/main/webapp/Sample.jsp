<%--
  Created by IntelliJ IDEA.
  User: kadoshimakotaro
  Date: 2022/06/22
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Date,java.text.SimpleDateFormat" %>
<%
    // 運勢をランダムで決定
    String[] luckArray = {"超スッキリ", "スッキリ", "最悪"};
    int index = (int) (Math.random() * 3);
    String luck = luckArray[index];

    //　実行日を取得
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
    String today = sdf.format(date);
%>
<html>
<head>
    <title>スッキリ占い</title>
</head>
<body>
<p><%= today %>の運勢は「<%= luck %>」です</p>
</body>
</html>
