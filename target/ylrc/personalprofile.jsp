<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>个人简介</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- Custom Theme files -->
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link href='https://fonts.googleapis.com/css?family=Oswald:300,400,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>
    <!----font-Awesome----->
    <link href="css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="css/select2.min.css" type="text/css" />
    <script type="text/javascript" src="js/select2.min.js"></script>
    <!----font-Awesome----->
    <script>
        $(document).ready(function(){
            $(".dropdown").hover(
                function() {
                    $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
                    $(this).toggleClass('open');
                },
                function() {
                    $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
                    $(this).toggleClass('open');
                }
            );
            var sexori = ${user.userSexOri};

            var sexoris = new Array("","想约个帅哥", "想聊个妹子", "帅哥美女都是我的菜", "目前只想交个朋友");

            for (i = 1; i < 5; i++) {
                if (sexori == i) {
                    $("#sexori").val(sexoris[i]);
                }
            }

            var salary = ${user.userSalary};

            var salarys = new Array("","小于3000", "3000-5000", "5000-10000", "10000-50000", "大于50000");

            for ( j= 1; j < 6; j++) {
                if (salary == j) {
                    $("#salary").val(salarys[j]);
                }
            }
        });

    </script>
</head>
<body>
<!-- ============================  Navigation Start =========================== -->
<div class="navbar navbar-inverse-blue navbar">
    <!--<div class="navbar navbar-inverse-blue navbar-fixed-top">-->
    <div class="navbar-inner" style="background:#ff8888; color:#ff8888">
        <div class="container"  >
            <div class="navigation">
                <nav id="colorNav">
                    <ul>
                        <li class="green">
                            <a href="#" class="icon-home"></a>
                            <ul>
                                <li><a href="/login">注册新账号</a></li>
                                <li><a href="/login">退出</a></li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
            <a class="brand" href="index.jsp"><img src="images/t1.png" alt="logo"></a>
            <div class="pull-right">
                <nav class="navbar nav_bottom" role="navigation">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header nav_2">
                        <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">Menu
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"></a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                        <ul class="nav navbar-nav nav_1">

                            <li><a href="/index">主页</a></li>
                            <li><a href="/personalInfo">个人资料</a></li>
                            <li><a href="myFriend.jsp">我的好友</a></li>
                            <li><a href="watchTV.jsp">观看直播</a></li>
                            <li class="last"><a href="aboutUs.jsp">关于我们</a></li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </nav>
            </div> <!-- end pull-right -->
            <div class="clearfix"> </div>
        </div> <!-- end container -->
    </div> <!-- end navbar-inner -->

    <div class="grid_3">
        <div class="container">
            <div class="breadcrumb1">
                <ul>
                    <a href="index.jsp"><i class="fa fa-home home_1"></i></a>
                    <span class="divider">&nbsp;|&nbsp;</span>
                    <li class="current-page">Information</li>
                </ul>
            </div>
            <div class="services">
                <div class="col-sm-6 login_left">
                    <form method="post" action="infoSave" id="infoForm" name="infoForm">
                        <div class="form-group">
                            <label for="edit-name">昵称 <span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="editName" name="editName"  value="${user.userNickName}" size="60" maxlength="60" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">性别<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="sex" name="height" value="${user.userSex}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">性取向<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="sexori" name="height" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">出生日期<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="birthday" name="weight" value= "${user.userBirthday}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">身高<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="height" name="height" value="${user.userHeight}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">体重(kg)<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="weight" name="weight" value="${user.userWeight}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">所在地区<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="region" name="weight" value="${user.userAddress}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">血型<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="bloodType" name="weight" value="${user.userBloodType}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">职业<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="job" name="weight" value="${user.userJob}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">薪资<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="salary" name="weight"  size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">兴趣<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="hobby" name="weight" value="${user.userHobby}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">他（她）的个性<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="myLabel" name="weight" value="${user.userLabel}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">他（她）喜欢的类型<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="hopeLabel" name="weight" value="${user.userHopeLabel}" size="20" maxlength="20" class="form-text required">
                        </div>
                        <div class="form-group">
                            <label for="edit-name">他（她）的格言<span class="form-required" title="This field is required.">*</span></label>
                            <input type="text" id="introductory" name="weight" value="${user.userIntroduction}" size="20" maxlength="20" class="form-text required">
                        </div>
                    </form>
                </div>
                <div class="col-sm-4 row_2" style="margin-left:150px;">
                    <div> <label for="edit-name">他（她）的生活照<span class="form-required" title="This field is required.">*</span></label></div>
                    <br/>
                    <div class="flexslider">
                        <ul class="slides">
                            <li data-thumb="images/p1.jpg">
                                <img src="images/p1.jpg" />
                            </li>
                            <li data-thumb="images/p2.jpg">
                                <img src="images/p2.jpg" />
                            </li>
                            <li data-thumb="images/p3.jpg">
                                <img src="images/p3.jpg" />
                            </li>
                            <li data-thumb="images/p4.jpg">
                                <img src="images/p4.jpg" />
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
    <div class="footer">
        <div class="container">
            <div class="col-md-4 col_2">
                <h4>About Us</h4>
                <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris."</p>
            </div>
            <div class="col-md-2 col_2">
                <h4>Help & Support</h4>
                <ul class="footer_links">
                    <li><a href="#">24x7 Live help</a></li>
                    <li><a href="contact.html">Contact us</a></li>
                    <li><a href="#">Feedback</a></li>
                    <li><a href="faq.html">FAQs</a></li>
                </ul>
            </div>
            <div class="col-md-2 col_2">
                <h4>Quick Links</h4>
                <ul class="footer_links">
                    <li><a href="privacy.html">Privacy Policy</a></li>
                    <li><a href="terms.html">Terms and Conditions</a></li>
                    <li><a href="services.html">Services</a></li>
                </ul>
            </div>
            <div class="col-md-2 col_2">
                <h4>Social</h4>
                <ul class="footer_social">
                    <li><a href="#"><i class="fa fa-facebook fa1"> </i></a></li>
                    <li><a href="#"><i class="fa fa-twitter fa1"> </i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus fa1"> </i></a></li>
                    <li><a href="#"><i class="fa fa-youtube fa1"> </i></a></li>
                </ul>
            </div>
            <div class="clearfix"> </div>
            <div class="copy">
                <p>赵磊工作室 &copy; 2017.SKY Fuckers.<a target="_blank" href="">了解赵磊;</a></p>
            </div>
        </div>
    </div>

    <!-- FlexSlider -->
    <script defer src="js/jquery.flexslider.js"></script>
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    <script>
        // Can also be used with $(document).ready()
        $(window).load(function() {
            $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
            });
        });
    </script>

    <script type="text/javascript">
        $("#hobby").select2({
            tags: true,
            maximumSelectionLength: 4  //最多能够选择的个数
        });
        $("#myLabel").select2({
            tags: true,
            maximumSelectionLength: 5  //最多能够选择的个数
        });
        $("#hopeLabel").select2({
            tags: true,
            maximumSelectionLength: 5  //最多能够选择的个数
        });
    </script>
</body>
</html>