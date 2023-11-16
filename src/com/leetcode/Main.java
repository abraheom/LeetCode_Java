package com.leetcode;

import com.leetcode.problems.P1;
import com.leetcode.problems.P1759;
import com.leetcode.problems.P2;
import com.leetcode.problems.P214;
import com.leetcode.problems.P3;
import com.leetcode.problems.P4;
import com.leetcode.problems.P5;
import com.leetcode.problems.P6;
import com.leetcode.problems.P8;
import com.leetcode.utils.ProblemasManager;

public class Main {

	public static void main(String[] args) {
		// Iniciar el manejador de problemas
		ProblemasManager pm = new ProblemasManager();

		// Agregar problemas al manejador
		pm.agregarProblema(new P1().setInfo(1, "Two Sum"));
		pm.agregarProblema(new P2().setInfo(2, "Add Two Numbers"));
		pm.agregarProblema(new P3().setInfo(3, "Longest Substring Without Repeating Characters"));
		pm.agregarProblema(new P4().setInfo(4, "Median of Two Sorted Arrays"));
		pm.agregarProblema(new P5().setInfo(5, "Longest Palindromic Substring"));
		pm.agregarProblema(new P6().setInfo(6, "Zigzag Conversion")); //TODO Terminar
		pm.agregarProblema(new P8().setInfo(8, "String to Integer (atoi)"));
		pm.agregarProblema(new P6().setInfo(6, "Zigzag Conversion"));
		pm.agregarProblema(new P1759().setInfo(1759, "Count Number of Homogenous Substrings")); // TODO Optimizar
		pm.agregarProblema(new P214().setInfo(214, "Shortest Palindrome")); // TODO Optimizar

		// Ejecutar problemas
		pm.ejecutarUltimoProblema();
	}

}