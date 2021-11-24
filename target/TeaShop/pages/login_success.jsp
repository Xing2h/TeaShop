<%@ page import="com.tee.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/13
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册成功</title>
</head>
<body>
<form action="">
    <div>
        <label for="userid">id</label>
        <input type="text" id="userid">
    </div>
    <div>
        <label for="username">id</label>
        <input type="text" id="username">
    </div>
</form>
<script>
    var name = '${user.username}';
    var id = '${user.id}';
    window.alert(name);
    document.getElementById("userid").value=id;
    document.getElementById("username").value=name;
</script>
</body>
</html>
