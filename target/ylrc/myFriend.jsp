<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>myFriend</title>
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
		      
		            <li><a href="index.jsp">主页</a></li>
		            <li><a href="personalInfo.jsp">个人资料</a></li>
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
    </div> <!-- end navbar-inverse-blue -->
<!-- ============================  Navigation End ============================ -->
<div class="grid_3">
  <div class="container">
   <div class="breadcrumb1">
     <ul>
        <a href="index.html"><i class="fa fa-home home_1"></i></a>
        <span class="divider">&nbsp;|&nbsp;</span>
        <li class="current-page">My Friends</li>
     </ul>
   </div>

   <div class="col-md-9 members_box">
     <h1>Friends List</h1>
     <p>Here are XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</p>
       <div class="members_box1">
	     <div class="col_1_of_3 span_1_of_3  phone_1">
	      <ul class="phone">
	     	<li class="phone_left"><i class="fa fa-mobile icon_1"></i></li>
	     	<li class="phone_right"><p>Access Verified Mobile Numbers</p></li>
	     	<div class="clearfix"> </div>
	      </ul>
	     </div>
	     <div class="col_1_of_3 span_1_of_3 phone_1">
	      <ul class="phone">
	     	<li class="phone_left"><i class="fa fa-heart-o icon_2"></i></li>
	     	<li class="phone_right"><p>Access Verified Mobile Numbers</p></li>
	     	<div class="clearfix"> </div>
	      </ul>
	     </div>
	     <div class="col_1_of_3 span_1_of_3">
	      <ul class="phone">
	     	<li class="phone_left"><i class="fa fa-envelope-o icon_2"></i></li>
	     	<li class="phone_right"><p>Access Verified Mobile Numbers</p></li>
	     	<div class="clearfix"> </div>
	      </ul>
	     </div>
	     <div class="clearfix"> </div>
	   </div>
	   <div class="profile_top"><a href="view_profile.html">
      <h2>254879</h2>
	    <div class="col-sm-3 profile_left-top">
	    	<img src="images/a6.jpg" class="img-responsive" alt=""/>
	    </div>
	    <div class="col-sm-3">
	      <ul class="login_details1">
			 <li>Last Login : 5 days ago</li>
			 <li><p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor." More....</p></li>
		  </ul>
	    </div>
	    <div class="col-sm-6">
	    	<table class="table_working_hours">
	        	<tbody>
	        		<tr class="opened_1">
						<td class="day_label1">Age / Height :</td>
						<td class="day_value">28, 5ft 5in / 163cm</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Last Login :</td>
						<td class="day_value">4 hours ago</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Religion :</td>
						<td class="day_value">Sikh</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Marital Status :</td>
						<td class="day_value">Single</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Location :</td>
						<td class="day_value">India</td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Profile Created by :</td>
						<td class="day_value closed"><span>Self</span></td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Education :</td>
						<td class="day_value closed"><span>Engineering</span></td>
					</tr>
			    </tbody>
		   </table>
		   <div class="buttons">
			   <div class="vertical">Send Mail</div>
			   <div class="vertical">View dynamics</div>
			   <div class="vertical">Send Interest</div>
		   </div>
	    </div>
	    <div class="clearfix"> </div>
    </a></div>
    <div class="profile_top"><a href="view_profile.html">
      <h2>254879</h2>
	    <div class="col-sm-3 profile_left-top">
	    	<img src="images/a4.jpg" class="img-responsive" alt=""/>
	    </div>
	    <div class="col-sm-3">
	      <ul class="login_details1">
			 <li>Last Login : 5 days ago</li>
			 <li><p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor." More....</p></li>
		  </ul>
	    </div>
	    <div class="col-sm-6">
	    	<table class="table_working_hours">
	        	<tbody>
	        		<tr class="opened_1">
						<td class="day_label1">Age / Height :</td>
						<td class="day_value">28, 5ft 5in / 163cm</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Last Login :</td>
						<td class="day_value">4 hours ago</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Religion :</td>
						<td class="day_value">Sikh</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Marital Status :</td>
						<td class="day_value">Single</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Location :</td>
						<td class="day_value">India</td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Profile Created by :</td>
						<td class="day_value closed"><span>Self</span></td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Education :</td>
						<td class="day_value closed"><span>Engineering</span></td>
					</tr>
			    </tbody>
		   </table>
		   <div class="buttons">
			   <div class="vertical">Send Mail</div>
			   <div class="vertical">View dynamics</div>
			   <div class="vertical">Send Interest</div>
		   </div>
	    </div>
	    <div class="clearfix"> </div>
    </a></div>
    <div class="profile_top"><a href="view_profile.html">
      <h2>254879</h2>
	    <div class="col-sm-3 profile_left-top">
	    	<img src="images/a5.jpg" class="img-responsive" alt=""/>
	    </div>
	    <div class="col-sm-3">
	      <ul class="login_details1">
			 <li>Last Login : 5 days ago</li>
			 <li><p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor." More....</p></li>
		  </ul>
	    </div>
	    <div class="col-sm-6">
	    	<table class="table_working_hours">
	        	<tbody>
	        		<tr class="opened_1">
						<td class="day_label1">Age / Height :</td>
						<td class="day_value">28, 5ft 5in / 163cm</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Last Login :</td>
						<td class="day_value">4 hours ago</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Religion :</td>
						<td class="day_value">Sikh</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Marital Status :</td>
						<td class="day_value">Single</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Location :</td>
						<td class="day_value">India</td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Profile Created by :</td>
						<td class="day_value closed"><span>Self</span></td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Education :</td>
						<td class="day_value closed"><span>Engineering</span></td>
					</tr>
			    </tbody>
		   </table>
		   <div class="buttons">
			   <div class="vertical">Send Mail</div>
			   <div class="vertical">View dynamics</div>
			   <div class="vertical">Send Interest</div>
		   </div>
	    </div>
	    <div class="clearfix"> </div>
    </a></div>
    <div class="profile_top profile_top1"><a href="view_profile.html">
      <h2>254879</h2>
	    <div class="col-sm-3 profile_left-top">
	    	<img src="images/a7.jpg" class="img-responsive" alt=""/>
	    </div>
	    <div class="col-sm-3">
	      <ul class="login_details1">
			 <li>Last Login : 5 days ago</li>
			 <li><p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor." More....</p></li>
		  </ul>
	    </div>
	    <div class="col-sm-6">
	    	<table class="table_working_hours">
	        	<tbody>
	        		<tr class="opened_1">
						<td class="day_label1">Age / Height :</td>
						<td class="day_value">28, 5ft 5in / 163cm</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Last Login :</td>
						<td class="day_value">4 hours ago</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Religion :</td>
						<td class="day_value">Sikh</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Marital Status :</td>
						<td class="day_value">Single</td>
					</tr>
				    <tr class="opened">
						<td class="day_label1">Location :</td>
						<td class="day_value">India</td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Profile Created by :</td>
						<td class="day_value closed"><span>Self</span></td>
					</tr>
				    <tr class="closed">
						<td class="day_label1">Education :</td>
						<td class="day_value closed"><span>Engineering</span></td>
					</tr>
			    </tbody>
		   </table>
		   <div class="buttons">
			   <div class="vertical">Send Mail</div>
			   <div class="vertical">View dynamics</div>
			   <div class="vertical">Send Interest</div>
		   </div>
	    </div>
	    <div class="clearfix"> </div>
    </a></div>
   </div>
   <div class="clearfix"> </div>
  </div>
</div>
<div class="map">
	<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978"> </iframe>
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
</body>
</html>