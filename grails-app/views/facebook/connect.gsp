<html>
<head>
    <title>Facebook Connect</title>
    <meta name='layout' content='facebookLayout'/>
</head>

<body>
	
	<h3>Connect to Facebook</h3>
	
	<g:form method="POST" mapping="springSocialConnect" params="[providerId:'facebook']">
	    <input type="hidden" name="scope" value="user_about_me" />
		<div class="formInfo">
			<h6>You aren't connected to Facebook yet.</h6>
			<p> Click the button to connect with your Facebook account.</p>
		</div>
		<button class="FBshare">Connect with Facebook</button>
<!--		<button class="FBshare"><img src="${createLinkTo(dir: 'images/springsocial/facebook', file: 'connect_light_medium_short.gif')}"/></button>-->
	</g:form>


</body>
</html>
