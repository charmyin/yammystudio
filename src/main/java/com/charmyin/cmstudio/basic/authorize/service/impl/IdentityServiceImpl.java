package com.charmyin.cmstudio.basic.authorize.service.impl;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.basic.authorize.domain.Identity;
import com.charmyin.cmstudio.basic.authorize.form.RegistrationForm;
import com.charmyin.cmstudio.basic.authorize.persistence.IdentityMapper;
import com.charmyin.cmstudio.basic.authorize.service.IdentityCommonService;
import com.charmyin.cmstudio.basic.authorize.service.IdentityService;


@Service
@PropertySource("classpath:application-spring.properties")
public class IdentityServiceImpl implements IdentityService {	
	
	@Autowired(required = true)
	private IdentityMapper identityMapper;
	
	@Autowired(required = true)
	IdentityCommonService identityCommonService;
	
	private static final Logger logger = LoggerFactory.getLogger(Identity.class);
	
	public IdentityMapper getIdentityMapper(){
		return identityMapper;
	}
	
	@Override
	public Identity registerIdentity(RegistrationForm registration){
		
		registration.setSalt(getSalt());
		registration.setPassphrase(identityCommonService.encodePassphrase(registration.getPassphrase(), registration.getSalt()));
		
		identityMapper.registerIdentity(registration);
		
		logger.trace("INSERTED ID = (" + registration.getId() + ")");
		return this.getIdentity(registration.getId());
	}
	
	
/*	public void registerIdentity(){
		RegistrationForm registration = new RegistrationForm();
		registration.setSalt(getSalt());
		registration.setPassphrase(identityCommonService.encodePassphrase("111111", registration.getSalt()));
		System.out.println("salt="+registration.getSalt()+"  pasd:"+registration.getPassphrase());
		
		identityMapper.registerIdentity(registration);
		
		logger.trace("INSERTED ID = (" + registration.getId() + ")");
		//return this.getIdentity(registration.getId());
	}
	*/
	public static String getSalt(){
		return new SecureRandomNumberGenerator().nextBytes().toBase64();
	}
	
	public Identity getIndentity(int id){
		logger.trace("Enter getIdentiry(" + id + ")");
		if(identityMapper == null){
			logger.debug("identityMapper didn't get autowired!");
		}
		return identityMapper.getIdentityById(id);
	}
	
	public Identity getIdentity(String userId){
		logger.trace("Enter getIdentiry(" + userId + ")");
		if(identityMapper == null){
			logger.debug("identityMapper didn't get autowired!");
		}
		return identityMapper.getIdentityByUserId(userId);
	}
	
	public Identity getIdentity(int id){
		logger.trace("Enter getIdentiry(" + id + ")");
		if(identityMapper == null){
			logger.debug("identityMapper didn't get autowired!");
		}
		return identityMapper.getIdentityById(id);
	}
	
	public void setIdentityMapper(IdentityMapper identityMapper){
		this.identityMapper = identityMapper;
	}
}
