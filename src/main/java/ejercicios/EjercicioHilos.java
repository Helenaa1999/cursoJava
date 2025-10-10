package ejercicios;

public class EjercicioHilos {

	public static void main(String[] args) {
		/*
		 *Crea un programa que lance dos hilos. Cada hilo debe imprimir
		 *su nombre y un contador del 1 al 5, con una pequeña pausa entre cada número. 
		 *El objetivo es observar cómo los hilos se intercalan al ejecutarse. 
		 * */
		Thread hilo1 = new Thread(new Contador("Hilo-A"));
		Thread hilo2 = new Thread(new Contador("Hilo-B"));
		
		
	}

}
