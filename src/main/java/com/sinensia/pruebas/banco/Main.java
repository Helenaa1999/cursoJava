package com.sinensia.pruebas.banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banco banco1 = new Banco(1200);
		mostrarMenu();
		try(Scanner scanner = new Scanner(System.in)){
			int respuestaUsuario = scanner.nextInt();
		
			while (respuestaUsuario !=0) {
				switch(respuestaUsuario) {
					case 1:
						System.out.println("¿Cuánto dinero deseas sacar?");
						double cantidadSacar = scanner.nextDouble();
						banco1.sacarDinero(cantidadSacar);
						break;
					case 2:
						System.out.println("¿Cuánto dinero deseas ingresar?");
						double cantidadIngresar = scanner.nextDouble();
						banco1.ingresarDinero(cantidadIngresar);
						break;
					case 3: 
						banco1.mostrarInfo();
						break;
					default:
						System.out.println("Dato erróneo. Inténtelo de nuevo.");
				}
			mostrarMenu();	
			respuestaUsuario = scanner.nextInt();
			}
			
			if(respuestaUsuario == 0) {
				System.out.println("Has salido del programa");
			}
		}catch(Exception e) {
			System.out.println("Se ha producido un error");
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("¿Qué acción deseas realizar? \n"
				+ "1. Sacar dinero \n" 
				+ "2. Ingresar dinero \n"
				+ "3. Mostrar el saldo \n"
				+ "0. Salir");
	}

}
