package com.greatlearning.fsd.week6.assignment3;

import java.io.*;
//import java.util.*;
public class Client {
	
	public static void main(String args[]) {
		String directory = System.getProperty("user.home");  
		String fileName = "sample.txt";  
		String absolutePath = directory + File.separator + fileName;
		
		System.out.println(directory);
		System.out.println(fileName);
		System.out.println(absolutePath);
		
		try(FileWriter fileWriter = new FileWriter(absolutePath)) {  
			for(int index =1; index <= 100; index++) {
				String fileContent = Integer.toString(index);
			    fileWriter.write(fileContent);
			    fileWriter.write("\n");
			}	    
		} catch (IOException e) {
		    // exception handling
		}
		
		try(FileReader fileReader = new FileReader(absolutePath)) {  
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileReader.read();
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
	}
}
