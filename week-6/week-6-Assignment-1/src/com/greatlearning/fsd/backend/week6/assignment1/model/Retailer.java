package com.greatlearning.fsd.backend.week6.assignment1.model;


/**
 * Importing the package required for the concurrency and Expcetions
 * */
import java.lang.InterruptedException;
import java.util.concurrent.BlockingQueue;


/* Retailer class extends the Thread Class */
/*
 * Implementation can also be done using Runnable interfaces
 * */
public class Retailer extends Thread {
	
	private long id;
	private String retailerName;
	private BlockingQueue<Product> inventory;
	
	
	public Retailer(long id, String name,BlockingQueue<Product> inventory) {
		super();
		this.id = id;
		this.inventory = inventory;
		this.retailerName = name;
	}
	
	


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}




	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
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




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public BlockingQueue<Product> getInventory() {
		return inventory;
	}


	public void setInventory(BlockingQueue<Product> inventory) {
		this.inventory = inventory;
	}
	
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	
	public String getRetailerName() {
		return this.retailerName;
	}
	
	
	
	public void run() {
		//no synchronization needed
		
		for(int i=0; i < 10; i++) {
			System.out.println(getName()+" Retailer");
			try {
				inventory.put(new Product(i, "product",5000+100*i ));
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
