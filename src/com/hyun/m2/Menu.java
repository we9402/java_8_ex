package com.hyun.m2;

import java.util.Scanner;

public class Menu {
	/*public int order() {
		Scanner sc = new Scanner(System.in);
		Food_Main main = new Food_Main();
		System.out.println("음식을 선택해 주세요.");
		System.out.println("☆★☆★☆★☆★☆");
		System.out.println("1.	안심 스테이크");
		System.out.println("2.	등심 스테이크");
		System.out.println("3.	립스 테이크");
		System.out.println("4.	크림 파스타");
		System.out.println("5.	로제 파스타");
		System.out.println("6.	알리오올리오");
		System.out.println("★☆★☆★☆★☆★");
		int select = sc.nextInt();
		
		return select;
	}*/
	
	public void order() {
		Scanner sc = new Scanner(System.in);
		Shef_Steak ss = new Shef_Steak();
		Shef_Pasta sp = new Shef_Pasta();
		Bill bill = new Bill();  //Bill(); =메서드 
		System.out.println("1.	안심 스테이크");
		System.out.println("2.	등심 스테이크");
		System.out.println("3.	립스 테이크");
		System.out.println("4.	크림 파스타");
		System.out.println("5.	로제 파스타");
		System.out.println("6.	알리오올리오");
		int select = sc.nextInt();
		Food_Pasta pasta= null;
		Food_Steak steak= null;
		
		if(select<4) {
			steak = ss.makeSteak(select);
			bill.billSteak(steak);
			
		}else {
			pasta = sp.makePasta(select-3);
			bill.billPasta(pasta);
		}
		
	}

}
