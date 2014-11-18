/***
 * author: charmyin
 * datetime: 2013-2-22 21:00
 * title: Put some common js code together~
 ***/

define(function () {
	return {
		//设定easyui的初始化参数
		configEasyUI: function(event){
			if(event='parser'){
				easyloader.theme = 'bootstrap';
				easyloader.locale = 'zh_CN';
			}
		}
	};
});