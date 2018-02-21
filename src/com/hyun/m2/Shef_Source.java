package com.hyun.m2;

public class Shef_Source {
	public Food_Source makeSource(int select) { //메서드 선언 헤더
		/*Food_Source source = new Food_Source();
		source.oilName ="Olive";
		source.spiceName="Hub";*/
		//oilName = " Milk";
		//spiceName = "Cheese";
		Food_Source source = null;
		
		switch (select) {
		case 1:
			source = new Food_Source();
			source.oilName = "Olive";
			source.spiceName = "Hub";
			break;
		case 2:
			source = new Food_Source();
			source.oilName = "Milk";
			source.spiceName = "Cheese";
			break;
		}
		return source;
		
		
	}

}
