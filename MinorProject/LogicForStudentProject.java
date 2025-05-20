package com.ely.internship.MinorProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LogicForStudentProject implements AverageMarks {
	
	static ArrayList<StudentInfo> studentList;
	
	public LogicForStudentProject(ArrayList<StudentInfo> studentList) {
		this.studentList = studentList;
	}
	
	public void compareMarks(Scanner scanner) {
		System.out.println("Enter the student 1 whose marks you want to compare: ");
		int student1 = scanner.nextInt()-1;
		System.out.println("Enter the student 2 whose marks you want to compare: ");
		int student2 = scanner.nextInt()-1;
		
		if((studentList.get(student1).getMajorSub()).equals((studentList.get(student2).getMajorSub()))) {
			String result = (studentList.get(student1).getCgpa() > studentList.get(student2).getCgpa()) ? (studentList.get(student1).getName()+ " has greater marks ✨") : (studentList.get(student2).getName()+ " has greater marks ✨");
			System.out.println(result);
		}
		else {
			if(studentList.get(student1).getCgpa() == studentList.get(student2).getCgpa()) {
				System.out.println("Both have equal marks 🎈");
			}
			else {
				System.out.println("Enter the students who have same major subject 👎");
			}
		}
	}
	
	public static void studentDetails() {
		Iterator iterator = studentList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	}
	
	public void averageMarks() {
		double total = 0.0;
		for(int i = 0; i < studentList.size(); i++) {
			total += studentList.get(i).getCgpa();
		}
		System.out.println("The average marks of " + studentList.size() + " students is : " + (total/studentList.size()));
	}
	
	public void isTwoStudentsEquals() {
		 boolean found = false;
		    for (int i = 0; i < studentList.size(); i++) {
		        for (int j = i + 1; j < studentList.size(); j++) {
		            if (studentList.get(i).equals(studentList.get(j))) {
		                System.out.println("Duplicate found:\n" + studentList.get(i));
		                found = true;
		            }
		        }
		    }
		    if (!found) {
		        System.out.println("No duplicate student records found.");
		    }
	}
}
