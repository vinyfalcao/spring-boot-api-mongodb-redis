package com.springbootapi.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapi.mobile.facade.MobileFacade;
import com.springbootapi.mobile.model.MobileEntity;

/**
 * 
 * @author Vinicius Falcão
 *
 */
@RestController
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	private MobileFacade mobileFacade;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<MobileEntity> insertNewMobile(@RequestBody MobileEntity mobile) {
		return new ResponseEntity<MobileEntity>(mobileFacade.insertNewMobile(mobile), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<MobileEntity>> getMobiles() {
		return new ResponseEntity<List<MobileEntity>>(mobileFacade.getAllMobiles(), HttpStatus.OK);
	}

	@RequestMapping(path = "/{code}", method = RequestMethod.GET)
	public ResponseEntity<MobileEntity> getMobileByCode(@PathVariable("code") String code) {
		return new ResponseEntity<MobileEntity>(mobileFacade.getMobileByCode(code), HttpStatus.OK);
	}

}
