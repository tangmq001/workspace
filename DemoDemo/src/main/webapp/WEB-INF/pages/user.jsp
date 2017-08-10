<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/7/14
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>John Resig</div>
<div class="John">George Martin</div>
<div>Malcom John Sinclair</div>
<div>J. Ohn</div>
<script style="text/javascript" src="/resource/js/jquery-1.12.4.js"></script>
<script>
    console.log($("div:contains('John')"))
</script>
</body>
</html>
