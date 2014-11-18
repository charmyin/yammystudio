package com.charmyin.cmstudio.web.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Do some helpful method for spring controller
 * @author charmyin
 * @since 2013-8-23
 *
 */
public class ResponseUtil {
	
	/**
	 * Get SuccessResultMap which has a map of ("suc", true) in it;
	 * @return
	 */
	public static Map<String, Object> getSuccessResultMap(){
		Map<String, Object> successResultMap = new HashMap<String, Object>();
		successResultMap.put("suc", true);
		return successResultMap;
	}
	
	/**
	 * Get SuccessResultMap which has a map of ("suc", false) in it;
	 * @return
	 */
	public static Map<String, Object> getFailResultMap(){
		Map<String, Object> failResultMap = new HashMap<String, Object>();
		failResultMap.put("suc", false);
		return failResultMap;
	}
	
	/**
	 * Get the Success String return for ie
	 * @return
	 */
	public static String getSuccessResultString(){
		return "{'suc':true}";
	}
	
	/**
	 * Get the failed String result for ie
	 * @param msg
	 * @return
	 */
	public static String getFailResultString(String msg){
		return "{'suc':false, 'errorMsg':'"+msg+"'}";
	}
	/**
	 * Get the failed String result for ie
	 * @param msg
	 * @return
	 */
	public static String getFailResultJsonString(String msgObj){
		return "{'suc':false, 'errorMsg':"+msgObj+"}";
	}
}
