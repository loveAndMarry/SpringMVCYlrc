<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>index</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Loading Bootstrap -->
<link href="dist/css1/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Loading Flat UI -->
<link href="dist/css1/flat-ui.min.css" rel="stylesheet">

<link rel="shortcut icon" href="dist/img/favicon.ico">

<style>
.banner {
	background: url(dist/img/bg111.jpg) no-repeat fixed center top;
	background-size: cover;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	min-height: 650px;
	margin: 0px;
	padding: 0px;
}

.banner_info {
	margin: 10em 0 0 0;
}

.banner_info h3 {
	color: #fff;
	font-family: 'Oswald', sans-serif;
	font-size: 4em;
	margin-bottom: 30px;
}
/* Shutter Out Horizontal */
.hvr-shutter-out-horizontal {
	display: inline-block;
	vertical-align: middle;
	-webkit-transform: translateZ(0);
	transform: translateZ(0);
	-webkit-backface-visibility: hidden;
	backface-visibility: hidden;
	-moz-osx-font-smoothing: grayscale;
	position: relative;
	background: #ff8888;
	-webkit-transition-property: color;
	transition-property: color;
	-webkit-transition-duration: 0.3s;
	transition-duration: 0.3s;
	padding: 12px 40px;
	border: 2px solid #fff;
	color: #fff;
	font-family: 'Oswald', sans-serif;
	font-size: 0.5em;
}

.hvr-shutter-out-horizontal:before {
	content: "";
	position: absolute;
	z-index: -1;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	background: #555;
	-webkit-transform: scaleX(0);
	transform: scaleX(0);
	-webkit-transform-origin: 50%;
	transform-origin: 50%;
	-webkit-transition-property: transform;
	transition-property: transform;
	-webkit-transition-duration: 0.3s;
	transition-duration: 0.3s;
	-webkit-transition-timing-function: ease-out;
	transition-timing-function: ease-out;
}

.hvr-shutter-out-horizontal:hover, .hvr-shutter-out-horizontal:focus,
	.hvr-shutter-out-horizontal:active {
	color: white;
	text-decoration: none;
}

.hvr-shutter-out-horizontal:hover:before, .hvr-shutter-out-horizontal:focus:before,
	.hvr-shutter-out-horizontal:active:before {
	-webkit-transform: scaleX(1);
	transform: scaleX(1);
}

.form-bg {
	background: #00b4ef;
}

.form-horizontal {
	background: #fff;
	padding-bottom: 40px;
	border-radius: 15px;
	text-align: center;
}

.form-horizontal .heading {
	display: block;
	font-size: 35px;
	font-weight: 700;
	padding: 35px 0;
	border-bottom: 1px solid #f0f0f0;
	margin-bottom: 30px;
}

.form-horizontal .form-group {
	padding: 0 40px;
	margin: 0 0 25px 0;
	position: relative;
}

.form-horizontal .form-control {
	background: #f0f0f0;
	border: none;
	border-radius: 20px;
	box-shadow: none;
	padding: 0 20px 0 45px;
	height: 40px;
	transition: all 0.3s ease 0s;
}

.form-horizontal .form-control:focus {
	background: #e0e0e0;
	box-shadow: none;
	outline: 0 none;
}

.form-horizontal .form-group i {
	position: absolute;
	top: 12px;
	left: 60px;
	font-size: 17px;
	color: #c8c8c8;
	transition: all 0.5s ease 0s;
}

.form-horizontal .form-control:focus+i {
	color: #00b4ef;
}

.form-horizontal .fa-question-circle {
	display: inline-block;
	position: absolute;
	top: 12px;
	right: 60px;
	font-size: 20px;
	color: #808080;
	transition: all 0.5s ease 0s;
}

.form-horizontal .fa-question-circle:hover {
	color: #000;
}

.form-horizontal .main-checkbox {
	float: left;
	width: 20px;
	height: 20px;
	background: #11a3fc;
	border-radius: 50%;
	position: relative;
	margin: 5px 0 0 5px;
	border: 1px solid #11a3fc;
}

