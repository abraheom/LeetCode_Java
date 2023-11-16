package com.leetcode.problems;

import com.leetcode.model.Problema;

public class P214 extends Problema {

	public String shortestPalindrome(String s) {
		if (esPalindromo(s))
			return s;

		String[] arregloTexto = s.split("");
		String sInvertido = getReversedString(s);
		String estracto1 = "";
		String estracto2 = "";

		for (int i = 0; i < arregloTexto.length; i++) {
			estracto1 = s.substring(i);
			if (esPalindromo(estracto1))
				break;
		}

		for (int i = arregloTexto.length - 1; i >= 0; i--) {
			estracto2 = s.substring(0, i);
			if (esPalindromo(estracto2))
				break;
		}

		String texttoRestante = (s.substring(estracto2.length()));
		sInvertido = sInvertido + texttoRestante;

		return sInvertido;
	}

	public boolean esPalindromo(String text) {
		StringBuilder t1 = new StringBuilder(text);

		return t1.toString().equals(t1.reverse().toString());
	}

	public String getReversedString(String text) {
		StringBuilder str = new StringBuilder(text);

		return str.reverse().toString();
	}

	@Override
	public void runTest() {
		t("abbacd");
		t("aacecaaa");
	}

	public void t(String text) {
		String resp = shortestPalindrome(text);
		System.out.println("P:" + esPalindromo(resp) + " Text:" + text + " Resp:" + resp);
	}

}
