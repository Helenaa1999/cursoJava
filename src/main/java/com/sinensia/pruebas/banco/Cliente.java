package com.sinensia.pruebas.banco;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Random;

import colegio.Alumno;

public class Cliente {
	private final String dni;
	private String nombre;
	private LinkedList <CuentaBanco> cuentaBanco;
	
	private int numClientes;
	
	public Cliente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.cuentaBanco = new LinkedList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LinkedList<CuentaBanco> getCuentaBanco() {
		return cuentaBanco;
	}

	public void setCuentaBanco(LinkedList<CuentaBanco> cuentaBanco) {
		this.cuentaBanco = cuentaBanco;
	}
	
	public boolean comprobarDniExistente(String dni) {
		return dni.equals(this.dni);
		
	}
	
	//Convertir en MAIN la lista a HASHCHECK para que no se guarden usuarios repetidos.
	@Override
	public String toString() {
        return nombre + " (" + dni + ")";
    }
   


	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) obj;
        return Objects.equals(dni, cliente.dni);
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
}
