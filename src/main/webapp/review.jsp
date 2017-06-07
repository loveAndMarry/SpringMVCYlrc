<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<title>Insert title here</title>

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
</div>
<!-- ============================  Navigation End ============================ -->


<br/>
<div class="grid_2">
	<div class="container">
		<h2>我的动态</h2>
       	<div class="heart-divider">
			<span class="grey-line"></span>
			<i class="fa fa-heart pink-heart"></i>
			<i class="fa fa-heart grey-heart"></i>
			<span class="grey-line"></span>
        </div>
  
	     <div class="col-md-8hhh suceess_story" >
	         <ul> 
			   <li>
				  	<div class="suceess_story-date">
						<span class="entry-1">3-20 17:00, 2017</span>
					</div>
					<div class="suceess_story-content-container">
						<figure class="suceess_story-content-featured-image">
						   <img width="75" height="75" src="images/7.jpg" class="img-responsive" alt=""/>				            
					    </figure>
						<div class="suceess_story-content-info" >
				        	<h4><a href="#">Lorem & Ipsum</a></h4>				        	
				        	<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,.<a id="modal-0" href="#modal-container-0" role="button" class="btn" data-toggle="modal">Details</a></p>
				        </div>
				    </div>
				</li>
				
				<div class="modal fade" id="modal-container-0" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
							</h4>
						</div>
						<div class="modal-body">
						<h6>
				             好友评论
			            </h6>
			            <p>
				  A：That is great!
			            </p>
			            <p>
				  B：That is great!
			            </p>
			            <p>
				 C：That is great!
			            </p>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> 
						</div>
					</div>
					
				</div>
				
			</div>
				
	            <li>
				  	<div class="suceess_story-date">
						<span class="entry-1">3-25 17:00, 2017</span>
					</div>
					<div class="suceess_story-content-container">
						<figure class="suceess_story-content-featured-image">
						   <img width="75" height="75" src="images/8.jpg" class="img-responsive" alt=""/>				            
					    </figure>
						<div class="suceess_story-content-info">
				        	<h4><a href="#">Lorem & Ipsum</a></h4>				        	
				        	<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,.<a id="modal-1" href="#modal-container-1" role="button" class="btn" data-toggle="modal">Details</a></p>
				        </div>
				    </div>
				</li>
				<div class="modal fade" id="modal-container-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
							</h4>
						</div>
						<div class="modal-body">
						<h6>
				             好友评论
			            </h6>
			            <p>
				  A：That is great!
			            </p>
			            <p>
				  B：That is great!
			            </p>
			            <p>
				 C：That is greatsss!
			            </p>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> 
						</div>
					</div>
					
				</div>
				
			</div>
	            <li>
				  	<div class="suceess_story-date">
						<span class="entry-1">4-10 17:00, 2017</span>
					</div>
					<div class="suceess_story-content-container">
						<figure class="suceess_story-content-featured-image">
						   <img width="75" height="75" src="images/9.jpg" class="img-responsive" alt=""/>				            
					    </figure>
						<div class="suceess_story-content-info">
				        	<h4><a href="#">Lorem & Ipsum</a></h4>				        	
				        	<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,.<a id="modal-2" href="#modal-container-2" role="button" class="btn" data-toggle="modal">Details</a></p>
				        </div>
				    </div>
				</li>
				<div class="modal fade" id="modal-container-2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
							</h4>
						</div>
						<div class="modal-body">
						<h6>
				             好友评论
			            </h6>
			            <p>
				  A：That is great!
			            </p>
			            <p>
				  B：That is great!
			            </p>
			            <p>
				 C：That is great!
			            </p>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> 
						</div>
					</div>
					
				</div>
				
			</div>
	            <li>
				  	<div class="suceess_story-date">
						<span class="entry-1">4-21 17:00, 2017</span>
					</div>
					<div class="suceess_story-content-container">
						<figure class="suceess_story-content-featured-image">
						   <img width="75" height="75" src="images/10.jpg" class="img-responsive" alt=""/>				            
					    </figure>
						<div class="suceess_story-content-info">
				        	<h4><a href="#">Lorem & Ipsum</a></h4>				        	
				        	<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,.<a id="modal-3" href="#modal-container-3" role="button" class="btn" data-toggle="modal">Details</a></p>
				        </div>
				    </div>
				</li>
				<div class="modal fade" id="modal-container-3" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
							</h4>
						</div>
						<div class="modal-body">
						<h6>
				             好友评论
			            </h6>
			            <p>
				  A：That is great!
			            </p>
			            <p>
				  B：That is great!
			            </p>
			            <p>
				 C：That is great!
			            </p>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> 
						</div>
					</div>
					
				</div>
				
			</div>
	            <li>
				  	<div class="suceess_story-date">
						<span class="entry-1">4-26 17:00, 2017</span>
					</div>
					<div class="suceess_story-content-container">
						<figure class="suceess_story-content-featured-image">
						   <img width="75" height="75" src="images/11.jpg" class="img-responsive" alt=""/>				            
					    </figure>
						<div class="suceess_story-content-info">
				        	<h4><a href="#">Lorem & Ipsum</a></h4>				        	
				        	<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,.<a id="modal-4" href="#modal-container-4" role="button" class="btn" data-toggle="modal">Details</a></p>
				        </div>
				    </div>
				</li>
				<div class="modal fade" id="modal-container-4" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
							</h4>
						</div>
						<div class="modal-body">
						<h6>
				             好友评论
			            </h6>
			            <p>
				  A：That is great!
			            </p>
			            <p>
				  B：That is great!
			            </p>
			            <p>
				 C：That is great!
			            </p>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> 
						</div>
					</div>
					
				</div>
				
			</div>
	            <li>
				  	<div class="suceess_story-date">
						<span class="entry-1">5-2 17:00, 2017</span>
					</div>
					<div class="suceess_story-content-container">
						<figure class="suceess_story-content-featured-image">
						   <img width="75" height="75" src="images/12.jpg" class="img-responsive" alt=""/>				            
					    </figure>
						<div class="suceess_story-content-info">
				        	<h4><a href="#">Lorem & Ipsum</a></h4>				        	
				        	<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,.<a id="modal-5" href="#modal-container-5" role="button" class="btn" data-toggle="modal">Details</a></p>
				        </div>
				    </div>
				</li>
				<div class="modal fade" id="modal-container-5" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
							</h4>
						</div>
						<div class="modal-body">
						<h6>
				             好友评论
			            </h6>
			            <p>
				  A：That is great!
			            </p>
			            <p>
				  B：That is great!
			            </p>
			            <p>
				 C：That is great!
			            </p>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> 
						</div>
					</div>
					
				</div>
				
			</div>
	            <li>
				  	<div class="suceess_story-date">
						<span class="entry-1">5-28 17:00, 2017</span>
					</div>
					<div class="suceess_story-content-container">
						<figure class="suceess_story-content-featured-image">
						   <img width="75" height="75" src="images/13.jpg" class="img-responsive" alt=""/>				            
					    </figure>
						<div class="suceess_story-content-info">
				        	<h4><a href="#">Lorem & Ipsum</a></h4>				        	
				        	<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,.<a id="modal-6" href="#modal-container-6" role="button" class="btn" data-toggle="modal">Details</a></p>
				        </div>
				    </div>
				</li>
				<div class="modal fade" id="modal-container-6" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
								There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form,
							</h4>
						</div>
						<div class="modal-body">
						<h6>
				             好友评论
			            </h6>
			            <p>
				  A：That is great!
			            </p>
			            <p>
				  B：That is great!
			            </p>
			            <p>
				 C：That is great!
			            </p>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> 
						</div>
					</div>
					
				</div>
				
			</div>
	        </ul>
	    </div>

	    

	  </div>
    </div>


<div class="about_middle">
  <div class="container">
	 <h2>我要发动态</h2>
	  <form id="contact-form" class="contact-form">
        <fieldset>
          <input type="text" class="text" placeholder="" value="@somebody" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '@somebody';}">
          
          <textarea value="Message" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">Message</textarea>
          <input name="submit" type="submit" id="submit" value="发布">
        </fieldset>
      </form>
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
</body>
</html>