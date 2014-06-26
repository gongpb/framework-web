<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
		<title>Login</title>
		<link  type="text/css" rel="stylesheet" media="screen" href="css/bootstrap.css"/>
	</head>
	<body>
		<div class="container" style="width: 300px; height: 400px">
			<form class="form-signin" method="post" action="login">
				<h2 class="form-signin-heading">Login</h2>
				<span id="errorMessage" style="color: red"></span>
				<input name="j_username" class="form-control" type="text" placeholder="输入用户名" />
				<label></label>
				<input name="j_password" class="form-control" type="password"  placeholder="输入密码" />
				<label class="checkbox"><input type="checkbox" value="remember-me" />Remember Me</label>
				<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
			</form>
		</div>
		<div style="width: 100%;" align="center">
			当前版本: 0.0.1
		</div>
	</body>
</html>