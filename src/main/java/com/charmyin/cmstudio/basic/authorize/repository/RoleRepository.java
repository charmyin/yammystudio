package com.charmyin.cmstudio.basic.authorize.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.charmyin.cmstudio.basic.authorize.vo.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {

}
