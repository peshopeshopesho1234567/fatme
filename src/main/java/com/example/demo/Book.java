package com.example.demo;

public class Book {

	private long id;
	private String name;
	
	public Book(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
