package com.charmyin.cmstudio.basic.authorize.service;

import org.apache.shiro.crypto.hash.Sha512Hash;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.charmyin.cmstudio.basic.authorize.form.RegistrationForm;
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-context.xml"})*/
public class IdentityServiceT {
	
	@Autowired(required = true)
	 private IdentityService identityService;
	
	@Test
	public void testregisterIdentity(){
		RegistrationForm rg = new RegistrationForm();
		rg.setPassphrase("96E79218965EB72C92A549DD5A330112");
		rg.setEmail("admin@admin.com");
		rg.setLoginId("admin");
		
		//this.identityService.registerIdentity();
		System.out.println("Successs!!!");
	}

	public IdentityService getIdentityService() {
		return identityService;
	}

	public void setIdentityService(IdentityService identityService) {
		this.identityService = identityService;
	}
	@Test
	public void encodeSha512(){
		//String str = new Sha512Hash("111111", "qpOvViSVIY7XyYMpAsJHnQ==", new Integer(1024).toBase64());
	}
	
	
	public String encodePassphrase(String rawPassphrase, String salt){
		return null;
	}
	
	public Integer getIterations(){
		return Integer.parseInt("1024");
	}
}