.form-horizontal .main-checkbox label {
	width: 20px;
	height: 20px;
	position: absolute;
	top: 0;
	left: 0;
	cursor: pointer;
}

.form-horizontal .main-checkbox label:after {
	content: "";
	width: 10px;
	height: 5px;
	position: absolute;
	top: 5px;
	left: 4px;
	border: 3px solid #fff;
	border-top: none;
	border-right: none;
	background: transparent;
	opacity: 0;
	-webkit-transform: rotate(-45deg);
	transform: rotate(-45deg);
}

.form-horizontal .main-checkbox input[type=checkbox] {
	visibility: hidden;
}

.form-horizontal .main-checkbox input[type=checkbox]:checked+label:after
	{
	opacity: 1;
}

.form-horizontal .text {
	float: left;
	margin-left: 7px;
	line-height: 20px;
	padding-top: 5px;
	text-transform: capitalize;
}

.form-horizontal .btn {
	float: right;
	font-size: 14px;
	color: #fff;
	background: #00b4ef;
	border-radius: 30px;
	padding: 10px 25px;
	border: none;
	text-transform: capitalize;
	transition: all 0.5s ease 0s;
}

@media only screen and (max-width: 479px) {
	.form-horizontal .form-group {
		padding: 0 25px;
	}
	.form-horizontal .form-group i {
		left: 45px;
	}
	.form-horizontal .btn {
		padding: 10px 20px;
	}
}
</style>


<!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
<!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<!--注册栏内容  -->
	<div class="modal fade" id="modal-container-908379" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<form class="form-horizontal">
						<span class="heading">用户注册</span>
						<div class="form-group">
							<input type="email" class="form-control" id="inputEmail3"
								placeholder="邮箱"> <i class="fa fa-user"></i>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" id="inputEmail3"
								placeholder="验证码"> <i class="fa fa-user"></i>
						</div>
						<div class="form-group help">
							<input type="password" class="form-control" id="inputPassword3"
								placeholder="密　码"> <i class="fa fa-lock"></i> <a
								href="#" class="fa fa-question-circle"></a>
						</div>

						<div class="form-group">
							<button type="button" class="btn btn-default">发送验证码</button>
							<button type="submit" class="btn btn-default">注册</button>
						</div>
					</form>
				</div>
				<div class="modal-footer"></div>
			</div>

		</div>
	</div>
	<!--注册栏结束 -->



	<!-- 登陆栏 -->
	<div class="modal fade" id="modal-container-908378" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-body">
					<form class="form-horizontal">
						<span class="heading">用户登录</span>
						<div class="form-group">
							<input type="email" class="form-control" id="inputEmail3"
								placeholder="用户名或电子邮件"> <i class="fa fa-user"></i>
						</div>
						<div class="form-group help">
							<input type="password" class="form-control" id="inputPassword3"
								placeholder="密　码"> <i class="fa fa-lock"></i> <a
								href="#" class="fa fa-question-circle"></a>
						</div>
						<div class="form-group">
							<div class="main-checkbox">
								<input type="checkbox" value="None" id="checkbox1" name="check" />
								<label for="checkbox1"></label>
							</div>
							<span class="text">Remember me</span>
							<button type="submit" class="btn btn-default">登录</button>
						</div>
					</form>
				</div>
				<div class="modal-footer"></div>

			</div>

		</div>
	</div>
	<!--登陆栏结束 -->


	<div class="banner">
		<div class="container">
			<div class="banner_info">
				<h3>缘 来 是 "你"</h3>
				<a href="#modal-container-908379" data-toggle="modal"
					class="hvr-shutter-out-horizontal">注册</a> <a
					href="#modal-container-908378" data-toggle="modal"
					class="hvr-shutter-out-horizontal" style="margin-left: 30px;">登录</a>
			</div>
		</div>
	</div>
	<!-- /.container -->


	<!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
	<script src="dist/js/vendor/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="dist/js/vendor/video.js"></script>
	<script src="dist/js/flat-ui.min.js"></script>

</body>
</html>