<html>
<head>
    <title>Facebook Feed</title>
    <meta name='layout' content='facebookLayout'/>
</head>

<body>
	<h3>Your Facebook Feed</h3>

	<g:form controller="springSocialFacebook" action="update">
		<p>Post to your Facebook wall:<p>
		<textarea id="message" name="message" rows="2" cols="60"></textarea><br/>
		<input type="submit" value="Post" />
	</g:form>

	<div class="feed">
	<ul class="feedList">
		<g:each in="${feed}" var="post">
			<li class="post">
				<p>
					<g:if test="${post.picture}">
						<img src="${post.picture}" align="top"/>
					</g:if>

					
					${post.message} - ${post.name}
                </p>
			</li>
		</g:each>
	</ul>
	</div>


</body>
</html>
