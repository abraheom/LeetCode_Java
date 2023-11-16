package com.leetcode.problems;

import java.util.Arrays;

import com.leetcode.model.Problema;

public class P6 extends Problema {

	public String convert(String s, int numRows) {
		char[] letras = s.toCharArray();
		String[][] arregloZigZag = new String[numRows][200];
		for (int i = 0; i < numRows; i++) {
			int indexValido = 0;
			for (int j = 0; j < arregloZigZag[i].length; j++) {
				if (j == 0) {
					arregloZigZag[i][j] = String.valueOf(letras[i]);
				} 
				else if (indexValido++ >= numRows - 2) {
					indexValido = 0;
					arregloZigZag[i][j] = String.valueOf(letras[j+i]);
				}
			}
		}

		for (String[] linea : arregloZigZag) {
			System.out.println(Arrays.toString(linea));
		}
		return "";
	}

	@Override
	public void runTest() {
//		String s = "PAYPALISHIRING";
		String s = "123456789abcdefgh                    ";

		System.out.println(convert(s, 3));
	}

}
