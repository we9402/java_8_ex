package com.hyun.m1;

import java.util.Scanner;

public class StudentService {
	//학생 추가 메서드
	//메서드명 addStudent
	//학생의 인원수 입력
	//학생수만큼나오기
	//이름입력
	//번호입력
	
	//생성자 공식
	//접근지정자 클래스명(){}
	Scanner sc;
	public StudentService() {
		sc = new Scanner(System.in);
	}
	
	public Student [] addStudent() {
		System.out.println("학생의 인원수 입력");
		int j = sc.nextInt();
		Student [] students = new Student[j];
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			System.out.println("학생의 이름 입력");
			student.name = sc.next();
			System.out.println("학생의 번호 입력");
			student.num = sc.nextInt();
			students[i]=student;
		}
		return students;
	}
	
	//메서드 명 addPoint
	//내용 : 각 학생의 점수 입력 국영수총평
	
	public Student [] addPoint(Student [] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println(i+1+"번째 학생의 국어 점수 입력");
			students[i].kor = sc.nextInt();
			System.out.println(i+1+"번째 학생의 영어 점수 입력");
			students[i].eng = sc.nextInt();
			System.out.println(i+1+"번째 학생의 수학 점수 입력");
			students[i].math = sc.nextInt();
			students[i].total = students[i].kor+students[i].eng+students[i].math;
			students[i].avg = students[i].total/3.0;
			
		}
		return students;	
	}
	 
	public Student sera(Student [] students) {
		System.out.println("번호입력");
		/*int i;
		int j = sc.nextInt();
		
		for(i=0; i<students.length; i++) {
			if(students[i].num==j) {
				break;
			}
		}
		return students[i];*/
		Student student =null;
		int j = sc.nextInt();
		for(int i=0; i<students.length; i++) {
			if(students[i].num==j) {
				student = students[i];
			}
		}
		return student;
	}
	
	
	
}