package ejercicios;
import java.util.ArrayList;
import java.util.Collections;
public class Tareas {
	/*Gestiona una lista de tareas con un ArrayList. 
		Empieza con: ["pagar facturas", "estudiar", "comprar pan", "estudiar"].

		Acciones: añade "hacer ejercicio" al final, 
		Inserta "revisar correo" en la posición 1, 
		Elimina duplicados preservando el orden, 
		Comprueba si contiene "estudiar", 
		Reemplaza el elemento en índice 0 por "pagar impuestos", Ordena alfabéticamente y muestra la lista final.*/
	public static void main(String[] args) {
		ArrayList <String> listaTareas = new ArrayList<>();
		listaTareas.add("pagar facturas");
		listaTareas.add("estudiar");
		listaTareas.add("comprar pan");
		listaTareas.add("estudiar");
		listaTareas.add("hacer ejercicio");
		listaTareas.add(1, "revisar correo");
		
		boolean existe = listaTareas.contains("estudiar");
		System.out.println(existe);
		
		for(String tarea : listaTareas) {
			System.out.println(tarea);
		}
		
		listaTareas.set(0, "pagar impuestos");
		for(String tarea : listaTareas) {
			System.out.println(tarea);
		}
		

		Collections.sort(listaTareas);
		for(String tarea : listaTareas) {
			System.out.println(tarea);
		}
		
		
	}
	

}
