package com.leetcode.model;

public abstract class Problem {
	int id;
	String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Problem setInfo(int id, String name) {
		this.id = id;
		this.name = name;
		return this;
	}

	public void showProblemInfo() {
		System.out.println("Ejecutando problema: " + this.id + "->" + this.name);
	}

	// Metodos abstractos
	public abstract void runTest();

	@Override
	public String toString() {
		return "Problem [id=" + id + ", name=" + name + "]";
	}

}
