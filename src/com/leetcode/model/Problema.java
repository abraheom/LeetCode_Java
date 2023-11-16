package com.leetcode.model;

public abstract class Problema {
	int id;
	String nombre;

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public Problema setInfo(int id, String name) {
		this.id = id;
		this.nombre = name;
		return this;
	}

	public void mostrarInformacionProblema() {
		System.out.println("Ejecutando problema: " + this.id + " -> " + this.nombre);
	}

	// Metodos abstractos
	public abstract void runTest();

	@Override
	public String toString() {
		return "Problem [id=" + id + ", name=" + nombre + "]";
	}

}
