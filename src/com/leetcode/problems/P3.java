package com.leetcode.problems;

import com.leetcode.model.Problem;

public class P3 extends Problem {

	public int lengthOfLongestSubstring(String s) {
		char[] letras = s.toCharArray();
		
		int maxLength = 0;
		for (int i = 0; i < letras.length; i++) {
			int maximoLongitudDesdeIndex = getMaxNoRepeatSubString(s, letras, i);
			
			if(maximoLongitudDesdeIndex >= maxLength) {
				maxLength = maximoLongitudDesdeIndex;
			}
		}
		
		return maxLength;
	}
	
	public int getMaxNoRepeatSubString(String s, char[] letras, int from) {		
		String tmpStr = "";
		for (int i = from; i < letras.length; i++) {
			if(!tmpStr.contains(s.charAt(i)+"")) {
				tmpStr += s.charAt(i);
			}
			else {
				break;
			}
		}
		
		return tmpStr.length();
	}

	@Override
	public void runTest() {
		String s = "abcabcbbabcd";
		
		int cant = lengthOfLongestSubstring(s);
		System.out.println(cant);
	}

}
