/***
 * author: charmyin
 * datetime: 2013-2-22 21:00
 * title: make the login powerful
 ***/

define(['cookiejs'], function (cookiejs) {
	return {
		//从cookie获取用户信息
		getUserInfoFromCookie: function () {
			var userName = cookiejs.get('loginUserName');
			var password = cookiejs.get('loginUassword');
			$('#inputUsername').val(userName);
			$('#inputPassword').val(password);
		},
		//将光标移动到焦点上
		//参数为元素的id
		setEnterPressEvent: function (loginapp) {
			//监听enter按键事件
			//username文本框，enter后跳转下个文本框
			$('#inputUsername').bind('keypress', function (e) {
				var code = e.keyCode ? e.keyCode : e.which;
				if(code == 13){
					$('#inputPassword').focus();
				}
			});
			//密码文本框，enter后跳转下个文本框
			$('#inputPassword').bind('keypress', function (e) {
				var code = e.keyCode ? e.keyCode : e.which;
				if(code == 13){
					document.authForm.valiCode.focus();
				}
			});
			//验证码文本框，enter后提交表单
			$('#inputValiCode').bind('keypress', function (e) {
				var code = e.keyCode ? e.keyCode : e.which;
				if(code == 13){
					loginapp.submitLoginForm();
				}
			});
		},
		//提交表单
		submitLoginForm: function () {
			//验证所填入信息
			if(!$('#authForm').form('validate')){
				return;
			}			
			//保存cookie
			if($('#inputRememberMe').is(':checked')){
				var userName = $('#inputUsername').val();
				var password = $('#inputPassword').val();
				if(userName){
					cookiejs.set('loginUserName', userName);
				}
				if(password){
					//TODO 需要加密
					cookiejs.set('loginUassword', password);
				}
				
				//alert("表单提交中，cookie中存入用户名密码，刷新后显示~");
			}
			
			if($('#inputDesktop_login').is(':checked')){
				window.location.href="http://localhost:8080/bbrj/jsframes/jQueryDesktop/index.html";
			}else{
				window.location.href="../main/index.html";
			}
		}
	};
});