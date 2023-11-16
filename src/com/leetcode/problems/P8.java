package com.leetcode.problems;

import java.math.BigInteger;
import java.util.Arrays;

import com.leetcode.model.Problema;

public class P8 extends Problema {

	public int myAtoi(String s) {
		if(s.contains("+-") || s.contains("-+")) return 0;
		char[] caracteres = s.trim().toCharArray();
		String acumuladorDigitos = "";
		char signo = '+';
		boolean existeSigno = false;
		for (char caracter : caracteres) {

			if (esSigno(caracter) && !existeSigno) {
				signo = caracter;
				if(existeSigno) return 0;
				existeSigno=true;
			} else if (Character.isDigit(caracter)) {
				acumuladorDigitos += caracter;
				existeSigno = true;
			} else if(acumuladorDigitos.length()==0 || existeSigno){
				break;
			}
		}
		String usoSigno = (acumuladorDigitos.trim().isEmpty() ? "": String.valueOf(signo) );
		String numeroCompleto = usoSigno + acumuladorDigitos.trim();
	
		return convertirNumero(numeroCompleto);
	}

	public int convertirNumero(String n) {
		if (n.equals(""))
			return 0;

		BigInteger bigNum = new BigInteger(n);

		if (bigNum.compareTo(new BigInteger("" + Integer.MAX_VALUE)) > 0) {
			return Integer.MAX_VALUE;
		} else if (bigNum.compareTo(new BigInteger("" + Integer.MIN_VALUE)) < 0) {
			return Integer.MIN_VALUE;
		} else {
			return n.equals("") ? 0 : new BigInteger(n).intValue();
		}
	}

	public boolean esSigno(char caracter) {
		String[] listaCaracteresValidos = new String[] { "+", "-" };
		return Arrays.stream(listaCaracteresValidos).anyMatch(x -> x.equals(String.valueOf(caracter)));
	}

	@Override
	public void runTest() {
		String s = "-+90words and 987";
		System.out.println("Respuesta: " + myAtoi(s));
	}

}
