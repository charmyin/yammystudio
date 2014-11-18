package com.charmyin.cmstudio.basic.authorize.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.charmyin.cmstudio.basic.authorize.vo.User;

@Repository
public interface UsersRepository extends MongoRepository<User, String> {

}
