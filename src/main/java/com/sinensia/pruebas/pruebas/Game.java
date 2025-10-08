package com.sinensia.pruebas.pruebas;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private int numeroSecreto;
	
	public Game() {
		/**
		 * Genera aleatoriamente un número random entre 1 y 10
		 */
		numeroSecreto = new Random().nextInt(1,11);
	}
		
	public int getNumeroSecreto() {
			return numeroSecreto;
		}


	public static void main (String[]args) {
		Game game = new Game();
		System.out.println("Bienvenido al juego de adivinar el número.");
		System.out.println("Introduce un número y te diré si es correcto");
		Scanner scanner = new Scanner(System.in);
		try {
			int numUsuario = scanner.nextInt();
			if(game.getNumeroSecreto() == numUsuario) {
				System.out.println("¡Has acertado!");
			}else {
				System.out.println("Ese no es");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		
		
	}
}
