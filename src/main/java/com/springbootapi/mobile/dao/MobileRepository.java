package com.springbootapi.mobile.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springbootapi.mobile.model.MobileEntity;

/**
 * 
 * @author Vinicius Falcão
 *
 */
@Repository("mobileRepository")
public interface MobileRepository extends MongoRepository<MobileEntity, String> {

}
