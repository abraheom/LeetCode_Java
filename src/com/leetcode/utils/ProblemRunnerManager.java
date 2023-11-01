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

	public void run(int idProblem) {
		if (idProblem == -1) {
			//problems.runTest();
		}
		Problem problemToRun = this.problems.get(this.problems.size()-1);
		problemToRun.showProblemInfo();
		problemToRun.runTest();
	}
}
