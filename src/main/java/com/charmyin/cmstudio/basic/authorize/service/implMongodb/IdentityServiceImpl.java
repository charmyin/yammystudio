package com.charmyin.cmstudio.basic.authorize.service.implMongodb;

import org.springframework.beans.factory.annotation.Autowired;

import com.charmyin.cmstudio.basic.authorize.domain.Identity;
import com.charmyin.cmstudio.basic.authorize.form.RegistrationForm;
import com.charmyin.cmstudio.basic.authorize.repository.RegistrationFormRepository;
import com.charmyin.cmstudio.basic.authorize.service.IdentityCommonService;
import com.charmyin.cmstudio.basic.authorize.service.IdentityService;

public class IdentityServiceImpl implements IdentityService {

	@Autowired
	private RegistrationFormRepository repository;
	
	@Autowired(required = true)
	IdentityCommonService identityCommonService;
	
	@Override
	public Identity registerIdentity(RegistrationForm registration) {
		// TODO Auto-generated method stub
		/*INSERT INTO shiro_user (login_id, passphrase, salt, email, date_created)
		VALUES (#{loginId}, #{passphrase}, #{salt}, #{email}, NOW()) ;*/
		registration.setSalt(identityCommonService.getSalt());
		registration.setPassphrase(identityCommonService.encodePassphrase(registration.getPassphrase(), registration.getSalt()));
		
		//identityMapper.registerIdentity(registration);
		RegistrationForm rf = repository.save(registration);
		Identity id = new Identity();
		id.setId(rf.getId());
		id.setLoginId(rf.getLoginId());
		id.setSalt(rf.getSalt());
		id.setEmail(rf.getEmail());
		return id;
	}

	@Override
	public Identity getIndentity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Identity getIdentity(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Identity getIdentity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
