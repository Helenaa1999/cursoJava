package com.sinensia.pruebas.banco;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*LinkedList <Cliente> listaClientes = new LinkedList<>();
		Cliente cliente1 = new Cliente("555555J", "Helena");
		Cliente cliente2 = new Cliente("555555J", "Helena");
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		for(Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
		
		HashSet <Cliente> listaClientesSinDuplicar = new HashSet<>(listaClientes);
		for(Cliente cliente : listaClientesSinDuplicar) {
			System.out.println(cliente);
		}
		*/
		
		String DNI;
		CuentaBanco banco1 = new CuentaBanco(1200);
		
		try(Scanner scanner = new Scanner(System.in)){
			
		System.out.println("Bienvenido a las operaciones del banco x. \n"
				+ "Introduce tu DNI para poder realizar gestiones.");
		
		
			DNI = scanner.next();
			if(DNI != null) {
				mostrarMenu();
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
					
					if(respuestaUsuario == 0) {
					System.out.println("Has salido del programa");
					}
				}
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
