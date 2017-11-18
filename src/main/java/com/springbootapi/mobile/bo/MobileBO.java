package com.springbootapi.mobile.bo;

import java.util.List;

import com.springbootapi.mobile.model.MobileEntity;

/**
 * 
 * @author Vinicius Falcão
 *
 */
public interface MobileBO {

	MobileEntity insertNewMobile(MobileEntity mobile);

	MobileEntity getMobileByCode(String code);

	List<MobileEntity> getAllMobiles();

}
