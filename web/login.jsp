<%--
  Created by IntelliJ IDEA.
  User: Askew
  Date: 3/8/2017
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/submitForm" method="POST">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="userName"></td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td><input type="text" name="userSurname"></td>
            </tr>
        </table>
        <button>Press!</button>
    </form>
</body>
</html>
