package com.hyun.m2;

import java.util.Scanner;

public class Food_Main {
	public static void main(String [] agrs) {
		Scanner sc = new Scanner(System.in);
		/*Shef_Source s = new Shef_Source();
		Food_Source source = s.makeSource(2);*/
		
		Menu menu = new Menu();
		menu.order();
		
		
		/*int i = menu.order();
		if(i<=3) {
			Shef_Steak ms = new Shef_Steak();	//제작
			Food_Steak steak = ms.makeSteak(i); //주문
			if(steak != null) { //null값이 아닐경우 출력
				System.out.println(steak.name);
				System.out.println(steak.price);
				System.out.println(steak.source.oilName);
				System.out.println(steak.source.spiceName);
			}
		}else if(i>3) {
			Shef_Pasta mp = new Shef_Pasta();  	//제작
			Food_Pasta pasta = mp.makePasta(i); //주문
			if(pasta != null) { //null값이 아닐경우 출력
				System.out.println(pasta.name);
				System.out.println(pasta.price);
				System.out.println(pasta.source.oilName);
				System.out.println(pasta.source.spiceName);
			}
		}*/



		/*pasta.name = steak.name;	//데이터 타입이 같음
		pasta.price = steak.price;	//데이터 타입이 같음

		pasta = steak;  //데이터 타입이 다르기에 안됨*/
	}

}
