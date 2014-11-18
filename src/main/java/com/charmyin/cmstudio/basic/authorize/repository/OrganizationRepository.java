package com.charmyin.cmstudio.basic.authorize.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.charmyin.cmstudio.basic.authorize.vo.Organization;

@Repository
public interface OrganizationRepository extends MongoRepository<Organization, String> {

}
