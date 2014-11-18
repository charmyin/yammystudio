package com.charmyin.cmstudio.basic.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.charmyin.cmstudio.basic.authorize.persistence.OrganizationMapper;
import com.charmyin.cmstudio.basic.authorize.persistence.OrganizationMapper;
import com.charmyin.cmstudio.basic.authorize.vo.Organization;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-context.xml"})
@TransactionConfiguration(defaultRollback=false)
public class OrganizationT{
	
	@Resource
	private OrganizationMapper organizationMapper;
	
	@Test
	public void getOrganizationEqual() {
		Organization organization1 = new Organization();
		organization1.setParentId(1);
		List<Organization> organizationList = organizationMapper.getOrganizationEqual(organization1);
		
		for(Organization organization : organizationList){
			System.out.println(organization.getName());
		}
	}
	
	@Test
	public void updateOrganization(){
		Organization organization = new Organization();
		organization.setId(5);
		organization.setName("love");
		organizationMapper.updateOrganization(organization);
	}

	@Test
	public void getOrganizationLike() {
		Organization organization1 = new Organization();
		organization1.setName("delete");
		List<Organization> organizationList = organizationMapper.getOrganizationLike(organization1);
		
		for(Organization organization : organizationList){
			System.out.println(organization.getName());
		}
	}

	@Test
	public void getOrganizationById() {
		Organization organization = organizationMapper.getOrganizationById(5);
		System.out.println(organization.getId()+"=="+organization.getName());
	}

	@Test
	public void insertOrganization() {
		Organization organization = new Organization();
		organization.setName("root");
		organization.setOrderNumber(1);
		organization.setRemark("Root node");
		organizationMapper.insertOrganization(organization);
	}
	
	@Test
	@Transactional
	public void insertOrganizationBatchInTransaction(){
		Organization organization = new Organization();
		organization.setName("dddd");
		organization.setOrderNumber(1);
		organization.setParentId(1);
		organization.setRemark("It's a link for google");
		Organization organization2 = new Organization();
		organization2.setName("2dddd");
		organization2.setOrderNumber(213);
		organization2.setParentId(1);
		organization2.setRemark("2It's a link for google");
		Organization organization3 = new Organization();
		organization3.setName("dd");
		organization3.setOrderNumber(1);
		organization3.setParentId(1);
		organization3.setRemark("3It's a link for google");
		List<Organization> organizationList = new ArrayList<Organization>();
		organizationList.add(organization);
		organizationList.add(organization2);
		organizationList.add(organization3);
		int i = 0;
		try{
		for(Organization mn : organizationList){
			/*if(i==2){
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}*/
			organizationMapper.insertOrganization(mn);
			System.out.println(mn.getName());
			i++;
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Transactional
	public void deleteOrganization() {
		int[] ids = {3};
		for(int id : ids){
			organizationMapper.deleteOrganization(id);
		}
		Organization organization = new Organization();
		organization.setName("ddddd");
		organization.setOrderNumber(1);
		organization.setParentId(1);
		organization.setRemark("It's a link for google");
	//	organizationMapper.insertOrganization(organization);
	}

	
 

	@Test
	public void getAllOrganization() {
		List<Organization> organizationList = organizationMapper.getAllOrganization();
		for(Organization organization : organizationList){
			System.out.println(organization.getName());
		}
	}

	public OrganizationMapper getOrganizationMapper() {
		return organizationMapper;
	}

	public void setOrganizationMapper(OrganizationMapper organizationMapper) {
		this.organizationMapper = organizationMapper;
	}
}
