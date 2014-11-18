package com.charmyin.cmstudio.common.utils;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.charmyin.cmstudio.web.utils.ResponseUtil;

/**
 * Jsr validation util
 * @author YinCM
 *
 */
public class JSRErrorUtil {
	
	/**
	 * Get error info string from result
	 * @param result
	 * @return
	 */
	public static String getErrorString(BindingResult result){
		List<FieldError> errors = result.getFieldErrors();
    	String errorInfo = "";
        for (FieldError error : errors ) {
        	errorInfo += error.getDefaultMessage()+"  ";
        }
        return ResponseUtil.getFailResultString(errorInfo);
	}
}
