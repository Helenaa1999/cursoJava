package guessgame;

public class appGame {

	package com.sinensia.games.guessgame;

	import com.sinensia.games.GuessGame.Estado;

	public class AppGame {

	    private final GuessGame game;
	    private final GameIO io;

	    public AppGame(GuessGame game, GameIO io) {
	        this.game = game;
	        this.io = io;
	    }

	    public void start() {
	        int vidas = game.getMaxVidas();
	        io.print("Bienvenido al juego de adivinar (1-10)");
	        io.print("Tienes " + vidas + " vidas.");

	        while (vidas > 0) {
	            io.print("Introduce un número:");
	            String input = io.read();
	            Estado resultado = game.verificarInput(input);

	            switch (resultado) {
	                case SUCCESS -> {
	                    io.print("¡Correcto! El número era " + game.getNumeroSecreto());
	                    return;
	                }
	                case FAILED -> io.print("No es ese... Te quedan " + (--vidas) + " vidas.");
	                case INVALID -> io.print("Entrada inválida. Usa números del 1 al 10.");
	                case OUTOFRANGE -> io.print("Número fuera de rango");
	            }
	        }
	        io.print("Game Over. El número era " + game.getNumeroSecreto());
	    }

	    public static void main(String[] args) {
	        GuessGame juego = new GuessGame(3);
	        GameIO consola = new Consola();
	        new AppGame(juego, consola).start();
	    }
	}

}
