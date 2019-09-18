package com.biz.classes;

public class Class_01 {
    
	/*
	 * 나는 Class_01 이름을 가진 클래스(class) 입니다.
	 * 클래스는 첫글자를 대문자로
	 * 
	 * 나는 Class_01 이름을 가진 클래스(Class) 입니다.
	 * 나는 3개의 method를 가지고 있습니다.
	 * 나는 더 많은 method를 가질수 있으며,
	 * 더욱 다양한 명령들을 한데 묶어 포함 할수 있습니다.
	 * 내가 포함 method는 static이 없으므로
	 * 내가 가지고 있는 method를 실행 하려면
	 * 반드시 객체로 먼저 선언, 생성해야 합니다.
	 * 
 	 */
	
	public String strmember = "나는 맴버변수";
	
	public void method_01() {
		System.out.println("나는 method 01 입니다");
		System.out.println("나는 method_01 입니다");
	}
	public void method_02() {
		System.out.println("나는 method 01 입니다");
	}
	public void method_04() {
		System.out.println("나는 method 02 입니다");	
	}
	public void method_05() {
		System.out.println("나는 method 03 입니다");	
	}
}
