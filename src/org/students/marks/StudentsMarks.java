package org.students.marks;

import java.util.Scanner;

public class StudentsMarks {
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	   
	System.out.println("Students ID ");   
	Short id =sc.nextShort();
	System.out.println("Students ID :"+id);
	
	System.out.println("Students Name ");   
	String name =sc.next();
	System.out.println("Students Name :"+name);
	
	System.out.println("Mark 1: ");   
	Short mark1 = sc.nextShort();
	System.out.println("Students Mark1 :"+mark1);
		
	System.out.println("Mark 2: ");   
	Short mark2 =sc.nextShort();
	System.out.println("Students Mark2 : "+mark2);
	
	System.out.println("Mark 3: ");   
	Short mark3 = sc.nextShort();
	System.out.println("Students Mark3 : "+mark3);
	
	System.out.println("Students mark updated");
	}
}
