<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css'/>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- Custom Theme files -->
    <link href="css/style.css" rel='stylesheet' type='text/css'/>
    <link href='https://fonts.googleapis.com/css?family=Oswald:300,400,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>
    <!----font-Awesome----->
    <link href="css/font-awesome.css" rel="stylesheet">
    <!----font-Awesome----->
    <script>
        $(document).ready(function () {

            $(".dropdown").hover(
                function () {
                    $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                    $(this).toggleClass('open');
                },
                function () {
                    $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                    $(this).toggleClass('open');
                }
            );
            var img = "${userInfo.userImg}";
            //alert("${userInfo.userImg}");
            if (img == "" || img == null) {
                $("#imgDiv").hide();
            } else {
                $("#userImg").attr('src', img);
                $("#userImg").attr('width', '50px');
                $("#userImg").attr('height', '50px');
            }
            // $("#imgDiv").hide();
            //}else{
            // $("#userImg").attr('src',img);
            // $("#userImg").attr('width','100px');
            // $("#userImg").attr('height','100px');
            //$("#imgDiv").show();
//  }

        });
    </script>
</head>
<body>
<!-- ============================  Navigation Start =========================== -->
<div class="navbar navbar-inverse-blue navbar">
    <!--<div class="navbar navbar-inverse-blue navbar-fixed-top">-->
    <div class="navbar-inner" style="background:#ff8888; color:#ff8888">
        <div class="container">
            <div class="navigation">
                <nav id="colorNav">
                    <ul>
                        <li class="green">
                            <a href="#" class="icon-home"></a>
                            <ul>
                                <li><a href="login.jsp">注册新账号</a></li>
                                <li><a href="login.jsp">退出</a></li>
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
                        <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse"
                                data-target="#bs-megadropdown-tabs">Menu
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

                            <li><a href="index.jsp">主页</a></li>
                            <li><a href="userInfoControl">个人资料</a></li>
                            <li><a href="myFriend.jsp">我的好友</a></li>

                            <li><a href="watchTV.jsp">观看直播</a></li>
                            <li><a href="aboutUs.jsp">关于我们</a></li>

                            <li>
                                <div id="imgDiv" style="width:50px; height:50px; border-radius:50%; overflow:hidden;">
                                    <a href="userInfoControl"><img id="userImg"/></a></div>
                            </li>
                            <%--<li><a href="userInfoControl" style="font-size: 12px">${userInfo.userNickName}</a></li>--%>
                        </ul>
                        <%--<div id="imgDiv"style="border-radius:50%;width: 40px;height: 40px">--%>
                        <%--<img id="userImg"  />--%>
                        <%--</div>--%>
                    </div><!-- /.navbar-collapse -->
                </nav>
            </div> <!-- end pull-right -->
            <div class="clearfix"></div>
        </div> <!-- end container -->
    </div> <!-- end navbar-inner -->
