package ejercicios;

import java.util.List;
import java.util.ArrayList;

public class ArrayList {

	public static void main(String[] args) {
		double media;
		double suma;
		
		ArrayList <Double> notas = new ArrayList<>();
        notas.add(5.0);
        notas.add(7.0);
        notas.add(9.0);
        notas.add(6.0);

		for (double nota : notas) {
			suma += nota;
		}
		media = suma/ notas.size();
		
		System.out.println("La nota media es: " + media);
		
		double notaMasAlta =0;
		for (double nota: notas) {
			if(nota > notaMasAlta) {
				notaMasAlta = nota;
			}
		}
		
		System.out.println("La nota más alta es: " + notaMasAlta);
		
		

	}
}
