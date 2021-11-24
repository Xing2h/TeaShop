<%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/20
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%--%>
<%--    User user = (User) session.getAttribute("user");--%>
<%--    String id =user.getId();--%>
<%--    String username =user.getUsername();--%>
<%--    String password = user.getPassword();--%>
<%--    String email =user.getEmail();--%>
<%--    String tel =user.getTel();--%>

<%--%>--%>
<%--    <h1>--%>
<%--        登陆成功!<br>--%>
<%--        id: <%=id%>--%>
<%--        账号：<%=username%><br>--%>
<%--        密码：<%=password%>--%>
<%--        email: <%=email%>--%>
<%--        tel: <%=tel%>--%>
<%--    </h1>--%>
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
    var name = '${adminUser.username}';
    var id = '${adminUser.id}';
    window.alert(name);
    document.getElementById("userid").value=id;
    document.getElementById("username").value=name;

</script>
</body>
</html>
