<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/7/18
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logain</title>
    <script src="/resource/js/jquery-1.12.4.js"></script>
</head>
<body>
<form action="/user/log" type="post">
    电话号码:<input type="text" name="tel"></br>
    验证码:<input type="text" name="SMSCode">
    <input value="发送验证码" type="submit">
</form>
</body>
</html>