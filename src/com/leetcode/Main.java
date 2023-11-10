package com.leetcode;

import com.leetcode.problems.P1759;
import com.leetcode.problems.P214;
import com.leetcode.utils.ProblemRunnerManager;

public class Main {

	public static void main(String[] args) {
		// Iniciar el manejador de problemas
		ProblemRunnerManager pm = new ProblemRunnerManager();

		// Agregar problemas al manejador
		pm.addProblem(new P214().setInfo(214, "Shortest Palindrome")); // TODO Optimizar
		pm.addProblem(new P1759().setInfo(1759, "Count Number of Homogenous Substrings")); // TODO Optimizar
		
		// Ejecutar problemas
		pm.runLastProblem();
	}
}