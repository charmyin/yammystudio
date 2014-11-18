define(['backbone'], function (Backbone) {
	return Backbone.Model.extend({
		defaults: {
			name: '',
			role: '',
			loginTime: '',
			lastLoginTime: '',
			lastLoginIp: ''
		},
		url: './loginUser.json'
	});
});