<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/2/9
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/data/list" method="post">
        用户名编号：<input type="text" name="users[0].id"><br/>
        用户名名称：<input type="text" name="users[0].name"><br/>
        用户名编号：<input type="text" name="users[1].id"><br/>
        用户名名称：<input type="text" name="users[1].name"><br/>
        用户名编号：<input type="text" name="users[2].id"><br/>
        用户名名称：<input type="text" name="users[2].name"><br/>
        <input type="submit" value="提交">
    </form>

</body>
</html>
