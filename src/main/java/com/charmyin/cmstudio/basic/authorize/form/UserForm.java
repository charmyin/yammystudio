package com.charmyin.cmstudio.basic.authorize.form;

import com.charmyin.cmstudio.basic.authorize.vo.User;

/**
 * user vo added the initial passphrase keword
 * @author YinCM
 * @since
 */
public class UserForm extends User {
	
	/*
	 * if true, init the passphrase and salt
	 */
	private Boolean initPassphrase;

	public Boolean getInitPassphrase() {
		return initPassphrase;
	}

	public void setInitPassphrase(Boolean initPassphrase) {
		this.initPassphrase = initPassphrase;
	}
	
	/**
	 * Used for loading the roles 
	 */
	private String roles;

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
}
