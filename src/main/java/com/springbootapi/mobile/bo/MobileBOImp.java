package com.springbootapi.mobile.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootapi.mobile.dao.MobileRepository;
import com.springbootapi.mobile.model.MobileEntity;

/**
 * 
 * @author Vinicius Falcão
 *
 */
@Component
public class MobileBOImp implements MobileBO {

	@Autowired
	private MobileRepository mobileDAO;

	public MobileEntity insertNewMobile(MobileEntity mobile) {
		return mobileDAO.save(mobile);
	}

	public MobileEntity getMobileByCode(String code) {
		return mobileDAO.findOne(code);
	}

	public List<MobileEntity> getAllMobiles() {
		return mobileDAO.findAll();
	}

}
