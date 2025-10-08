package com.sinensia.pruebas.banco;

import java.util.Random;

public class Cliente {
	private static Random rand = new Random();
	private int ID;
	private String nombre;
	private Banco banco;
	
	private int numClientes;
	
	public Cliente(String nombre) {
		ID = rand.nextInt(1, 1999);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
