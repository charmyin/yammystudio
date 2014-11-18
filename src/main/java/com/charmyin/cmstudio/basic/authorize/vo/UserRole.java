package com.charmyin.cmstudio.basic.authorize.vo;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * VO for table role-menu 
 * @author YinCM
 * @since
 */
@Document(collection="shiro_user_role")
public class UserRole {
	//角色名称
	private int roleId;
	//菜单id
	private int user_id;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
