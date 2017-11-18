package com.springbootapi.mobile.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.springbootapi.mobile.bo.MobileBO;
import com.springbootapi.mobile.model.MobileEntity;

/**
 * 
 * @author Vinicius Falcão
 *
 */
@Component
public class MobileFacadeImp implements MobileFacade {

	@Autowired
	private MobileBO mobileBO;

	public MobileEntity insertNewMobile(MobileEntity mobile) {
		return mobileBO.insertNewMobile(mobile);
	}

	@Cacheable(value = "mobileEntity", key = "#code", unless = "#result == null")
	public MobileEntity getMobileByCode(String code) {
		return mobileBO.getMobileByCode(code);
	}

	public List<MobileEntity> getAllMobiles() {
		return mobileBO.getAllMobiles();
	}

}