</div> <!-- end navbar-inverse-blue -->
<!-- ============================  Navigation End ============================ -->
<div class="banner">
    <div class="container">
        <div class="banner_info">
            <h3>缘来如此</h3>
            <a href="" class="hvr-shutter-out-horizontal" style="background:#ff8888">开启直播！</a>
        </div>
    </div>
    <div class="profile_search">
        <div class="container wrap_1">
            <form method="get" action="othersInfo">
                <div class="search_top">
                    <div class="inline-block">
                        <label class="gender_1">我想要找这样的他（她） :</label>
                        <div class="age_box1" style="max-width: 100%; display: inline-block;">
                            <select id="sexwanted" name="sexwanted">
                                <option value="男">男性</option>
                                <option value="女">女性</option>
                            </select>
                        </div>
                    </div>
                    <div class="inline-block">
                        <label class="gender_1">他（她）应该住在这里 :</label>
                        <div class="age_box1" style="max-width: 100%; display: inline-block;">
                            <select id="locationwanted" name="locationwanted">
                                <option value="北京市昌平区">北京市昌平区</option>
                                <option value="北京市海淀区">北京市海淀区</option>
                                <option value="北京市东城区">北京市东城区</option>
                                <option value="北京市西城区">北京市西城区</option>
                                <option value="北京市丰台区">北京市丰台区</option>
                                <option value="北京市崇文区">北京市崇文区</option>
                                <option value="北京市大兴区">北京市大兴区</option>
                                <option value="北京市朝阳区">北京市朝阳区</option>
                                <option value="北京市宣武区">北京市宣武区</option>
                                <option value="北京市石景山区">北京市石景山区</option>
                                <option value="北京市延庆县">北京市延庆县</option>
                                <option value="北京市房山区">北京市房山区</option>
                            </select>
                        </div>
                    </div>
                    <div class="inline-block">
                        <label class="gender_1">我希望他（她）是一名</label>
                        <div class="age_box1" style="max-width: 100%; display: inline-block;">
                            <select id="jobwanted" name="jobwanted">
                                <option value="1">工人</option>
                                <option value="2">教师</option>
                                <option value="3">记者</option>
                                <option value="4">艺人</option>
                                <option value="5">厨师</option>
                                <option value="6">医生</option>
                                <option value="7">军人</option>
                                <option value="8">律师</option>
                                <option value="9">会计</option>
                                <option value="10">经商</option>
                                <option value="11">作家</option>
                                <option value="12">导游</option>
                                <option value="13">画家</option>
                                <option value="14">警察</option>
                                <option value="15">公务员</option>
                                <option value="16">运动员</option>
                                <option value="17">科学家</option>
                                <option value="18">工程师</option>
                                <option value="19">翻译</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="inline-block">
                    <label class="gender_1">我最希望我们的共同兴趣爱好是</label>
                    <div class="age_box1" style="max-width: 100%; display: inline-block;">
                        <select id="hobbywanted" name="hobbywanted">
                            <option value="">* 请选择爱好</option>
                            <option value="1">读书</option>
                            <option value="2">绘画</option>
                            <option value="3">书法</option>
                            <option value="4">乐器</option>
                            <option value="5">篮球</option>
                            <option value="6">足球</option>
                            <option value="7">健身</option>
                            <option value="8">跑步</option>
                            <option value="9">户外运动</option>
                            <option value="10">美食</option>
                            <option value="11">旅游</option>
                            <option value="12">音乐</option>
                            <option value="13">饮茶</option>
                            <option value="14">影视剧</option>
                            <option value="15">戏剧</option>
                            <option value="16">文学</option>
                            <option value="17">哲学</option>
                            <option value="18">睡觉</option>
                            <option value="19">游戏</option>
                            <option value="20">美术</option>
                        </select>
                    </div>
                </div>
                <div class="inline-block">
                    <label class="gender_1">他（她）的工资范围</label>
                    <div class="age_box1" style="max-width: 100%; display: inline-block;">
                        <select id="salarywanted" name="salarywanted">
                            <option value="">* 薪资</option>
                            <option value="1">小于3000</option>
                            <option value="2">3000-5000</option>
                            <option value="3">5000-10000</option>
                            <option value="4">10000-50000</option>
                            <option value="5">大于50000</option>
                        </select>
                    </div>
                </div>
                <div class="submit inline-block">
                    <input id="submit-btn" class="hvr-wobble-vertical" type="submit" value="Find Matches">
                </div>
            </form>
        </div>
    </div>
</div>

