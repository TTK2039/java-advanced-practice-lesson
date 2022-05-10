<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
<div>
  <form action="login" method="post">
  	${requestScope.loginError}
    <div>ID: <input type="text" name="id">${requestScope.idError}</div>
    <div>PASS: <input type="password" name="password">${requestScope.passError}</div>
    <div><button type="submit">ログイン</button></div>
  </form>
</div>
</body>
</html>
