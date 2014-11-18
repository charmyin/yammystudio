package com.charmyin.cmstudio.basic.tags;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.log4j.Logger;

/**
 * 	This tag is used for import js or css in a jsp file which has already 
 * been written in the path "commonpart/jscss".
 * 	The path could be commonpart/jscss/{name}_{version}.jsp .
 *  Then generate <% include url="dynamicviews/commonpart/jscss/{name}_{version}.jsp" %> 
 * @author charmyin
 * @since 2013-7-19
 * @serial 1.0
 * 
 */
public class ImportJsCssTag extends TagSupport {
	
	Logger logger = Logger.getLogger(this.getClass());
	 
	private static final long serialVersionUID = 1L;
	
	/**
	 * Js or css lib name.
	 */
	private String name;
	/**
	 * Js or css lib version
	 */
	private String version;
	
	/*
	 * Import the jsp file which contains the js or css links by name and version value. 
	 * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
	 */
	@Override
	public int doStartTag() throws JspException {
		try {
			this.pageContext.include("/WEB-INF/dynamicviews/commonpart/jscss/"+this.name+"_"+this.version+".jsp");
			logger.debug("/WEB-INF/dynamicviews/commonpart/jscss/"+this.name+"_"+this.version+".jsp  --- has been loaded to file!");
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch(ServletException se){
			se.printStackTrace();
			logger.error(se.getMessage());
		}
		return super.doStartTag();
	}

	@Override
	public int doEndTag() throws JspException {
		
		return super.doEndTag();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
