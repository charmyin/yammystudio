package com.charmyin.cmstudio.basic.authorize.service;


import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * Implement from IdentityService
 * @author charmyin
 *
 */
@Service
public class IdentityCommonService {
	
	@Autowired
	private Environment env;
	
	public void setEnv(Environment env){
		this.env = env;
	}
 
	public String getSalt(){
		return new SecureRandomNumberGenerator().nextBytes().toBase64();
	}
	
	public String getApplicationSalt(){
		return env.getProperty("shiro.applicationSalt");
	}
	
	public String getCombinedSalt(String salt){
		return env.getProperty("shiro.applicationSalt") + ":" + salt;
	}
	
	public String encodePassphrase(String rawPassphrase, String salt){
		return new Sha512Hash(rawPassphrase, getCombinedSalt(salt), getIterations()).toBase64();
	}
	
	public Integer getIterations(){
		return Integer.parseInt(env.getProperty("shiro.hashIterations"));
	}
	
}
