package com.hyun.m1;

public class StudentView {
	//학생들의 정보 출력
	//메서드명 view
	
	//같은 이름의 매서드를 여러개 생성 하는 것
	//오버로딩
	//조건 : 메서드명이 같고, 매개변수의 타입이나, 갯수가 달라야한다.
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Student studentss) {
		System.out.println("이름 : "+studentss.name);
		System.out.println("번호 : "+studentss.num);
		System.out.println("국어 : "+studentss.kor);
		System.out.println("영어 : "+studentss.eng);
		System.out.println("수학 : "+studentss.math);
		System.out.println("총점 : "+studentss.total);
		System.out.println("평균 : "+studentss.avg);
	}

	public void view(Student [] students) {
		for(int i=0; i<students.length; i++) {
			this.view(students[i]);

			/*System.out.println("이름 : "+students[i].name);
			System.out.println("번호 : "+students[i].num);
			System.out.println("국어 : "+students[i].kor);
			System.out.println("영어 : "+students[i].eng);
			System.out.println("수학 : "+students[i].math);
			System.out.println("총점 : "+students[i].total);
			System.out.println("평균 : "+students[i].avg);*/
		}
	}
	

}