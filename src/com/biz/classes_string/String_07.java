package com.biz.classes_string;

public class String_07 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
        int index = 0;
        
        for(int i = 0 ; 1 < intLength ; i++) {
        	String strAt = srtNation.substring(i, i+1);
        	if(strAt.equalsIgnoreCase(strSearch))
        		  System.out.println(i + " 번"쨰 위치에 찾음");"
        		  		
        }

	}

}
