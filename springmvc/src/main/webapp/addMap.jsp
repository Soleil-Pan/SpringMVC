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
    <form action="/data/map" method="post">
        用户名编号：<input type="text" name="users['a'].id"><br/>
        用户名名称：<input type="text" name="users['a'].name"><br/>
        用户名编号：<input type="text" name="users['b'].id"><br/>
        用户名名称：<input type="text" name="users['b'].name"><br/>
        用户名编号：<input type="text" name="users['c'].id"><br/>
        用户名名称：<input type="text" name="users['c'].name"><br/>
        <input type="submit" value="提交">
    </form>

</body>
</html>
