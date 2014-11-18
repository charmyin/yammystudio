package com.charmyin.cmstudio.basic.authorize.service.implMongodb;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.charmyin.cmstudio.basic.authorize.service.RoleService;
import com.charmyin.cmstudio.basic.authorize.vo.Role;
import com.charmyin.cmstudio.basic.authorize.vo.User;
import com.charmyin.cmstudio.basic.authorize.vo.UserRole;

public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private MongoOperations mongoOperations;
	
	
	@Override
	public List<Role> getAllRole() {
		List<Role> list = mongoOperations.find(new Query(), Role.class, "basic_role");
		return list;
	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertRole(Role role) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRole(String[] names) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Role> searchRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRolesByUserId(User userIdStr) {
		List<UserRole> roleStringList =  mongoOperations.find(new Query(Criteria.where("user_id").is(userIdStr.getId())), UserRole.class, "shiro_user_role");
		StringBuilder  sb = new StringBuilder();
		for(UserRole str : roleStringList){
			sb.append(str.getRoleId()).append(",");
		}
		String resultStr="";
		if(sb.length()>0){
			resultStr = sb.substring(0, sb.length()-1);
		}
		return resultStr;
	}

	@Override
	public List<Role> getRoleByOrganizationId(Integer orgId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(int id) {
		Role role = mongoOperations.findOne(new Query(Criteria.where("_id").is(id)), Role.class, "basic_role");
		return role;
	}

}
