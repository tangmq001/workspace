<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
</head>
<body>
<form action="/action/login" method="post">
    用户名:<input type="text" name="username" required></br>
    密码:<input type="text" name="password" required></br>
    是否记住:<input type="checkbox" name="isRemenber"> 是否自动登录:<input type="checkbox" name="isAutoLog"></br>
    <input type="submit" value="登录"></br>
    <a href="/action/forgotPsd">忘记密码</a>
</form>
<script src="/resource/js/jquery/jquery-1.12.4.js"></script>
<script src="/resource/js/jquery/validate/jquery.validate.js"></script>
<script src="/resource/js/jquery/validate/localization/messages_zh.js"></script>

</body>
</html>
