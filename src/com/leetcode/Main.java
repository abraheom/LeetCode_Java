package com.leetcode;

import com.leetcode.problems.P1;
import com.leetcode.problems.P2;
import com.leetcode.problems.P3;
import com.leetcode.problems.P4;
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
		pm.agregarProblema(new P6().setInfo(6, "Zigzag Conversion")); //TODO Terminar
		pm.agregarProblema(new P8().setInfo(8, "String to Integer (atoi)"));

		// Ejecutar problemas
		pm.ejecutarUltimoProblema();
	}

}