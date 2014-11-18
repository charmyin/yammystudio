package com.charmyin.cmstudio.basic.initial;

/**
 * @author charmyin
 * @version 2013-7-22
 * The interfaces annotated by this annotation will be treated as the mapper interface in mybatis, thier implementations will be injected to spring context
 * So it is like a filter, to mark the interface which is used by mybatis as mapper.
 */
public @interface SQLMapper {
	
}
