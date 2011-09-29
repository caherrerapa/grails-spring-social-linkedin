<html>
<head>
    <title>Facebook Profile</title>
    <meta name='layout' content='facebookLayout'/>
</head>

<body>
	<div class="container-fluid">
    		<div class="sidebar">
    			<h3>Your Facebook Profile</h3>
				<p>Hello, ${profile.firstName}</p>
				<dl>
				<dt>Facebook ID:</dt>
					<dd>${profile.id}</dd>
					<dt>Name:</dt>
					<dd>${profile.name}</dd>
					<dt>Email:</dt>
					<dd>${profile.email}</dd>
				</dl>
				<g:form method="DELETE" mapping="springSocialConnect" params="[providerId:'facebook']">
				    <button>Disconnect from Facebook</button>
				</g:form>
				<ul>
					<li>Payment details<span class="label important">Important</span></li>	
					<li>Linked Social networks</li>
					<li><b>Profile</b></li>
					<li>XXXXX</li>
					<li>XXXX</li>
					<li>XXXX</li>
				</ul>
				<ul>
					<li>Payment details<span class="label important">Important</span></li>	
					<li>Linked Social networks</li>
					<li><b>Profile</b></li>
					<li>XXXXX</li>
					<li>XXXX</li>
					<li>XXXX</li>
				</ul>
			</div>
			<div class="content">
				
			</div>
</body>
</html>
