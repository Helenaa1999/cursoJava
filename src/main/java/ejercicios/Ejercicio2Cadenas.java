package ejercicios;

import java.util.Scanner;

public class Ejercicio2Cadenas {

	public static void main(String[] args) {
		/*
		 * Enunciado
			Desarrolla un programa que demuestre el uso práctico de StringBuilder. 
			El objetivo es construir, modificar y analizar un texto dinámico de manera eficiente. El programa debe:
				Permitir introducir varias frases hasta escribir FIN.
				Unirlas en una sola cadena usando StringBuilder.
				Insertar, eliminar y reemplazar fragmentos de texto de forma controlada.
				Invertir el texto final.
				=========
				
				Introduce líneas de texto (escribe FIN para terminar):				
				Programar es pensar				
				Antes de escribir
				FIN

				Texto acumulado con StringBuilder:				
				Programar es pensar Antes de escribir				
								
				Texto tras inserción en posición 10:				
				Programar (INSERTADO) es pensar Antes de escribir

				Texto tras eliminación (caracteres 10 a 22):				
				Programar es pensar Antes de escribir

				Texto tras reemplazo de 'escribir' por 'crear':				
				Programar es pensar Antes de crear

				Texto invertido:
				raerc ed serdnA rasknep se rargramorP
		 	*/
		
		String terminar = "FIN"; 
		String respuestaUsuario;
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Introduce una frase. Cuando escribas fin se terminará el programa.");
			respuestaUsuario = scanner.next();
			StringBuilder stringbuilder = new StringBuilder(respuestaUsuario);
			while (respuestaUsuario != terminar) {
				
				
			}
		}
		
		//

	}

}
