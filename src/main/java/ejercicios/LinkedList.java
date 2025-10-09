package ejercicios;

import java.util.LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		/*Simula una cola de impresión con LinkedList. Añade trabajos "DocA", "DocB", "DocC" al final.
		Atiende al primero en entrar y retíralo hasta vaciar la cola. Inserta un trabajo urgente "UrgenteX" al principio y procésalo antes que los demás.
		Muestra en cada paso el estado de la cola.
		LinkedList<String> colaImpresion = new LinkedList<>();
		colaImpresion.addLast("DocA");

		// método para atender un trabajo
		private static void atenderSiguiente(LinkedList<String> cola) {
		        String siguiente = cola.peekFirst();
		        if (siguiente == null) {
		            System.out.println("No hay trabajos en la cola.");
		            return;
		        }
		        System.out.println("Atendiendo: " + siguiente);
		        cola.pollFirst(); // Retira el primero
		        System.out.println("Estado tras atender: " + cola);
		    }
		    
		    // Atender un trabajo urgente
		    colaImpresion.addFirst("UrgenteX");Simula una cola de impresión con LinkedList. Añade trabajos "DocA", "DocB", "DocC" al final.
		    Atiende al primero en entrar y retíralo hasta vaciar la cola. Inserta un trabajo urgente "UrgenteX" al principio y procésalo antes que los demás.
		    Muestra en cada paso el estado de la cola.
		    LinkedList<String> colaImpresion = new LinkedList<>();
		    colaImpresion.addLast("DocA");

		    // método para atender un trabajo
		    private static void atenderSiguiente(LinkedList<String> cola) {
		            String siguiente = cola.peekFirst();
		            if (siguiente == null) {
		                System.out.println("No hay trabajos en la cola.");
		                return;
		            }
		            System.out.println("Atendiendo: " + siguiente);
		            cola.pollFirst(); // Retira el primero
		            System.out.println("Estado tras atender: " + cola);
		        }
		        // Atender un trabajo urgente
		        colaImpresion.addFirst("UrgenteX");*/
		
		
		
	}
	
	public class ColaImpresion{
		LinkedList<String> colaImpresion = new LinkedList<>();
		colaImpresion.addLast("DocA");
		colaImpresion.addLast("DocB");
		colaImpresion.addLast("DocC");
		
		private static void atenderSiguiente(LinkedList<String>cola) {
			String siguiente = cola.peekFirst();
			if(siguiente == null) {
				System.out.println("No hay trabajos en la cola");
			}
			System.out.println("Atendiendo: " + siguiente);
			cola.pollFirst();
			System.out.println("Estado tras atender: " + cola);
		}
	}
}
