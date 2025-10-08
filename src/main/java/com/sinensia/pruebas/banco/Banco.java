package com.sinensia.pruebas.banco;

public class Banco {
	private double saldo;
	
	public Banco (double saldoInicial) {
		this.saldo = saldoInicial;
		if(saldoInicial < 0) {
			throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
		}
	}

	public double getCantidadDinero() {
		return saldo;
	}

	public void setCantidadDinero(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacarDinero (double dineroSacar) {
		if(saldo >= dineroSacar) {
			saldo -=   dineroSacar;
		} else {
			System.out.println("No hay suficiente dinero en la cuenta.");
		}
	}
	
	public void ingresarDinero (double dineroIngresar) {
		saldo += dineroIngresar;
		System.out.println("Has ingresado " + dineroIngresar + " euros.");
	}
	
	public void mostrarInfo() {
		String mensaje = "Tienes " + saldo + " euros en tu cuenta.";
		System.out.println(mensaje);
	}	
}
