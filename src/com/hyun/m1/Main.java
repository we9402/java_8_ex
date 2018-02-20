package com.hyun.m1;

public class Main {
	public static void main(String[] args) {
		
		SchoolController school = new SchoolController();
		school.start();
		//new SchoolController().start(); -한번만 쓸경우
		System.out.println("Program Stop");
		
		/*Student [] ar  = new Student[2];
		Student student = new Student();
		
		for(int i=0; i<ar.length; i++) {
			student.name=sc.next();
			ar[i]=student;
			System.out.println(ar[i].name);
		}*/
		
	}
}