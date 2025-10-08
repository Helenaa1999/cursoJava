package com.sinensia.games.guessgame;

import java.util.Scanner;

public class Consola implements GameIO {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void print(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String read() {
        return scanner.next();
    }
}