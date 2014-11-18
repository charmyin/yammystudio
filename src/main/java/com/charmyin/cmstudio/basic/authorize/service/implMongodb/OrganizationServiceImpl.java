package com.charmyin.cmstudio.basic.authorize.service.implMongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.charmyin.cmstudio.basic.authorize.service.OrganizationService;
import com.charmyin.cmstudio.basic.authorize.vo.Menu;
import com.charmyin.cmstudio.basic.authorize.vo.Organization;

public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private MongoOperations mongoOperations;
	
	@Override
	public List<Organization> getAllOrganization() {
		List<Organization> list = mongoOperations.find(new Query(), Organization.class, "basic_organization");
		return list;
	}

	@Override
	public List<Organization> getChildrenOrganizations(int parentId) {
		List<Organization> list = mongoOperations.find(new Query(Criteria.where("parentId").is(parentId)), Organization.class, "basic_organization");
		return list;
	}

	@Override
	public void updateOrganization(Organization organization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertOrganization(Organization organization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOrganization(int[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public Organization getOrganizationById(int id) {
		Organization org = mongoOperations.findOne(new Query(Criteria.where("_id").is(id)), Organization.class, "basic_organization");
		return org;
	}

	@Override
	public int getCooporationId(int orgId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
