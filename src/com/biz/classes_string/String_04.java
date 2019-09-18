package com.biz.classes_string;

public class String_04 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
		
		// 5번째 위치부터 무나뎔을 잘라서 보여달라
		strNation.substring(5);
		
		// 5번째 위치부터 
		// 8번째 앞까지 문자열을 자라서 보여달라
		strNation.substring(5, 8);
		
		String strAt = strNation.substring(0,1);
		if(strAt.equalsIgnoreCase(strSearch);
		     System.out.println("0번재 위치에서 찾음");
		     
		String strAt = strNation.substring(0,1);
		if(strAt.equalsIgnoreCase(strSearch);
			 System.out.println("1번재 위치에서 찾음");
				     
	    String strAt = strNation.substring(0,1);
		if(strAt.equalsIgnoreCase(strSearch);
		     System.out.println("2번재 위치에서 찾음");
		

	}

}
