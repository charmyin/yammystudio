/***
 * author: charmyin
 * datetime: 2013-2-26 21:00
 * title: The main page of this application~
 ***/

//记录parser载入次数，主要处理第一次载入parser时的事件
var parserCount = 0;

requirejs.config({
	waitSeconds: 0,
	baseUrl: "../../../../",
	paths: {
		//'jquery': 'vendor/jquery/jquery-1.8.0.min',
		//'easyloader': 'vendor/easyui/easyloader',
		'indexApp': 'app/js/apps/easyui/main/indexApp',
		'common': 'app/js/apps/easyui/common',
		'backbone': 'vendor/backbone/backbone',
		'underscore': 'vendor/underscore/underscore'
	},
	shim: {
		//'easyloader': {
		//	deps: ['jquery'],
		//	exports: 'EasyLoader'
		//},
		'backbone': {
			deps: ['underscore'],
			exports: 'Backbone'
		},
		'underscore': {
			exports: '_'
		}
	}

});


require(['indexApp', 'backbone', 'underscore'], function (indexApp, backbone, _) {
	//jquery加载完成后
		$(function () {
			$(".divOnChangeTheme").click(function () {
				indexApp.changeTheme($(this).attr('value'));
			});
		});
});
