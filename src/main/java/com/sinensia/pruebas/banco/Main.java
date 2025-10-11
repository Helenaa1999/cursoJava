package com.sinensia.pruebas.banco;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList <Cliente> listaClientes = new LinkedList<>();
		Cliente cliente1 = new Cliente("Helena", "555555J");
		Cliente cliente2 = new Cliente("Helena", "555555J");
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		
		
		HashSet <Cliente> listaClientesSinDuplicar = new HashSet<>(listaClientes);
		for(Cliente cliente : listaClientesSinDuplicar) {
			System.out.println(cliente);
		}
		
		
		String DNI;
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Bienvenido a las operaciones del banco x. \n"
				+ "Introduce tu DNI para poder realizar gestiones.");
			DNI = scanner.next();
			boolean encontrado= false;
			Cliente clienteEncontrado = new Cliente("","");
			for(Cliente cliente : listaClientesSinDuplicar) {
				if(cliente.comprobarDniExistente(DNI)) {
					clienteEncontrado = cliente;
					encontrado=true;
				}
			}
			if(encontrado) {
				mostrarMenuInicial();
				int respuestaUsuario = scanner.nextInt();
				while (respuestaUsuario !=0) {
					switch(respuestaUsuario) {
						case 1:
							//AÑADIR GESTIONES BANCO
							break;
						case 2: 
							mostrarMenuBanco();
							respuestaUsuario = scanner.nextInt();
							while (respuestaUsuario !=0) {
								switch(respuestaUsuario) {
									case 1:
										System.out.println("¿Cuánto dinero deseas sacar?");
										double cantidadSacar = scanner.nextDouble();
										clienteEncontrado.getCuentaBanco().sacarDinero(cantidadSacar);
										break;
									case 2:
										System.out.println("¿Cuánto dinero deseas ingresar?");
										double cantidadIngresar = scanner.nextDouble();
										clienteEncontrado.getCuentaBanco().ingresarDinero(cantidadIngresar);
										break;
									case 3: 
										clienteEncontrado.getCuentaBanco().mostrarInfo();
									break;
								default:
									System.out.println("Dato erróneo. Inténtelo de nuevo.");
							}
							mostrarMenuBanco();	
							respuestaUsuario = scanner.nextInt();
							break;
							}
					}
				
					if(respuestaUsuario == 0) {
					System.out.println("Has salido del programa");
					}
				}	
			}else {
				System.out.println("Cliente no encontrado");
			}
		}catch(Exception e) {
			System.out.println("Se ha producido un error");
		}
	
	}
	public static void mostrarMenuInicial() {
		System.out.println("DNI correcto. ¿Qué acción desea realizar? \n"
				+ "1. Modificar datos personales \n"
				+ "2. Acciones con mi banco (Extraer dinero, ingresar, mostrar el saldo) \n"
				+ "0. Salir");
	}
	public static void mostrarMenuBanco() {
		System.out.println("¿Qué acción deseas realizar? \n"
				+ "1. Sacar dinero \n" 
				+ "2. Ingresar dinero \n"
				+ "3. Mostrar el saldo \n"
				+ "0. Salir");
	}

}
