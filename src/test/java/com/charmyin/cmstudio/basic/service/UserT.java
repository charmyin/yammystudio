package com.charmyin.cmstudio.basic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.charmyin.cmstudio.basic.authorize.persistence.UserMapper;
import com.charmyin.cmstudio.basic.authorize.service.UserService;
import com.charmyin.cmstudio.basic.authorize.vo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-context.xml"})
@TransactionConfiguration(defaultRollback=false)
public class UserT{
	
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private UserService userService;
	
	@Test
	public void deleteUserRoleByUserId(){
		userMapper.deleteUserRoleByUserId(1);
	}
	
	@Test
	public void insertUserRole(){
		//userService.insertUserRole(1, "test");
	}
	
	@Test
	public void getRoleNamesByUserId(){
		List<Integer> str = userMapper.getRoleIdsByUserId(1);
		for(Integer strr: str){
			System.out.println(strr);
		}
	}
	 
	@Test
	public void getUserEqual() {
		User user1 = new User();
		user1.setId(1);
		List<User> userList = userMapper.getUserEqual(user1);
		
		for(User user : userList){
			System.out.println(user.getName());
		}
	}
	
	@Test
	public void updateUser(){
		User user = new User();
		user.setId(5);
		user.setName("love");
		userMapper.updateUser(user);
	}

	@Test
	public void getUserLike() {
		User user1 = new User();
		user1.setName("delete");
		List<User> userList = userMapper.getUserLike(user1);
		
		for(User user : userList){
			System.out.println(user.getName());
		}
	}

	@Test
	public void getUserById() {
		User queryUser = new User();
		queryUser.setId(1);
		List<User> userList = userMapper.getUserEqual(queryUser);
		if(userList==null || userList.size()<1){
			System.out.println("nulllllllllllllllllllll");
		}
		System.out.println(userList.get(0).getName());
	}

	@Test
	public void insertUser() {
		User user = new User();
		user.setName("dddd");
		user.setDateCreated(new Date());
		user.setEmail("email.com");
		user.setLoginId("lgoinid");
		user.setId(5);
		user.setState(true);
		user.setPassphrase("asdfasdf");
		user.setSalt("asdfasdf");
		user.setRemark("It's a link for google");
		userMapper.insertUser(user);
	}
	
	@Test
	@Transactional
	public void insertUserBatchInTransaction(){
		User user = new User();
		user.setName("dddd");
	 
		user.setRemark("It's a link for google");
		User user2 = new User();
		user2.setName("2dddd");
		 
		user2.setRemark("2It's a link for google");
		User user3 = new User();
		user3.setName("dd");
	 
		user3.setRemark("3It's a link for google");
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		userList.add(user2);
		userList.add(user3);
		int i = 0;
		try{
		for(User mn : userList){
			/*if(i==2){
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}*/
			userMapper.insertUser(mn);
			System.out.println(mn.getName());
			i++;
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Transactional
	public void deleteUser() {
		int[] ids = {3};
		for(int id : ids){
			userMapper.deleteUser(id);
		}
		User user = new User();
		user.setName("ddddd");
	 
		user.setRemark("It's a link for google");
	//	userMapper.insertUser(user);
	}

	
 

	@Test
	public void getAllUser() {
		List<User> userList = userMapper.getAllUser();
		for(User user : userList){
			System.out.println(user.getName());
		}
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
