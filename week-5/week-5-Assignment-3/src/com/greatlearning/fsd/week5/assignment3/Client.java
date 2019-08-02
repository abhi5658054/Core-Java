package com.greatlearning.fsd.week5.assignment3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

import com.greatlearning.fsd.week5.assignment3.Employee.Department;

public class Client {
	
	public static void main(String args[]) {
		
		Department hr        = Department.HR;
		Department finance   = Department.FINANCE;
		Department marketing = Department.MARKETING;
		Department sales     = Department.SALES;
		
		Employee emp1 = new Employee(1, "Abhihsek1", 25, 5000,hr);
		Employee emp2 = new Employee(2, "Abhihsek2", 26, 6000,hr);
		Employee emp3 = new Employee(3, "Abhihsek3", 27, 10000,finance);
		Employee emp4 = new Employee(4, "Abhihsek4", 28, 15000,finance);
		Employee emp5 = new Employee(5, "Abhihsek5", 29, 8000,hr);
		
		Employee emp6 = new Employee(6, "Abhihsek6", 22, 5000,hr);
		Employee emp7 = new Employee(7, "Abhihsek7", 33, 100000,marketing);
		Employee emp8 = new Employee(8, "Abhihsek8", 35, 75000,marketing);
		Employee emp9 = new Employee(9, "Abhihsek9", 40, 85000,sales);
		Employee emp10 =new Employee(10, "Abhihsek10", 18, 50000,sales);
		
		System.out.print("susu");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);
		empList.add(emp8);
		empList.add(emp9);
		empList.add(emp10);
		
		List<Employee> sortedList = new ArrayList<Employee>();
		
		Scanner sc = new Scanner(System.in);
		
		int userInput = sc.nextInt();
		
		switch(userInput){
			case 1:{
				System.out.println("Please Enter age number");
				int userAge = sc.nextInt();
				sortedList = filterEmployee(empList, p -> p.getAge() < userAge );
				sortedList.forEach( e -> System.out.println(e.toString()));
				break;
			}
			case 2:{
				System.out.println("Please Enter age number");
				int userAge = sc.nextInt();
				sortedList = filterEmployee(empList, p -> p.getAge() > userAge );
				sortedList.forEach( e -> System.out.println(e.toString()));
				break;
			}
			case 3:{
				System.out.println("Please enter your Age");
				int userAge = sc.nextInt();
				String userDept = sc.nextLine();
				sortedList = filterEmployee(empList, p -> p.getAge() > userAge && p.getDepartment().equals(userDept));
				sortedList.forEach( e -> System.out.println(e.toString()));
			}
			case 4:{
				System.out.println("Please enter your Age");
				int userAge = sc.nextInt();
				String userDept = sc.nextLine();
				sortedList = filterEmployee(empList, p -> p.getAge() < userAge && p.getDepartment().equals(userDept));
				sortedList.forEach( e -> System.out.println(e.toString()));
			}
				
		}
		
		
		
		
		
		
		
	}
	
	private static List<Employee> filterEmployee(List<Employee> employeeList, Predicate<Employee> predicate){
		
		List<Employee> filteredEmployee = new ArrayList<Employee>();
		
		for(Employee p : employeeList) {
			if(predicate.test(p)) {
				filteredEmployee.add(p);
			}
		}
		return filteredEmployee;
	}

}
