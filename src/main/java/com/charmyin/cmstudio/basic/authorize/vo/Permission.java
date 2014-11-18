package com.charmyin.cmstudio.basic.authorize.vo;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * VO class of permission
 * @author YinCM
 * @since 2013-9-12 21:55:51
 */
@Document(collection="basic_permission")
public class Permission {
	private String permission;
	private String remark;
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
