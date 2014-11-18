package com.charmyin.cmstudio.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic/menu")
public class UserMain {
	//TODO Deprecated
	//菜单CRUD界面
	@RequestMapping(method = RequestMethod.GET, value = { "/manage" })
	public String MenuManage(){
		return "/basic/menu_manage";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {},  produces="application/json")
	public @ResponseBody String getMenu(Model model){
		return "";
	}
	
}
