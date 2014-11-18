package com.charmyin.cmstudio.basic.authorize.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * Basic Registration Form With JSR-303 Validation
 * @author charmyin
 *
 */
public class RegistrationForm {
	@NotNull(message = "用户名不能为空！")
	@Size(min=4, max=50, message="用户名长度必须大4小于50")
	private String loginId;
	
	@NotNull(message = "用户名不能为空！")
	@Email(message = "必须为一个有效的电子邮件地址，如：mike@gmail.com")
	private String email;
	
	@Size(min=4, max=50, message="用户昵称长度必须大4小于50")
	private String name;
	
	private String passphrase;
	
	private String salt;
	
	private Integer id;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassphrase() {
		return passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
