package com.greatlearning.fsd.backend.week6.assignment1.client;

/*
 * Custom Packages import
 * */
import com.greatlearning.fsd.backend.week6.assignment1.model.*;

/**
 * Java Package import
 * */
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * This problem is special Case of Producer and Consumer Solution
 * 
 * Producer Consumer problem is one of the classic multi threading problems in computer science and the multi-threading world. 
 * It's tricky because it involves inter thread communication,  
 * but it's important because most of the multi threading problems fits into this category.
 * There are many ways to solve producer consumer problem in Java e.g. you can solve this by using wait() and notify() method.
 * 
 * In order to solve the producer-consumer problem, we will create two threads which will simulate producer and consumer and instead of shared object 
 * we will use the shared BlockingQueue
 * 
 * The java.util.concurrent.BlockingQueue is an interface and comes with two ready-made implementations then ArrayLinkedBlockingQueue and LinkedBlockingQueue. 
 * As the name suggests, one is backed by an array while other is backed by linked list.
 * 
 * */
public class InventoryManagementClient {
	
	public static void main(String args[]) {
		BlockingQueue<Product> inventory = new LinkedBlockingQueue<Product>();
		
		Distributor distributor = new Distributor(1, "GL", inventory);
		Retailer retailer      = new Retailer(1, "GL-Student", inventory);
		
		distributor.start();
		retailer.start();
	}

}
