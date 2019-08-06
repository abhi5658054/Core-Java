package com.greatlearning.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.greatlearning.model.Bidder;
import com.greatlearning.model.Item;

public class Auction {
	
	public static void main(String[] args) throws Exception {
		List<Item> items = addItems();
		CountDownLatch latch = new CountDownLatch(4*items.size());
		Iterator<Item> itemIterator = items.iterator();
		Bidder b1 = new Bidder( 1, "Vinay" , 1000, latch );
		Bidder b2 = new Bidder( 2, "Krishna" ,18000, latch );
		Bidder b3 = new Bidder( 3, "Mohan" , 12000, latch );
		Bidder b4 = new Bidder( 4, "Rohan" , 6000, latch );
		
		ArrayList<Bidder> bid= new ArrayList<>();
		
		bid.add(b1);
		bid.add(b2);
		bid.add(b3);
		bid.add(b4);
		
		ArrayList<Bidder> bidder = bid;
	
		
		Scanner scan = new Scanner(System.in);
		Iterator<Bidder> bidderIterator = bidder.iterator();
		while (itemIterator.hasNext()){
			Item i = itemIterator.next();
			double initial = 0;
			String winner = "none";
			System.out.println("=============="+i.getName() +"for Sale, Base Price - "+i.getBasePrice()+"================");  
			
			Thread t1 = new Thread(b1);
			Thread t2 = new Thread(b2);
			Thread t3 = new Thread(b3);
			Thread t4 = new Thread(b4);
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
			latch.await(30, TimeUnit.SECONDS);
			while (bidderIterator.hasNext()){
				
				Bidder b = bidderIterator.next();
				System.out.println(b.getBidPrice());
				if((initial < b.getBidPrice()) && (b.getBidPrice() > i.getBasePrice())){
					initial = b.getBidPrice();
					winner = b.getName();
				}
			}
			if(winner !="none"){
			System.out.println("============"+i.getName()+" sold to "+ winner+" - "+initial+"===================");
			}
			else{
				System.out.println("============"+i.getName()+" sold to "+ winner+" No body has bidded===================");
			}
		}
				
	}
		
	public static List<Item> addItems(){
		List<Item> item = new LinkedList<Item>();		
		item.add(new Item ( 1, "Swift-Dezire", 5_00_000, "good condition car"));
		item.add(new Item (2, "Sony-Bravia", 10_000, "in excellent condition"));
		item.add(new Item (3, "Bajaj- Pulsar", 30_000, "run for 20000 Kms"));
		item.add(new Item (4, "Macbook-Pro", 50000, "one year old laptop. Sparingly used"));
		return item;
	}
	
}
