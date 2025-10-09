package com.sinensia.pruebas.banco;

import java.util.Random;

public class Cliente {
	private final String DNI;
	private String nombre;
	//Hacer un ArrayList para que los clientes puedan tener varias cuentas
	private CuentaBanco cuentaBanco;
	
	private int numClientes;
	
	public Cliente(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
