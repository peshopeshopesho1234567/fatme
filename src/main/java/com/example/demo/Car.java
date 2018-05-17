package com.example.demo;

public class Car {

	private String brand;
	private String model;
	private float galonsPerMile;
	
	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public float getGalonsPerMile() {
		return galonsPerMile;
	}

}
