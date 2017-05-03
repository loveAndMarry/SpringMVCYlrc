<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Information</title>
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
	     <form>
	  	    <div class="form-group">
		      <label for="edit-name">真实姓名 <span class="form-required" title="This field is required.">*</span></label>
		      <input type="text" id="trueName" name="trueName" value="" size="60" maxlength="60" class="form-text required">
		    </div>
		    <div class="form-group">
		      <label for="edit-name">昵称 <span class="form-required" title="This field is required.">*</span></label>
		      <input type="text" id="editName" name="editName" value="" size="60" maxlength="60" class="form-text required">
		    </div>
		   <div class="form-group">
		      <label for="edit-name">手机 <span class="form-required" title="This field is required.">*</span></label>
		      <input type="text" id="phone" name="phone" value="" size="60" maxlength="60" class="form-text required">
		    </div>
		    
		    <div class="form-group">
		      <label for="edit-name">身高 <span class="form-required" title="This field is required.">*</span></label>
		      <input type="text" id="height" name="height" value="" size="20" maxlength="20" class="form-text required">
		    </div>
		    <div class="form-group">
		      <label for="edit-name">体重<span class="form-required" title="This field is required.">*</span></label>
		      <input type="text" id="weight" name="weight" value="" size="20" maxlength="20" class="form-text required">
		    </div>
		    <div class="age_select">
		    <label for="edit-pass">所在地区<span class="form-required" title="This field is required.">*</span></label>
		   		        <div class="age_grid">
		         <div class="col-sm-4 form_box">
                  <div class="select-block1">
                    <select id="province">	
	                    <option value="">北京</option>
	                   
                    </select>
                  </div>
            </div>
            <div class="col-sm-4 form_box2">
                   <div class="select-block1">
                    <select id="area">
	                    <option value="">海淀区</option>
	                    <option value="1">朝阳区</option>
	                    <option value="2">东城区</option>
	                    <option value="3">西城区</option>
	                    <option value="4">。。。</option>
	                    <option value="5">。。。</option>
	                    <option value="6">。。。</option>
	                    <option value="7">。。。</option>
	                    <option value="8">。。。</option>
	                    <option value="9">。。。</option>
	                    <option value="10">。。。</option>
	                    <option value="11">。。。</option>
	                    <option value="12">。。。</option>
                    </select>
                  </div>
                 </div>
                 <div class="col-sm-4 form_box1">
                   <div class="select-block1">
                    <select id="street">
	                    <option value="">南阳路</option>
	                    <option value="1980">和风路</option>
	                    <option value="1981">。。。</option>
	                    <option value="1982">。。。</option>
	                    <option value="1983">。。。</option>
	                    <option value="1984">。。。</option>

                    </select>
                   </div>
                  </div>
                  <div class="clearfix"> </div>
                 </div>
		    </div>
		    <div class="age_select">
		      <label for="edit-pass">出生日期<span class="form-required" title="This field is required.">*</span></label>
		        <div class="age_grid">
		         <div class="col-sm-4 form_box">
                  <div class="select-block1">
                    <select id="date">	
	                    <option value="">Date</option>
	                    <option value="1">1</option>
	                    <option value="2">2</option>
	                    <option value="3">3</option>
	                    <option value="4">4</option>
	                    <option value="5">5</option>
	                    <option value="6">6</option>
	                    <option value="7">7</option>
	                    <option value="8">8</option>
	                    <option value="9">9</option>
	                    <option value="10">10</option>
	                    <option value="11">11</option>
	                    <option value="12">12</option>
	                    <option value="13">13</option>
	                    <option value="14">14</option>
	                    <option value="15">15</option>
	                    <option value="16">16</option>
	                    <option value="17">17</option>
	                    <option value="18">18</option>
	                    <option value="19">19</option>
	                    <option value="20">20</option>
	                    <option value="21">21</option>
	                    <option value="22">22</option>
	                    <option value="23">23</option>
	                    <option value="24">24</option>
	                    <option value="25">25</option>
	                    <option value="26">26</option>
	                    <option value="27">27</option>
	                    <option value="28">28</option>
	                    <option value="29">29</option>
	                    <option value="30">30</option>
	                    <option value="31">31</option>
                    </select>
                  </div>
            </div>
            <div class="col-sm-4 form_box2">
                   <div class="select-block1">
                    <select id="month">
	                    <option value="">Month</option>
	                    <option value="1">January</option>
	                    <option value="2">February</option>
	                    <option value="3">March</option>
	                    <option value="4">April</option>
	                    <option value="5">May</option>
	                    <option value="6">June</option>
	                    <option value="7">July</option>
	                    <option value="8">August</option>
	                    <option value="9">September</option>
	                    <option value="10">October</option>
	                    <option value="11">November</option>
	                    <option value="12">December</option>
                    </select>
                  </div>
                 </div>
                 <div class="col-sm-4 form_box1">
                   <div class="select-block1">
                    <select id="year">
	                    <option value="">Year</option>
	                    <option value="1980">1980</option>
	                    <option value="1981">1981</option>
	                    <option value="1982">1982</option>
	                    <option value="1983">1983</option>
	                    <option value="1984">1984</option>
	                    <option value="1985">1985</option>
	                    <option value="1986">1986</option>
	                    <option value="1987">1987</option>
	                    <option value="1988">1988</option>
	                    <option value="1989">1989</option>
	                    <option value="1990">1990</option>
	                    <option value="1991">1991</option>
	                    <option value="1992">1992</option>
	                    <option value="1993">1993</option>
	                    <option value="1994">1994</option>
	                    <option value="1995">1995</option>
	                    <option value="1996">1996</option>
	                    <option value="1997">1997</option>
	                    <option value="1998">1998</option>
	                    <option value="1999">1999</option>
	                    <option value="2000">2000</option>
	                    <option value="2001">2001</option>
	                    <option value="2002">2002</option>
	                    <option value="2003">2003</option>
	                    <option value="2004">2004</option>
	                    <option value="2005">2005</option>
	                    <option value="2006">2006</option>
	                    <option value="2007">2007</option>
	                    <option value="2008">2008</option>
	                    <option value="2009">2009</option>
	                    <option value="2010">2010</option>
	                    <option value="2011">2011</option>
	                    <option value="2012">2012</option>
	                    <option value="2013">2013</option>
	                    <option value="2014">2014</option>
	                    <option value="2015">2015</option>
                    </select>
                   </div>
                  </div>
                  <div class="clearfix"> </div>
                 </div>
              </div>
              <div class="form-group form-group1">
                <label class="col-sm-7 control-lable" for="sex">性别: <span class="form-required" title="This field is required.">*</span></label>
                <div class="col-sm-5">
                    <div class="radios">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" id="sexM" checked="" name="sex" value="male"> Male
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" id="sexFe" name="sex" value="female"> Female
				        </label>
	                </div>
                </div>
                <div class="clearfix"> </div>
             </div>
             
            
		    
		    <div class="form-group form-group1">
                <label class="col-sm-7 control-lable" for="sex">性取向 : <span class="form-required" title="This field is required.">*</span></label>
                <div class="col-sm-5">
                    <div class="radios">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" id="loveM" name="sexLove" value="male"> Male
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" id="loveFe" name="sexLove" checked="" value="female"> Female
				        </label>
	                </div>
                </div>
                <div class="clearfix"> </div>
             </div>
		    
		     <div class="form-group">
		      <label for="edit-name">爱好 <span class="form-required" title="This field is required."></span></label>
		      <input type="text" id="edit-name" name="hobby" value="" size="60" maxlength="60" class="form-text required">
		    </div>
		    
			  <div class="form-group">
			     <label for="edit-name">更多简介 <span class="form-required" title="This field is required."></span></label>
				 <textarea class="form-control bio" id="introductory" placeholder="" rows="3"></textarea>
			  </div>
			  <div class="form-actions">
			    <input type="submit" id="edit-submit" name="op" value="保存" class="btn_1 submit">
			  </div>
		 </form>
	  </div>



   	        <div class="col-sm-4 row_2" style="margin-left:150px;">
   	        <div> <label for="edit-name">请上传您的生活照<span class="form-required" title="This field is required.">*</span></label></div>
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
				  <div class="form-actions">
				 	
			    <input type="submit" id="edit-submit" name="op" value="上传" class="btn_1 submit">
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
</body>
</html>