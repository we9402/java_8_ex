package com.hyun.m1;

import java.util.Scanner;

public class SchoolController {

	//메서드명 start
	//리턴 X
	//내용은
	//1.학생추가
	//2.성적입력
	//3.성적조회
	//4.전체조회
	//5.프로그램종료

	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean c = true; 

		while(c)
		{
			System.out.println("번호입력");
			System.out.println("1.학생추가");
			System.out.println("2.성적입력");
			System.out.println("3.성적조회");
			System.out.println("4.전체조회");
			System.out.println("5.프로그램종료");
			int i = sc.nextInt();
			switch(i) {
			
			case 1 :
				System.out.println("학생추가");
				break;
			case 2 :
				System.out.println("성적입력");
				break;
			case 3 :
				System.out.println("성적조회");
				break;
			case 4 :
				System.out.println("전체조회");
				break;
			case 5 :
				System.out.println("프로그램 종료");
				c=!c;
				break;
			}
		}
	}
}
