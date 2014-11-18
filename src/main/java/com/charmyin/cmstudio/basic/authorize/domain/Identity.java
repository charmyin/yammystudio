package com.charmyin.cmstudio.basic.authorize.domain;

import java.util.Date;

/**
 * Mybatis Domain object to access Identiry information in database
 * @author charmyin
 *
 */
public class Identity {
	private static final long serialVersionUID = 1L;
	private int id;
	private String loginId;
	private String salt;
	private Date created;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}

	
}
