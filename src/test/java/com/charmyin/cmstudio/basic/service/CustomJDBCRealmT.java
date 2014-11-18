package com.charmyin.cmstudio.basic.service;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;

import com.charmyin.cmstudio.basic.authorize.vo.Permission;

/**
 * 测试权限操作，CustomJDBCRealm
 * @author YinCM
 * @since
 */
public class CustomJDBCRealmT {

	@Test
	public void testRawPermissionToSimplePermission(){
		String rawPermissionJson = "[{\"permission\":\"aaaa:bbb:ddd\",\"remark\":\"bbb\"},{\"permission\":\"ddd\",\"remark\":\"eeee\"}]";
		ObjectMapper mapper = new ObjectMapper();
		List<Permission> permissions = null;
		try {
			permissions = mapper.readValue(rawPermissionJson, new TypeReference<List<Permission>>() {});
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(permissions!=null){
			for(Permission perm : permissions){
				System.out.println(perm.getPermission());
			}
		}
		
	}
}
