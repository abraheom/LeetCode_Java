package com.leetcode;

import com.leetcode.problems.P1;
import com.leetcode.problems.P2;
import com.leetcode.problems.P3;
import com.leetcode.problems.P4;
import com.leetcode.utils.ProblemRunnerManager;

public class Main {

	public static void main(String[] args) {
		// Iniciar el manejador de problemas
		ProblemRunnerManager pm = new ProblemRunnerManager();

		// Agregar problemas al manejador
		pm.addProblem(new P1().setInfo(1, "Two Sum"));
		pm.addProblem(new P2().setInfo(2, "Add Two Numbers"));
		pm.addProblem(new P3().setInfo(3, "Longest Substring Without Repeating Characters"));
		pm.addProblem(new P4().setInfo(4, "Median of Two Sorted Arrays"));

		// Ejecutar problemas
		pm.runLastProblem();
	}

}