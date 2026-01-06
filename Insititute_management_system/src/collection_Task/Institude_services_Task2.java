package collection_Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Institude_services_Task2 {
	
	Integer seat_avaliable_java = 2;
	Integer seat_avaliable_python = 2;
	Integer seat_avaliable_dotnet = 2;
	
	List<Userdetails_Task2> java_Course = new ArrayList<>();
	List<Userdetails_Task2> python_Course = new ArrayList<>();
	List<Userdetails_Task2> dotnet_Course = new ArrayList<>();
	
	Queue<Userdetails_Task2> waitinginjava = new LinkedList<>();
	Queue<Userdetails_Task2> waitinginpython = new LinkedList<>();
	Queue<Userdetails_Task2> waitingindotnet = new LinkedList<>();
	
public  void add(String name,String course) {
	
		String id = "Uniq@" + Math.round(Math.random()*8888);
		
		if(course.contains("java")) {
	       if(seat_avaliable_java>0) {
			java_Course.add(new Userdetails_Task2(id,name,course));
			System.out.println("student details added");
			seat_avaliable_java--;
		 }
	       else {
	    	   waitinginjava.add(new Userdetails_Task2(id,name,course));
				System.out.println("your in waitinglist.."); 
	       }
		}
		
		else if(course.contains("python")) {
			if(seat_avaliable_python>0) {
				python_Course.add(new Userdetails_Task2(id,name,course));
				System.out.println("student details added");
				seat_avaliable_python--;
			 }
		       else {
		    	   waitinginpython.add(new Userdetails_Task2(id,name,course));
					System.out.println("your in waitinglist.."); 
		       }
		}
		
		else if(course.contains("dotnet")) {
			if(seat_avaliable_dotnet>0) {
				dotnet_Course.add(new Userdetails_Task2(id,name,course));
				System.out.println("student details added");
				seat_avaliable_dotnet--;
			 }
		       else {
		    	   waitingindotnet.add(new Userdetails_Task2(id,name,course));
					System.out.println("your in waitinglist.."); 
		       }
		}	
	}

public void remove(String id,String name,String course) {
	
	if(course.contains("java")) {	
		for(int i = 0; i < java_Course.size(); i++) {
			if(java_Course.get(i).getId().equals(id) && java_Course.get(i).getName().equals(name)) {
				java_Course.remove(i);
				System.out.println("Student removed");
			}
		}
		seat_avaliable_java++;
		System.out.println("Seat avaliable = "+seat_avaliable_java);
		System.out.println(java_Course);
		 if(seat_avaliable_java > 0 && !waitinginjava.isEmpty() ){
			 Userdetails_Task2 user =	waitinginjava.poll();
			 java_Course.add(user);
			System.out.println("your added in course");
		}
		 System.out.println(java_Course);
	}
	
		else if(course.contains("python")) {
			for(int i = 0; i < python_Course.size(); i++) {
				if(python_Course.get(i).getId().equals(id) && python_Course.get(i).getName().equals(name)) {
					python_Course.remove(i);
					System.out.println("Student removed");
				}
			}
			seat_avaliable_python++;
			System.out.println(seat_avaliable_python);
			System.out.println(python_Course);
			 if(seat_avaliable_python > 0 && !waitinginpython.isEmpty() ){
				 Userdetails_Task2 user =	waitinginpython.poll();
				 python_Course.add(user);
				System.out.println("your added in course");
			}
			 System.out.println(python_Course);
		}
	
		else if(course.contains("dotnet")) {
			for(int i = 0; i < dotnet_Course.size(); i++) {
				if(dotnet_Course.get(i).getId().equals(id) && dotnet_Course.get(i).getName().equals(name)) {
					dotnet_Course.remove(i);
					System.out.println("Student removed");
				}
			}
			seat_avaliable_dotnet++;
			System.out.println(seat_avaliable_dotnet);
			System.out.println(dotnet_Course);
			 if(seat_avaliable_dotnet > 0 && !waitingindotnet.isEmpty() ){
				 Userdetails_Task2 user =	waitingindotnet.poll();
				 dotnet_Course.add(user);
				System.out.println("your added in course");
			}
			 System.out.println(dotnet_Course);
		}
	}
public static void main(String args[]) {
	
		Institute_Task2 institudeDetails= new Institute_Task2();
		Institude_services_Task2 services = new Institude_services_Task2();
		Scanner sc = new Scanner(System.in);
		boolean exit =false;
		
		while(!exit) {
			System.out.println(institudeDetails);
			System.out.println("Course available");
			System.out.println("1 . Java Programing ");
			System.out.println("2 . Python Programing ");
			System.out.println("3 . Dotent Programing ");
			System.out.println("4 . <--Exit--> ");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
switch(choice) {
	        case 1:
				System.out.println("you want to join press 1 or discontinue press 2");
				int choice1=sc.nextInt();
				switch(choice1) {
				case 1:
					//add student
					System.out.println("Welcome to Uniq Technology");
					System.out.println("Enter your name");
					String name = sc.nextLine();
					name=sc.nextLine();
					System.out.println("Enter your course choosen");
					String course = sc.nextLine();
					services.add(name, course);
					break;
					
				case 2:
					//remove student
					System.out.println(services.java_Course);
					System.out.println("Enter your id");
					String id = sc.nextLine();
					id=sc.nextLine();
					System.out.println("Enter your name");
					String name1 = sc.nextLine();
					System.out.println("Enter your course choosen");
					String course1 = sc.nextLine();
					services.remove(id, name1, course1);
					break;
				}
			break;	
	 case 2:
		  
		    System.out.println("you want to join press 1 or discontinue press 2");
			int choice2=sc.nextInt();
			switch(choice2) {
			case 1:
				//add student
				System.out.println("Welcome to Uniq Technology");
				System.out.println("Enter your name");
				String name = sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enter your course choosen");
				String course = sc.nextLine();
				services.add(name, course);
				break;
				
			case 2:
				//remove student
				System.out.println(services.python_Course);
				System.out.println("Enter your id");
				String id = sc.nextLine();
				id=sc.nextLine();
				System.out.println("Enter your name");
				String name1 = sc.nextLine();
				System.out.println("Enter your course choosen");
				String course1 = sc.nextLine();
				services.remove(id, name1, course1);
				break;
			}
			
	break;
			
	case 3:
		    System.out.println("you want to join press 1 or discontinue press 2");
			int choice3=sc.nextInt();
			switch(choice3) {
			case 1:
				//add student
				System.out.println("Welcome to Uniq Technology");
				System.out.println("Enter your name");
				String name = sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enter your course choosen");
				String course = sc.nextLine();
				services.add(name, course);
				break;
				
			case 2:
				//remove student
				System.out.println(services.dotnet_Course);
				System.out.println("Enter your id");
				String id = sc.nextLine();
				id=sc.nextLine();
				System.out.println("Enter your name");
				String name1 = sc.nextLine();
				System.out.println("Enter your course choosen");
				String course1 = sc.nextLine();
				services.remove(id, name1, course1);
				break;
			}
	break;
			
	 case 4:
		 exit = true;
		 System.out.println("Thank you for visiting us..*");
	 break;
		  }
		}
		
		
	}

}
