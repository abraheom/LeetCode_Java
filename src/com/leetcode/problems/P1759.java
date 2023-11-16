package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.model.Problema;

public class P1759 extends Problema {
	public int countHomogenous(String s) {
		String letrasUnicas = "";
		int suma = 0;
		for (int i = 0; i < s.split("").length; i++) {

			char letra = s.charAt(i);
			int indiceLetraBuscada = letrasUnicas.indexOf(letra);
			if (indiceLetraBuscada == -1) {
				letrasUnicas += letra;
			}
		}
		String[] subCadenas = encontrarSubCadenas(s, letrasUnicas.split(""));
		for (String subCadena : subCadenas) {
			suma += getSumaSubCadenas(s, subCadena);
		}
		return suma;
	}

	public String[] encontrarSubCadenas(String texto, String[] letrasUnicas) {
		List<String> subCadenas = new ArrayList<>();
		for (String letra : letrasUnicas) {

			String acumuladorLetra = letra;
			for (int i = 0; i < texto.length(); i++) {
				if (texto.indexOf(acumuladorLetra) != -1) {
					subCadenas.add(acumuladorLetra);
					acumuladorLetra += letra;
				} else {
					break;
				}
			}
		}
		return subCadenas.toArray(new String[subCadenas.size()]);
	}

	public int getSumaSubCadenas(String text, String letra) {
		int lastIndex = 0;
		int suma = 0;
		while (lastIndex < text.length()) {
			int indiceEncontrado = text.indexOf(letra, lastIndex);
			if (indiceEncontrado != -1) {
				lastIndex = indiceEncontrado;
				suma++;
			}
			lastIndex++;
		}
		return suma;
	}

	@Override
	public void runTest() {
		String text = "abbcccaa";

		System.out.println("Suma: " + countHomogenous(text));
	}

}
