<%--
  Created by IntelliJ IDEA.
  User: kadoshimakotaro
  Date: 2022/06/25
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ユーザー登録もどき</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/FormSampleServlet" method="post">
    名前:<br>
    <input type="text" name="name"><br>
    性別:<br>
    男<input type="radio" name="gender" value="0">
    女<input type="radio" name="gender" value="1">
    <input type="submit" value="登録">
</form>

</body>
</html>
