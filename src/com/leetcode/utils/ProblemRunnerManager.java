package com.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.model.Problem;

public class ProblemRunnerManager {
	private List<Problem> problems;

	public ProblemRunnerManager() {
		this.problems = new ArrayList<>();
	}
	
	public void addProblem(Problem problem) {
		this.problems.add(problem);
	}

	public void runLastProblem() {
		this.ejecutarProblema(this.problems.size()-1);
	}
	
	private void ejecutarProblema(int idProblem) {
		Problem problemToRun = this.problems.get(idProblem);
		problemToRun.showProblemInfo();
		problemToRun.runTest();
	}
}
