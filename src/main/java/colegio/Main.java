package colegio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List <Alumno> listaAlumnado = new ArrayList<>();
		
		Alumno alumno1 = new Alumno("0123456J", "Helena");
		Alumno alumno2 = new Alumno("5555555L", "Pepe");
		Alumno alumno3 = new Alumno("5555555L", "Pepe");
		
		listaAlumnado.add(alumno1);
		listaAlumnado.add(alumno2);
		listaAlumnado.add(alumno3);
		
		Set <Alumno> listaAlumnos = new HashSet <>(listaAlumnado);
		
		System.out.println("Lista de alumnos sin duplicados:");
		for(Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}
	}
	
	

   

      

}
