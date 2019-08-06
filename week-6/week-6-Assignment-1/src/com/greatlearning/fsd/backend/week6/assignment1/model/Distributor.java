package com.greatlearning.fsd.backend.week6.assignment1.model;


import java.util.concurrent.BlockingQueue;

public class Distributor extends Thread {
	private long id;
	private String name;
	private final BlockingQueue<Product> inventory;
	private final int MAX_CAPACITY = 10;
	//private static int count = 0;
	
	public Distributor(long id, String name, BlockingQueue<Product> inventory) {
		super();
		this.id = id;
		this.name = name;
		this.inventory = inventory;
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
	
	
	public String getDistributorName() {
		return this.name;
	}
	
	
	
	
	public BlockingQueue<Product> getInventory() {
		return inventory;
	}

	public void run() {
		try {
            while (true) {
                Product item = inventory.take();
                System.out.print(getName() + " consumed ");
                item.displayItem();
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
