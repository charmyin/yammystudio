package com.charmyin.cmstudio.basic.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.charmyin.cmstudio.basic.authorize.persistence.RoleMapper;
import com.charmyin.cmstudio.basic.authorize.vo.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-context.xml"})
@TransactionConfiguration(defaultRollback=false)
public class RoleT{
	
	@Resource
	private RoleMapper roleMapper;
	
	@Test
	public void getRoleEqual() {
		Role role1 = new Role();
		List<Role> roleList = roleMapper.getRoleEqual(role1);
		
		for(Role role : roleList){
			System.out.println(role.getName());
		}
	}
	
	@Test
	public void updateRole(){
		Role role = new Role();
		role.setName("love");
		roleMapper.updateRole(role);
	}

	@Test
	public void getRoleLike() {
		Role role1 = new Role();
		role1.setName("delete");
		List<Role> roleList = roleMapper.getRoleLike(role1);
		
		for(Role role : roleList){
			System.out.println(role.getName());
		}
	}

	@Test
	public void getRoleById() {
		//Role role = roleMapper.getRoleById(1);
		//System.out.println("=="+role.getName());
	}

	@Test
	public void insertRole() {
		Role role = new Role();
		role.setName("dddd");
		role.setState(true);
		role.setDescription("用来这样那样还有这样");
		role.setRemark("It's a link for google");
		roleMapper.insertRole(role);
	}
	
	@Test
	@Transactional
	public void insertRoleBatchInTransaction(){
		Role role = new Role();
		role.setName("dddd");
	 
		role.setRemark("It's a link for google");
		Role role2 = new Role();
		role2.setName("2dddd");
		 
		role2.setRemark("2It's a link for google");
		Role role3 = new Role();
		role3.setName("dd");
	 
		role3.setRemark("3It's a link for google");
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(role);
		roleList.add(role2);
		roleList.add(role3);
		int i = 0;
		try{
		for(Role mn : roleList){
			/*if(i==2){
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}*/
			roleMapper.insertRole(mn);
			System.out.println(mn.getName());
			i++;
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Transactional
	public void deleteRole() {
		int[] ids = {3};
		for(int id : ids){
			//roleMapper.deleteRole(id);
		}
		Role role = new Role();
		role.setName("ddddd");
	 
		role.setRemark("It's a link for google");
	//	roleMapper.insertRole(role);
	}

	
 

	@Test
	public void getAllRole() {
		List<Role> roleList = roleMapper.getAllRole();
		for(Role role : roleList){
			System.out.println(role.getName());
		}
	}

	public RoleMapper getRoleMapper() {
		return roleMapper;
	}

	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}
}
