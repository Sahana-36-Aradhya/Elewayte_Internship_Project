package com.ely.internship.MinorProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MarksCanNotBeNegativeException {
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		ArrayList<StudentInfo> studentList = new ArrayList<>();
		LogicForStudentProject logic = new LogicForStudentProject(studentList);
		
		System.out.print("Enter the number of student records you want to input: ");
		int noOfStudent = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=1; i<=noOfStudent; i++) {
			System.out.println();
			System.out.print("Enter the NAME of student " +i+" : ");
			String name = scanner.nextLine();
			
			System.out.print("Enter the ID of student " +i+" : ");
			int stdId = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter the CGPA of student " +i+" : ");
			double cgpa = scanner.nextDouble();
			scanner.nextLine();
			try {
			    if (cgpa < 0) {
			        throw new MarksCanNotBeNegativeException("Marks cannot be negative!");
			    }
			} catch (MarksCanNotBeNegativeException e) {
			    System.out.println(e.getMessage()); 
			}
			
			System.out.print("Enter the MAJOR PROJECT of student [PHYSICS, CHEMISTORY, MATHEMATICS] " +i+" : ");
			String majorSub = scanner.nextLine();
			
			if ( stdId >= 0 && 
			  (majorSub.equalsIgnoreCase("physics") || 
			   majorSub.equalsIgnoreCase("chemistory") || 
			   majorSub.equalsIgnoreCase("mathematics"))){
				StudentInfo std = new StudentInfo(name,stdId,cgpa,majorSub);
				studentList.add(std);
			}
			else {
				System.out.println("iNVALID INPUT RE-TRY AGAIN");
				i--;
				continue;
			}
			
		}
		
		while(repeat) {
			System.out.println();
			System.out.println("________________________________________________");
			System.out.println("1. Compare marks between two students 🤝");
			System.out.println("2. View a student's profile 👀");
			System.out.println("3. Calculate average marks of all students 🧮");
			System.out.println("4. Compare profiles of two students 🧾");
			System.out.println("5. Exit the program ✖");
			System.out.println("________________________________________________");
			System.out.println();
			System.out.print("Enter your choice : ");
			int choice = scanner.nextInt();
		
		switch(choice) {
			case 1 : logic.compareMarks(scanner);
						break;
			case 2: LogicForStudentProject.studentDetails();
						break;
			case 3: logic.averageMarks();
						break;
			case 4: logic.isTwoStudentsEquals();
						break;
			case 5: repeat = false;
						break;
			default : System.out.println("Enter the valid choice");
			
			}
		}
		scanner.close();
	}

}
