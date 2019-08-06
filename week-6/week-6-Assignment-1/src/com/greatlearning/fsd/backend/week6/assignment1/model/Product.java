package com.greatlearning.fsd.backend.week6.assignment1.model;

import java.io.*;

public class Product implements Comparable<Product>, Serializable {
	/**
	 * Product Class
	 */
	private static final long serialVersionUID = 2038791422211907547L;
	private long id;
	private String name;
	private double price;
	private String desc;
	
	/**
	 * Constructor
	 * */
	public Product(long id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void displayItem() {
		System.out.println(this.id + " "+ this.name + " " +this.price);
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(this.price > o.price) {
			return 1;
		} 
		else if(this.price < o.price) {
			return -1;
		}
		return 0;
	}
	
	
}
