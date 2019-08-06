package com.greatlearning.model;

import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Bidder  implements Runnable, Comparator<Bidder> {
	 private long id; 
	 private String name;
	 private int delay;
	 private CountDownLatch countDownLatch;
	 private double bidPrice;
	 Scanner scan = new Scanner(System.in);
	 
	 public Bidder(long id, String name, int delay, CountDownLatch countDownLatch) {
			super();
			this.id = id;
			this.name = name;
			this.delay = delay;
			this.countDownLatch = countDownLatch;
	 }

	public Bidder(long id, String name, int delay) {
			this.id = id;
			this.name = name;
			this.delay = delay;
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
	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	} 
	
	@Override
	public void run() {
		execute();
	}

	private void execute() {
		try {
			Thread.sleep(this.delay);
			System.out.println("Bidder"+ this.getId() + " - "+ this.getName()+"\n===============Please enter your bid price, Base price - ==========");
			double b = scan.nextDouble();
			this.setBidPrice(b);
			this.countDownLatch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int compare(Bidder o1, Bidder o2) {
		return Double.compare(o1.getBidPrice(),o2.getBidPrice());
	}
 
}
