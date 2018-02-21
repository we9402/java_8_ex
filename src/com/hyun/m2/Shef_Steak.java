package com.hyun.m2;


public class Shef_Steak {
	
	public Food_Steak makeSteak(int select) {
		Shef_Source s = new Shef_Source();
		Food_Steak steak = null;
		//안심 스테이크 , 30000 , 1번소스
		
		//등심 스테이크 , 40000 , 2번소스
		
		//립 스테이크 , 50000 , 1번소스
		switch(select) {
		case 1:
			steak = new Food_Steak();
			steak.name = "안심 스테이크";
			steak.price = 30000;
			steak.source=s.makeSource(1);
			break;
		case 2:
			steak = new Food_Steak();
			steak.name = "등심 스테이크";
			steak.price = 40000;
			steak.source=s.makeSource(2);
			break;
		case 3:
			steak = new Food_Steak();
			steak.name = "립 스테이크";
			steak.price = 50000;
			steak.source=s.makeSource(1);
			break;
		}
		return steak;
	}

}