<div class="grid_1">
    <div class="container">
        <h1>你可能感兴趣的朋友</h1>
        <div class="heart-divider">
            <span class="grey-line"></span>
            <i class="fa fa-heart pink-heart"></i>
            <i class="fa fa-heart grey-heart"></i>
            <span class="grey-line"></span>
        </div>
        <ul id="flexiselDemo3">

            <c:forEach items="${userList}" var="user">
                <li>
                    <div class="col_1"><a href="personal/${user.userId}">
                        <img src="images/1.jpg" alt="" class="hover-animation image-zoom-in img-responsive"/>
                        <div class="layer m_1 hidden-link hover-animation delay1 fade-in">
                            <div class="center-middle">About Him Or Her</div>
                        </div>
                        <h3><span
                                class="m_3">Profile ID :${user.userId}</span><br>${user.userTrusName}<br>${user.userAddress}
                        </h3></a></div>
                </li>
            </c:forEach>

            <%--<li><div class="col_1"><a href="view_profile.html">--%>
            <%--<img src="images/2.jpg" alt="" class="hover-animation image-zoom-in img-responsive"/>--%>
            <%--<div class="layer m_1 hidden-link hover-animation delay1 fade-in">--%>
            <%--<div class="center-middle">About Her</div>--%>
            <%--</div>--%>
            <%--<h3><span class="m_3">Profile ID : MI-387412</span><br>28, Christian, Australia<br>Corporate</h3></a></div>--%>
            <%--</li>--%>
            <%--<li><div class="col_1"><a href="view_profile.html">--%>
            <%--<img src="images/3.jpg" alt="" class="hover-animation image-zoom-in img-responsive"/>--%>
            <%--<div class="layer m_1 hidden-link hover-animation delay1 fade-in">--%>
            <%--<div class="center-middle">About Him</div>--%>
            <%--</div>--%>
            <%--<h3><span class="m_3">Profile ID : MI-387412</span><br>28, Christian, Australia<br>Corporate</h3></a></div>--%>
            <%--</li>--%>
            <%--<li><div class="col_1"><a href="view_profile.html">--%>
            <%--<img src="images/4.jpg" alt="" class="hover-animation image-zoom-in img-responsive"/>--%>
            <%--<div class="layer m_1 hidden-link hover-animation delay1 fade-in">--%>
            <%--<div class="center-middle">About Her</div>--%>
            <%--</div>--%>
            <%--<h3><span class="m_3">Profile ID : MI-387412</span><br>28, Christian, Australia<br>Corporate</h3></a></div>--%>
            <%--</li>--%>
            <%--<li><div class="col_1"><a href="view_profile.html">--%>
            <%--<img src="images/5.jpg" alt="" class="hover-animation image-zoom-in img-responsive"/>--%>
            <%--<div class="layer m_1 hidden-link hover-animation delay1 fade-in">--%>
            <%--<div class="center-middle">About Him</div>--%>
            <%--</div>--%>
            <%--<h3><span class="m_3">Profile ID : MI-387412</span><br>28, Christian, Australia<br>Corporate</h3></a></div>--%>
            <%--</li>--%>
            <%--<li><div class="col_1"><a href="view_profile.html">--%>
            <%--<img src="images/6.jpg" alt="" class="hover-animation image-zoom-in img-responsive"/>--%>
            <%--<div class="layer m_1 hidden-link hover-animation delay1 fade-in">--%>
            <%--<div class="center-middle">About Her</div>--%>
            <%--</div>--%>
            <%--<h3><span class="m_3">Profile ID : MI-387412</span><br>28, Christian, Australia<br>Corporate</h3></a></div>--%>
            <%--</li>--%>
        </ul>
        <script type="text/javascript">
            $(window).load(function () {
                $("#flexiselDemo3").flexisel({
                    visibleItems: 6,
                    animationSpeed: 1000,
                    autoPlay: false,
                    autoPlaySpeed: 3000,
                    pauseOnHover: true,
                    enableResponsiveBreakpoints: true,
                    responsiveBreakpoints: {
                        portrait: {
                            changePoint: 480,
                            visibleItems: 1
                        },
                        landscape: {
                            changePoint: 640,
                            visibleItems: 2
                        },
                        tablet: {
                            changePoint: 768,
                            visibleItems: 3
                        }
                    }
                });

            });
        </script>
        <script type="text/javascript" src="js/jquery.flexisel.js"></script>
    </div>
