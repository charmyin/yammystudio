package com.charmyin.cmstudio.basic.authorize.service.implMongodb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.basic.authorize.repository.UserRoleRepository;
import com.charmyin.cmstudio.basic.authorize.repository.UsersRepository;
import com.charmyin.cmstudio.basic.authorize.service.UserService;
import com.charmyin.cmstudio.basic.authorize.vo.User;
import com.charmyin.cmstudio.basic.authorize.vo.UserRole;

//@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private MongoOperations mongoOperations;
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	public MongoOperations getMongoOperations() {
		return mongoOperations;
	}

	public void setMongoOperations(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = usersRepository.findAll();
		return list;
	}

	@Override
	public List<User> findAllUser(User user) {
		//TODO
		List<User> list = mongoOperations.find(new Query(), User.class, "shiro_user");
		return list;
	}

	@Override
	public User getUserById(int id) {
		User user = mongoOperations.findOne(new Query(Criteria.where("_id").is(id)), User.class, "shiro_user");
		return user;
	}

	@Override
	public User getUserByName(String userName) {
		User user = mongoOperations.findOne(new Query(Criteria.where("loginId").is(userName)), User.class, "shiro_user");
		return user;
	}

	@Override
	public List<User> getUserByOrgnizationId(int organizationId) {
		List<User> list = mongoOperations.find(new Query(Criteria.where("organizationId").is(organizationId)), User.class, "shiro_user");
		return list;
	}

	@Override
	public void insertUser(User user) {
		User user1 = usersRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(int[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRoles(Integer id, String roles) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Integer> getRoleIdsByUserId(int userId) {
		List<UserRole> list = mongoOperations.find(new Query(Criteria.where("userId").is(userId)), UserRole.class, "shiro_user_role");
		List<Integer> rolesIdsList = new ArrayList<Integer>();
		for(UserRole ur : list){
			rolesIdsList.add(ur.getRoleId());
		}
		return rolesIdsList;
	}

	@Override
	public void deleteUserRoleByUserId(int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUserRole(int userId, int roleId) {
		// TODO Auto-generated method stub

	}

}
