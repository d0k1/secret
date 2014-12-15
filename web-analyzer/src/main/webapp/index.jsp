<html ng-app="bondApp">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>FocusIt Profiler Front</title>
	<link href="/assets/css/bootstrap.min.css" rel="stylesheet">
	<link href="/assets/css/admin_main.css" rel="stylesheet">
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="/assets/js/jquery-2.1.1.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/assets/js/bootstrap.min.js"></script>
	<!--angular & underscore-->
	<script src="/assets/js/underscore.js"></script>
	<script src="/assets/js/angular/angular.js"></script>
	<script src="/assets/js/angular/angular-route.js"></script>
	<script src="/assets/js/angular/angular-cookies.js"></script>
	<script src="/assets/js/app.js"></script>
	<script src="/assets/js/controllers/sessions.js"></script>
	<script src="/assets/js/controllers/methods.js"></script>
	<script src="/assets/js/controllers/threads.js"></script>
	<script src="/assets/js/controllers/jvm.js"></script>
	<script src="/assets/js/services.js"></script>
	<script src="/assets/js/configuration.js"></script>
<head>

<body>
<div class="container">
	<div class="row">
		<div class="col-xs-4 col-md-2" ng-controller="menuController">
			<div style="height: 50px;"></div>
			<ul class="nav nav-pills nav-stacked" id="mavigationTabs">
				<li ng-class="{active:item==0}"><a ng-href="\#{{urls.sessions}}" ng-click="item = 0">Start</a></li>
				<li ng-class="{active:item==1}"><a ng-href="\#{{urls.methods}}" ng-click="item = 1">Method</a></li>
				<li ng-class="{active:item==2}"><a ng-href="\#{{urls.threads}}" ng-click="item = 2">Threads</a></li>
				<li ng-class="{active:item==3}"><a ng-href="\#{{urls.jvm}}" ng-click="item = 3">Jvm</a></li>
			</ul>
		</div>
		<div class="col-xs-14 col-md-10">
			<div ng-view></div>
		</div>
	</div>
</div>
</body>

</html>