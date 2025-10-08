package com.sinensia.games.guessgame;

import java.util.Random;

public class GuessGame {
	private static final Random RAM = new Random();
	
	private final int maxVidas = 5;
	private int numSecreto = RAM.nextInt(1,11);
	public int getMaxVidas() {
		return maxVidas;
	}
	
	public int getNumeroSecreto() {
		return numSecreto;
	}
	
	public Estado verificarInput(String numero) {
		try {
			int numInt = Integer.parseInt(numero);
			if(numInt <1 || numInt>10) {
				return Estado.OUTOFRANGE;
			}
			if(numInt == numSecreto) {
				return Estado.SUCCESS;
			}else {
				return Estado.FAILED;
			}
			
		}catch(NumberFormatException e){
			return Estado.INVALID;
		}
	}
	
	
	public enum Estado {
		SUCCESS, FAILED, INVALID, OUTOFRANGE
	}
}
