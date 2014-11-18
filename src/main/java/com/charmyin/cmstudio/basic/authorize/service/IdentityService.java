package com.charmyin.cmstudio.basic.authorize.service;


import com.charmyin.cmstudio.basic.authorize.domain.Identity;
import com.charmyin.cmstudio.basic.authorize.form.RegistrationForm;

/**
 * Implement from IdentityService
 * @author charmyin
 *
 */

public interface IdentityService {

	public Identity registerIdentity(RegistrationForm registration);
	public Identity getIndentity(int id);
	public Identity getIdentity(String userId);
	public Identity getIdentity(int id);

}
