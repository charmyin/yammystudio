package com.charmyin.cmstudio.basic.authorize.service.implMongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.charmyin.cmstudio.basic.authorize.repository.MenuRepository;
import com.charmyin.cmstudio.basic.authorize.service.MenuService;
import com.charmyin.cmstudio.basic.authorize.vo.Menu;
import com.charmyin.cmstudio.basic.authorize.vo.User;

public class MenuServiceImpl implements MenuService {

	@Autowired
	private MongoOperations mongoOperations;
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Override
	public List<Menu> getAllMenu() {
		List<Menu> list = mongoOperations.find(new Query(), Menu.class, "shiro_user");
		return list;
	}

	@Override
	public List<Menu> getChildrenMenus(int parentId) {
		List<Menu> list = mongoOperations.find(new Query(Criteria.where("parentId").is(parentId)), Menu.class, "shiro_user");
		return list;
	}

	@Override
	public void updateMenu(Menu menu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertMenu(Menu menu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMenu(int[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Menu> searchMenu(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu getMenuById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> getMenuByRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> getMenuByUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
