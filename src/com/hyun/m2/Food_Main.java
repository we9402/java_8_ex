package com.hyun.m2;

public class Food_Main {
	public static void main(String[] args) {
		Food_Pasta pasta = new Food_Pasta();
		pasta.name = "크림파스타";
		pasta.price = 15000;
		
		System.out.println(pasta.source);
		pasta.source = new Food_Source();
		
		System.out.println(pasta.source.oilName);
		pasta.source.oilName = "올리브";
		pasta.source.spiceName = "허브";
		
		Food_Pasta pasta2 = new Food_Pasta();
		
		System.out.println(pasta2.source.oilName);
		
		
		//소스 : 오일, 향식료
		
		for(int i=0; i<2; i++) {
			Food_Steak steak = new Food_Steak();
			steak.name = "티본스테이크";
			steak.price = 40000;
		}
		
		
		
		
		

		/*pasta.name = steak.name;	//데이터 타입이 같음
		pasta.price = steak.price;	//데이터 타입이 같음

		pasta = steak;  //데이터 타입이 다르기에 안됨*/
	}

}
