package com.charmyin.cmstudio.basic.exception.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.charmyin.cmstudio.web.utils.ResponseUtil;

/**
 * Handle the Exceptions redirect by the <error-page> in web.xml
 * 
 * @author YinCM
 * @since 2013-10-17 9:20:07
 */
@Controller
public class ErrorController {

	@RequestMapping(value = "/clientError")
	public ModelAndView  handle(HttpServletRequest request, HttpServletResponse response, Model model) throws NullPointerException {
		//Get status code
		Object status_codeObj = request.getAttribute("javax.servlet.error.status_code");
		if(status_codeObj!=null){
			model.addAttribute("status_code", status_codeObj);
		}else{
			model.addAttribute("status_code", "T_T");
		}
		
		//request.getAttribute("javax.servlet.forward.request_uri");
		response.setStatus(200);
		Object originalUriObj = request.getAttribute(RequestDispatcher.FORWARD_CONTEXT_PATH);
	    String originalUri = null;
		if(originalUriObj!=null){
			originalUri = (String)originalUriObj;
			return new ModelAndView("/basic/errorpage/4xx","origialUri", originalUri);
		}
		else{
			throw new NullPointerException();
		}
	}
	
	@RequestMapping(value = "/throwError", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String handleReturnJson(HttpServletRequest request, HttpServletResponse response) {
		StringBuilder resultStr = new StringBuilder();
		//Get status code
		resultStr.append("{'status':'"+request.getAttribute("javax.servlet.error.status_code")+"'");
		
		Throwable throwable = (Throwable)request.getAttribute("javax.servlet.error.exception");
		if(throwable!=null){
			resultStr.append(",'errorClassName':'"+throwable.getClass().getName()+"'");
			resultStr.append(",'errormsg':'"+throwable.getMessage()+"'}");
		}else{
			resultStr.append(",'errormsg':'Unknown Server Error'}");
		}
		
		response.setStatus(200);
		
		return ResponseUtil.getFailResultJsonString(resultStr.toString());
	}

}
