package com.charmyin.cmstudio.basic.authorize.persistence;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.charmyin.cmstudio.basic.authorize.domain.Identity;
import com.charmyin.cmstudio.basic.authorize.form.RegistrationForm;
import com.charmyin.cmstudio.basic.initial.SQLMapper;

/**
 * Mybatis Mapper Interface used for User Identity
 * @author charmyin
 *
 */
@Component
@SQLMapper
public interface IdentityMapper {
	
	public Identity getIdentityById(@Param("id") int id);
	
	public Identity getIdentityByUserId(@Param("loginId") String loginId);
	
	public Integer registerIdentity(RegistrationForm registration);
}
