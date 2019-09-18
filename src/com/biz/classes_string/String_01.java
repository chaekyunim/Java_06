package com.biz.classes_string;

public class String_01 {

	/*
	 * strNation 문자열 중에 u 라는 문자가
	 * 몇번째 위치에 있나?	
	 */
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
	   int intLength = strNation.length();
	   
	   // 'R' 이 cA 변수에 담길 것
	  char cA =  strNation.charcA(0);
	  if (cA == 'u')
		  System.out.println("0번 위치에 있음");
	  
	  if (cA == 'u')
		  System.out.println("1번 위치에 있음");
	  
	  if (cA == 'u')
		  System.out.println("2번 위치에 있음");

	  if (cA == 'u')
		  System.out.println("3번 위치에 있음");

	}

}
