package com.springbootapi.mobile.facade;

import java.util.List;

import com.springbootapi.mobile.model.MobileEntity;

public interface MobileFacade {

	MobileEntity insertNewMobile(MobileEntity mobile);

	MobileEntity getMobileByCode(String code);

	List<MobileEntity> getAllMobiles();

}
