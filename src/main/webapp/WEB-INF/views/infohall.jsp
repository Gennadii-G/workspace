<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>

    <!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
	<title>zAnimal</title>
	<meta name="description" content="Free Responsive Html5 Css3 Templates | Zerotheme.com">
	<meta name="author" content="www.zerotheme.com">
	
    <!-- Mobile Specific Metas
	================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    
    <!-- CSS
	================================================== -->
  	<link rel="stylesheet" href="/resources/css/zerogrid.css">
	<link rel="stylesheet" href="/resources/css/style.css">
	<link rel="stylesheet" href="/resources/css/lightbox.css">
	
	<!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	
	
	<link rel="stylesheet" href="/resources/css/menu.css">
	<script src="/resources/js/jquery1111.min.js" type="text/javascript"></script>
	<script src="/resources/js/script.js"></script>
	
	<!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/Items/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
		<script src="/resources/js/html5.js"></script>
		<script src="/resources/js/css3-mediaqueries.js"></script>
	<![endif]-->
	
</head>

<body class="single-page">
	<div class="wrap-body">
		<div class="header">
			<div id='cssmenu' >
				<ul>
				   <li class="active"><a href="<c:url value="/" />"><span>JAMPHALL2</span></a></li>
				   <li class=' has-sub'><a href='#'><span>наши залы</span></a>
					  <ul>
						 <li class='has-sub'><a href="<c:url value="/infohall/ogurez" />"><span>Огурец</span></a>
							<ul>
							   <li><a href="<c:url value="/infohall/ogurez" />"><span>информация</span></a></li>
							   <li class='last'><a href="<c:url value="/" />"><span>${greeting}</span></a></li>
							</ul>
						 </li>
						 <li class='has-sub'><a href="<c:url value="/infohall/vata" />"><span>Вата</span></a>
							<ul>
							   <li><a href="<c:url value="/infohall/oblako" />"><span>информация</span></a></li>
							   <li class='last'><a href="<c:url value="/" />"><span>order</span></a></li>
							</ul>
						 </li>
						 <li class='has-sub'><a href="<c:url value="/infohall/oblako" />"><span>Облако</span></a>
                         	<ul>
                         	    <li><a href="<c:url value="/infohall/oblako" />"><span>информация</span></a></li>
                         		<li class='last'><a href="<c:url value="/" />"><span>orser</span></a></li>
                         	</ul>
                         </li>
					  </ul>
				   </li>
				   <li><a href="<c:url value="/info" />"><span>о нас</span></a></li>
				   <li class='last'><a href="<c:url value="/contacts" />"><span>контакты</span></a></li>
				</ul>
			</div>
		</div>

		<!--////////////////////////////////////Container-->
		<section id="container">
			<div class="wrap-container clearfix">
				<div id="main-content">
					<div class="crumbs">
						<ul>
							<li><a href="index.html">Home</a></li>
							<li><a href="single.html">Single</a></li>
						</ul>
					</div>
					<div class="wrap-content">
						<article>
							<div class="art-header">
								<h1 class="entry-title">${id}</h1>
							</div>
							<div class="art-content">
								
								<div class="excerpt"><p>Название зала: ${hall.name}</p></div>
								<div class="excerpt"><p>Количество свободных батутов: ${hall.freeTramps()}</p></div>
								<div class="excerpt"><p>Стоимоть часа аренды одного батута: ${hall.price}</p></div>

								<br/>
								<br/>
								<br/>
								<br/>
								  <ol>
									<li>Lorem ipsum</li>
									<li>Sit amet vultatup nonumy</li>
									<li>Duista sed diam</li>
								  </ol>
								  <div class="clear"></div>
								</div>
								<p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
								<p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores.</p>
							</div>
						</article>
					</div>
				</div>
			</div>
		</section>
		<!--////////////////////////////////////Footer-->
		<footer>
			<div class="zerogrid wrap-footer">
				<div class="row">
					<div class="col-1-3 col-footer-1">
						<div class="wrap-col">
							<h3 class="widget-title">About Us</h3>
							<p>Ut volutpat consectetur aliquam. Curabitur auctor in nis ulum ornare. Sed consequat, augue condimentum fermentum gravida, metus elit vehicula dui. Curabitur auctor in nis ulum ornare. Sed consequat, augue condimentum fermentum</p>
							<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque la udantium</p>
						</div>
					</div>
					<div class="col-1-3 col-footer-2">
						<div class="wrap-col">
							<h3 class="widget-title">Recent Post</h3>
							<ul>
								<li><a href="#">MOST VISITED COUNTRIES</a></li>
								<li><a href="#">5 PLACES THAT MAKE A GREAT HOLIDAY</a></li>
								<li><a href="#">PEBBLE TIME STEEL IS ON TRACK TO SHIP IN JULY</a></li>
								<li><a href="#">STARTUP COMPANY’S CO-FOUNDER TALKS ON HIS NEW PRODUCT</a></li>
							</ul>
						</div>
					</div>
					<div class="col-1-3 col-footer-3">
						<div class="wrap-col">
							<h3 class="widget-title">Tag Cloud</h3>
							<a href="#">animals</a>
							<a href="#">cooking</a>
							<a href="#">countries</a>
							<a href="#">city</a>
							<a href="#">children</a>
							<a href="#">home</a>
							<a href="#">likes</a>
							<a href="#">photo</a>
							<a href="#">link</a>
							<a href="#">law</a>
							<a href="#">shopping</a>
							<a href="#">skate</a>
							<a href="#">scholl</a>
							<a href="#">video</a>
							<a href="#">travel</a>
							<a href="#">images</a>
							<a href="#">love</a>
							<a href="#">lists</a>
							<a href="#">makeup</a>
							<a href="#">media</a>
							<a href="#">password</a>
							<a href="#">pagination</a>
							<a href="#">wildlife</a>
						</div>
					</div>
				</div>
			</div>
			<div class="copyright">
				<div class="zerogrid wrapper">
					Copyright @ zAnimal - Designed by <a href="https://www.zerotheme.com" title="free website templates">ZEROTHEME</a>
					<ul class="quick-link">
						<li><a href="#">Privacy Policy</a></li>
						<li><a href="#">Terms of Use</a></li>
					</ul>
				</div>
			</div>
		</footer>
	</div>
</body>
</html>