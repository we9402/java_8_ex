package com.hyun.m3;

public class Car {
	String color;
	String brand;
	int cc;
	
	public Car() {
		this("Red"); //자신의 또 다른 생성자를 호출 //데이터 타입과 수를 맟추면 호출
		//생성자 라인의 첫줄에 항상 기술행야함 첫줄이 아니면 오류!
	}
	public Car(String color) {
		this(color,"KIA");
		/*this.color =color;  //this.변수 = 이멤버함수의 color (객체안에서만 사용가능)
		brand = "Audi";
		cc = 3000;*/
	}
	
	public Car(String color, String brand) {
		this(color,brand,3300);
		/*this.color =color;  //this 같은 이름을 구분하기 위해 사용
		this.brand = brand;
		cc = 3000;*/
	}
	
	public Car(String color, String brand, int cc) {
		this.color =color;
		this.brand = brand;
		this.cc = cc;
	}
	
	public void info() {
		System.out.println("Color : "+this.color);
		System.out.println("brand : "+this.brand);
		System.out.println("cc : "+this.cc);
		this.make();
	}
	
	public void make() {
		System.out.println("자동차 제작 완료");
	}

}
