package com.springbootapi.mobile.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

/**
 * 
 * @author Vinicius Falcão
 *
 */
public class MobileEntity implements Serializable {

	private static final long serialVersionUID = 2880715023348147985L;

	@Id
	private String code;

	private float price;
	private String model;
	private String brand;
	private String photo;
	private String date;

	public MobileEntity(float price, String model, String brand, String photo, String date) {
		super();
		this.price = price;
		this.model = model;
		this.brand = brand;
		this.photo = photo;
		this.date = date;
	}

	public MobileEntity() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