</div>
<div class="grid_2">
    <div class="container">
        <h2>好友动态</h2>
        <div class="heart-divider">
            <span class="grey-line"></span>
            <i class="fa fa-heart pink-heart"></i>
            <i class="fa fa-heart grey-heart"></i>
            <span class="grey-line"></span>
        </div>
        <div class="row_1">
            <div class="col-md-8 suceess_story">
                <ul>
                    <li>
                        <div class="suceess_story-date">
                            <span class="entry-1">Dec 20, 2015</span>
                        </div>
                        <div class="suceess_story-content-container">
                            <figure class="suceess_story-content-featured-image">
                                <img width="75" height="75" src="images/7.jpg" class="img-responsive" alt=""/>
                            </figure>
                            <div class="suceess_story-content-info">
                                <h4><a href="#">Lorem & Ipsum</a></h4>
                                <p>There are many variations of passages of Lorem Ipsum available, but the majority have
                                    suffered alteration in some form,.<a href="#">More...</a></p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="suceess_story-date">
                            <span class="entry-1">Dec 20, 2015</span>
                        </div>
                        <div class="suceess_story-content-container">
                            <figure class="suceess_story-content-featured-image">
                                <img width="75" height="75" src="images/8.jpg" class="img-responsive" alt=""/>
                            </figure>
                            <div class="suceess_story-content-info">
                                <h4><a href="#">Lorem & Ipsum</a></h4>
                                <p>There are many variations of passages of Lorem Ipsum available, but the majority have
                                    suffered alteration in some form,.<a href="#">More...</a></p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="suceess_story-date">
                            <span class="entry-1">Dec 20, 2015</span>
                        </div>
                        <div class="suceess_story-content-container">
                            <figure class="suceess_story-content-featured-image">
                                <img width="75" height="75" src="images/9.jpg" class="img-responsive" alt=""/>
                            </figure>
                            <div class="suceess_story-content-info">
                                <h4><a href="#">Lorem & Ipsum</a></h4>
                                <p>There are many variations of passages of Lorem Ipsum available, but the majority have
                                    suffered alteration in some form,.<a href="#">More...</a></p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="suceess_story-date">
                            <span class="entry-1">Dec 20, 2015</span>
                        </div>
                        <div class="suceess_story-content-container">
                            <figure class="suceess_story-content-featured-image">
                                <img width="75" height="75" src="images/10.jpg" class="img-responsive" alt=""/>
                            </figure>
                            <div class="suceess_story-content-info">
                                <h4><a href="#">Lorem & Ipsum</a></h4>
                                <p>There are many variations of passages of Lorem Ipsum available, but the majority have
                                    suffered alteration in some form,.<a href="#">More...</a></p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="suceess_story-date">
                            <span class="entry-1">Dec 20, 2015</span>
                        </div>
                        <div class="suceess_story-content-container">
                            <figure class="suceess_story-content-featured-image">
                                <img width="75" height="75" src="images/11.jpg" class="img-responsive" alt=""/>
                            </figure>
                            <div class="suceess_story-content-info">
                                <h4><a href="#">Lorem & Ipsum</a></h4>
                                <p>There are many variations of passages of Lorem Ipsum available, but the majority have
                                    suffered alteration in some form,.<a href="#">More...</a></p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="suceess_story-date">
                            <span class="entry-1">Dec 20, 2015</span>
                        </div>
                        <div class="suceess_story-content-container">
                            <figure class="suceess_story-content-featured-image">
                                <img width="75" height="75" src="images/12.jpg" class="img-responsive" alt=""/>
                            </figure>
                            <div class="suceess_story-content-info">
                                <h4><a href="#">Lorem & Ipsum</a></h4>
                                <p>There are many variations of passages of Lorem Ipsum available, but the majority have
                                    suffered alteration in some form,.<a href="#">More...</a></p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="suceess_story-date">
                            <span class="entry-1">Dec 20, 2015</span>
                        </div>
                        <div class="suceess_story-content-container">
                            <figure class="suceess_story-content-featured-image">
                                <img width="75" height="75" src="images/13.jpg" class="img-responsive" alt=""/>
                            </figure>
                            <div class="suceess_story-content-info">
                                <h4><a href="#">Lorem & Ipsum</a></h4>
                                <p>There are many variations of passages of Lorem Ipsum available, but the majority have
                                    suffered alteration in some form,.<a href="#">More...</a></p>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="col-md-4 row_1-right">
                <h3>News & Events</h3>
                <div class="box_1">
                    <figure class="thumbnail1"><img width="170" height="155" src="images/14.jpg" class="img-responsive"
                                                    alt=""/></figure>
                    <div class="extra-wrap">
                        <div class="post-meta">
					<span class="day">
					<time datetime="2014-05-25T10:15:43+00:00">25</time>
					</span>
                            <span class="month">
					<time datetime="2014-05-25T10:11:51+00:00">May</time>
					</span>
                        </div>
                        <h4 class="post-title"><a href="#">There are many variations of passages</a></h4>
                        <div class="clearfix"></div>
                        <div class="post-content">The standard chunk of Lorem Ipsum used since the 1500s..</div>
                        <a href="#" class="vertical">Read More</a>
                    </div>
                </div>
                <div class="box_1">
                    <figure class="thumbnail1"><img width="170" height="155" src="images/15.jpg" class="img-responsive"
                                                    alt=""/></figure>
                    <div class="extra-wrap">
                        <div class="post-meta">
					<span class="day">
					<time datetime="2014-05-25T10:15:43+00:00">25</time>
					</span>
                            <span class="month">
					<time datetime="2014-05-25T10:11:51+00:00">May</time>
					</span>
                        </div>
                        <h4 class="post-title"><a href="#">There are many variations of passages</a></h4>
                        <div class="clearfix"></div>
                        <div class="post-content">The standard chunk of Lorem Ipsum used since the 1500s..</div>
                        <a href="#" class="vertical">Read More</a>
                    </div>
                </div>
                <div class="box_2">
                    <figure class="thumbnail1"><img width="170" height="155" src="images/1.jpg" class="img-responsive"
                                                    alt=""/></figure>
                    <div class="extra-wrap">
                        <div class="post-meta">
					<span class="day">
					<time datetime="2014-05-25T10:15:43+00:00">25</time>
					</span>
                            <span class="month">
					<time datetime="2014-05-25T10:11:51+00:00">May</time>
					</span>
                        </div>
                        <h4 class="post-title"><a href="#">There are many variations of passages</a></h4>
                        <div class="clearfix"></div>
                        <div class="post-content">The standard chunk of Lorem Ipsum used since the 1500s..</div>
                        <a href="#" class="vertical">Read More</a>
                    </div>
                </div>
                <div class="religion">
                    <div class="religion_1-title">Religion :</div>
                    <a href="#" target="_blank" class="religion_1" title="Hindu Matrimonial"
                       style="padding-left:0px !important;">Hindu</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Muslim Matrimonial">Muslim</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1"
                                     title="Christian Matrimonial">Christian</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Sikh Matrimonial">Sikh</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Inter Religion Matrimonial">Inter
                    Religion</a>
                </div>
                <div class="religion">
                    <div class="religion_1-title">Country :</div>
                    <a href="#" target="_blank" class="religion_1" title="Hindu Matrimonial"
                       style="padding-left:0px !important;">India</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1"
                                     title="Muslim Matrimonial">Australia</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1"
                                     title="Christian Matrimonial">Russia</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Sikh Matrimonial">India</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Inter Religion Matrimonial">Kuwait</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1"
                                     title="Inter Religion Matrimonial">Uk</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Inter Religion Matrimonial">View
                    All</a>
                </div>
                <div class="religion">
                    <div class="religion_1-title">Caste :</div>
                    <a href="#" target="_blank" class="religion_1" title="Hindu Matrimonial"
                       style="padding-left:0px !important;">Brahmin</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Muslim Matrimonial">Kapu</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Christian Matrimonial">Kamma</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Sikh Matrimonial">Padmasali</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Inter Religion Matrimonial">Reddy</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Inter Religion Matrimonial">View
                    All</a>
                </div>
                <div class="religion">
                    <div class="religion_1-title">Regional :</div>
                    <a href="#" target="_blank" class="religion_1" title="Hindu Matrimonial"
                       style="padding-left:0px !important;">Urdu</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Muslim Matrimonial">Hindi</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1"
                                     title="Christian Matrimonial">Telugu</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Sikh Matrimonial">Marwadi</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Inter Religion Matrimonial">Oriya</a>
                    <span>|</span><a href="#" target="_blank" class="religion_1" title="Inter Religion Matrimonial">View
                    All</a>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<div class="bg">
    <div class="container">
        <h3>这里可以放一些用户感兴趣的东西 </h3>
        <div class="heart-divider">
            <span class="grey-line"></span>
            <i class="fa fa-heart pink-heart"></i>
            <i class="fa fa-heart grey-heart"></i>
            <span class="grey-line"></span>
        </div>
        <div class="col-sm-6">
            <div class="bg_left">
                <h4>But I must explain</h4>
                <h5>Friend of Bride</h5>
                <p>"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium,
                    totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae
                    dicta sunt explicabo.</p>
                <ul class="team-socials">
                    <li><a href="#"><span class="icon-social "><i class="fa fa-facebook"></i></span></a></li>
                    <li><a href="#"><span class="icon-social "><i class="fa fa-twitter"></i></span></a></li>
                    <li><a href="#"><span class="icon-social"><i class="fa fa-google-plus"></i></span></a></li>
                </ul>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="bg_left">
                <h4>But I must explain</h4>
                <h5>Friend of Groom</h5>
                <p>"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium,
                    totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae
                    dicta sunt explicabo.</p>
                <ul class="team-socials">
                    <li><a href="#"><span class="icon-social "><i class="fa fa-facebook"></i></span></a></li>
                    <li><a href="#"><span class="icon-social "><i class="fa fa-twitter"></i></span></a></li>
                    <li><a href="#"><span class="icon-social"><i class="fa fa-google-plus"></i></span></a></li>
                </ul>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<div class="footer">
    <div class="container">
        <div class="col-md-4 col_2">
            <h4>About Us</h4>
            <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et
                dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris."</p>
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
        <div class="clearfix"></div>
        <div class="copy">
            <p>赵磊工作室 &copy; 2017.SKY Fuckers.<a target="_blank" href="">了解赵磊;</a></p>
        </div>
    </div>
</div>
</body>
</html>