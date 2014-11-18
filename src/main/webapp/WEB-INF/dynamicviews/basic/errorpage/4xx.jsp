<%
	/**
	 * This is the Error page for 4xx~ 
	 * @author charmyin
	 * @since 2013-10-17 19:26:44
	 * @serial 1.0
	 */
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="/WEB-INF/tlds/cmstudio.tld" prefix="cmstudio" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>${application_name_cn}</title>
	<cmstudio:htmlBase />
	<link rel="shortcut icon" type="image/x-icon" href="resources/${icon_name}"/>
	<link rel="stylesheet" type="text/css" href="resources/css/basic/errorpage/4xx.css" />
</head>
<body>
	<div id="wordDiv">
		<h1>${status_code}!&nbsp;请求出错! </h1>
	</div>
	<div id="picDiv">
		<img src="resources/css/basic/errorpage/wow.gif"/>
	</div>
	<div id="gobackDiv">
		<a href="javascript:history.go(-1);">&lt;&lt;返回</a>
	</div>
</body>
</html>