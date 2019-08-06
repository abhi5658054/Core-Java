package com.greatlearning.fsd.week6.assignment3;

import java.util.*;
import java.io.*;

public class ClientRead {
	
	public static void main(String args[]) {
		String absolutePath;
		Scanner sc = new Scanner(System.in);
		absolutePath = sc.nextLine();
		
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
