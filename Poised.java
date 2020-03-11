package task7;

import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;

public class Poised {

	public static void main(String[] args) throws Exception{	
		
		// Declaring variables for poised details
		int projectNumber = 0, erfNumber  = 0, totalPrice = 0;
		String taskOption = "", userChoice = "", projectName = "", projectType = "", address = "", dueDate = "", personType = "", firstName = "", 
				secondName = "", cellNumber = "", email = "", amountDue = "", amountPaid = "", contractorCell = "";
		
		//Reads user input
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		// Creating 'Poised' workers
		Person employee1 = new Person("Contractor", "Mushtaq", "Rossier", "62 First Ave", "0762551874", "mushtaq@gmail.com");
		Person employee2 = new Person("Architect", "John", "Wick", "40 Aberdeen str", "0722151474", "wick@gmail.com");
		Person customer1;
		
		// Menu options
		System.out.println("Menu: \n1 - Fill in customer details \n2 - Fill in project details \n3 - Change due date of project "
				+ "\n4 - Change the total amount of the fee paid to date \n5 - Update contractor's details \n6 - Print invoice \n7 - Exit program \n");
		
		// Loops through menu options until user decides to exit program	
		while(taskOption != "7")
		{
			System.out.print("Enter your task option: \n");
			taskOption = input.readLine();
			
			if(taskOption.equals("1"))
			{
				while(true) 
				{
					
					System.out.println("Which person type(customer or employee) is filling in the following detais? \n");
					userChoice = input.readLine();
					
					// User inputs customer details
					if (userChoice.equalsIgnoreCase("customer")) 
					{
						personType = userChoice;
						
						System.out.print("Enter your first name: ");
						firstName = input.readLine();
						
						System.out.print("Enter your second name: ");
						secondName = input.readLine();
						
						System.out.print("Enter your physical address: ");
						address = input.readLine();
						
						System.out.print("Enter your cell number: ");
						cellNumber = input.readLine();
						
						System.out.print("Enter your email address: \n");
						email = input.readLine();
						
						customer1 = new Person(personType, firstName, secondName, address, cellNumber, email);
						
						break;	
					}
					else
					{
						System.out.println("Only customers are allowed to enter their details!");
						continue;
					}	
				}
			}
			
			if(taskOption.equals("2"))
			{
				// User enters project details
				System.out.println("Enter the project details. \n");
				System.out.print("Enter the number of the project: ");
				projectNumber = Integer.parseInt(input.readLine());
				
				System.out.print("Enter the name of the project: ");
				projectName = input.readLine();
				
				System.out.print("Enter the which type of project it is(house, apartment block, etc): ");
				projectType = input.readLine();
				
				System.out.print("Enter the physical address of the " + projectType + ": ");
				address = input.readLine();
				
				System.out.print("Enter the ERF number: ");
				erfNumber = Integer.parseInt(input.readLine());
				
				System.out.print("Enter the total cost of the project: ");
				amountDue = input.readLine();
				
				System.out.print("Enter the due date of the project: ");
				dueDate = input.readLine();
			}
			
			if(taskOption.equals("3"))
			{
				System.out.print("Change the due date of the project: ");
				dueDate = input.readLine();
			}
			
			if(taskOption.equals("4"))
			{
				System.out.print("Change the total amount of the fee paid to date: ");
				amountPaid = input.readLine();
			}
			
			if(taskOption.equals("5"))
			{
				System.out.print("Enter contractor's new cell number: \n");
				contractorCell = input.readLine();
				employee1.setCellNumber(contractorCell);
				System.out.println(employee1.toString());
				
			}
			
			if(taskOption.equals("6"))
			{
				System.out.println("----INVOICE----\n");
				System.out.println("Customer: " + firstName + " " + secondName);
				System.out.println("------------------------------");
				
				if(projectName.equals(""))
				{
					System.out.println("Project name: " + secondName + "'s " + projectType + "\n");
					System.out.println("------------------------------");
					
				}
				else
				{
					System.out.println("Project name: " + projectName + "\n");
					System.out.println("------------------------------");
				}
				
				System.out.println("Due date: " + dueDate);
				System.out.println("------------------------------");
				System.out.println("Total cost: " + amountDue);
				System.out.println("------------------------------");
			}
			
			if(taskOption.equals("7"))
			{
				System.out.println("You've exited the program!");
				break;
			}
			
			input.close();
		}
		
	}
}
