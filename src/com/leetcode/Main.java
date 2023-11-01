package com.leetcode;

import com.leetcode.problems.P657_RobotReturnToOrigin;
import com.leetcode.utils.ProblemRunnerManager;

public class Main {
	public static void main(String[] args) {
		
		// Iniciar el manejador de problemas
		ProblemRunnerManager problemRunnerManager = new ProblemRunnerManager();
		
		// Agregar problemas al manejador
		problemRunnerManager.addProblem(new P657_RobotReturnToOrigin().setInfo(657,"Prueba"));
		
		// Ejecutar problemas
		problemRunnerManager.run(-1);
	}
}
