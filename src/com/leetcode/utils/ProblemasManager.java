package com.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.model.Problema;

public class ProblemasManager {
	// Lista de problemas
	private List<Problema> problemas = new ArrayList<>();

	/**
	 * Agrega un problema a la lista
	 * 
	 * @param problem
	 */
	public void agregarProblema(Problema problem) {
		this.problemas.add(problem);
	}

	/**
	 * Ejecuta el ultimo problema agregado a la lista
	 */
	public void ejecutarUltimoProblema() {
		this.ejecutarProblema(this.problemas.size());
	}

	/**
	 * Ejecutar un problema de la lista segun su ID
	 * 
	 * @param idProblem
	 */
	private void ejecutarProblema(int idProblem) {
		Problema problemToRun = this.problemas.get(idProblem - 1);
		problemToRun.mostrarInformacionProblema();
		problemToRun.runTest();
	}
}
