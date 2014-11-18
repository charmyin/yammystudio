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
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.charmyin.cmstudio.basic.authorize.persistence.MenuMapper;
import com.charmyin.cmstudio.basic.authorize.vo.Menu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-context.xml"})
@TransactionConfiguration(defaultRollback=false)
public class MenuT{
	
	@Resource
	private MenuMapper menuMapper;
	
	@Test
	public void getMenuEqual() {
		Menu menu1 = new Menu();
		menu1.setParentId(1);
		List<Menu> menuList = menuMapper.getMenuEqual(menu1);
		
		for(Menu menu : menuList){
			System.out.println(menu.getName());
		}
	}
	
	@Test
	public void updateMenu(){
		Menu menu = new Menu();
		menu.setId(2);
		menu.setName("love");
		menuMapper.updateMenu(menu);
	}

	@Test
	public void getMenuLike() {
		Menu menu1 = new Menu();
		menu1.setName("delete");
		List<Menu> menuList = menuMapper.getMenuLike(menu1);
		
		for(Menu menu : menuList){
			System.out.println(menu.getName());
		}
	}

	@Test
	public void getMenuById() {
		Menu menu = menuMapper.getMenuById(1);
		System.out.println(menu.getId()+"=="+menu.getName());
	}

	@Test
	public void insertMenu() {
		Menu menu = new Menu();
		menu.setName("dddd");
		menu.setOrderNumber(1);
		menu.setRemark("It's a link for google");
		menu.setLinkUrl("www.google.com.hk");
		menuMapper.insertMenu(menu);
	}
	
	@Test
	@Transactional
	public void insertMenuBatchInTransaction(){
		Menu menu = new Menu();
		menu.setName("dddd");
		menu.setOrderNumber(1);
		menu.setParentId(1);
		menu.setRemark("It's a link for google");
		menu.setLinkUrl("www.google.com.hk");
		Menu menu2 = new Menu();
		menu2.setName("2dddd");
		menu2.setOrderNumber(213);
		menu2.setParentId(1);
		menu2.setRemark("2It's a link for google");
		menu2.setLinkUrl("2www.google.com.hk");
		Menu menu3 = new Menu();
		menu3.setName("dd");
		menu3.setOrderNumber(1);
		menu3.setParentId(1);
		menu3.setRemark("3It's a link for google");
		menu3.setLinkUrl("3www.google.com.hk");
		List<Menu> menuList = new ArrayList<Menu>();
		menuList.add(menu);
		menuList.add(menu2);
		menuList.add(menu3);
		int i = 0;
		try{
		for(Menu mn : menuList){
			/*if(i==2){
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}*/
			menuMapper.insertMenu(mn);
			System.out.println(mn.getName());
			i++;
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Transactional
	public void deleteMenu() {
		int[] ids = {107,108,3123};
		for(int id : ids){
			menuMapper.deleteMenu(id);
		}
		Menu menu = new Menu();
		menu.setName("ddddd");
		menu.setOrderNumber(1);
		menu.setParentId(1);
		menu.setRemark("It's a link for google");
		menu.setLinkUrl("www.google.com.hk");
		menuMapper.insertMenu(menu);
	}

	
 

	@Test
	public void getAllMenu() {
		List<Menu> menuList = menuMapper.getAllMenu();
		for(Menu menu : menuList){
			System.out.println(menu.getName());
		}
	}

	public MenuMapper getMenuMapper() {
		return menuMapper;
	}

	public void setMenuMapper(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}
}
