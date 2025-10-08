package com.sinensia.games.guessgame;

import java.util.Scanner;

public class Consola implements GameIO {

	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void read(String mensaje){
		System.out.println(mensaje);
	}
}
