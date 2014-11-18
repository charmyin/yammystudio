package com.charmyin.cmstudio.basic.authorize.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.charmyin.cmstudio.basic.authorize.form.RegistrationForm;

@Repository
public interface RegistrationFormRepository extends MongoRepository<RegistrationForm, String> {

}
