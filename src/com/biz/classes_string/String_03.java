package com.biz.classes_string;

public class String_03 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		//문자열의 길이 (개수)를 확인해서
		// 변수 intLength 저장
		int intLength = strNation.length();
		char cSearch = 'r';
		int index = 0;
		index ++; // 1로 증가
		
		// i 값이 0 ~ intLength -1 이라는 것은
		// 0번재 부터 intLength -1번째 까지 라는 조건이
		// 만족하는 동안 반복 실행하겠다
		for(int i =0; i < intLength ; i++) {
			char cA = strNation.charAt(index);
			if(cA == cSearch)
				System.out.println(index + " 번 위치에 있음");

		}
		index ++; // 1로 증가
		char cA = strNation.charAt(index);
			if(cA == cSearch)
				System.out.println(index + " 번 위치에 있음");
						
		index ++; // 1로 증가
	    char cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");

	}

}
