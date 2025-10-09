package ejercicios;

public class ArrayPrimitivo {

	public static void main(String[] args) {
		double[] notas = {5, 7, 9, 6, 8};
		double media = calcularMedia(notas);
		double notaMasAlta = calcularNotaMasAlta(notas);
		//double arrayNotasMas7 = buscarNotaMas7(notas);
		
		System.out.println("Media de las notas: " + media +  "\n"
				+ "Nota más alta: " + notaMasAlta);
		
		
		
	}
	public static double calcularMedia(double [] notas) {
		double sumaTotalNotas=0;
		double media =0;
		for(int i = 0; i<notas.length; i++) {
			sumaTotalNotas += notas[i];
		}
		media = sumaTotalNotas/notas.length;
		return media;
	}
	
	public static double calcularNotaMasAlta (double [] notas) {
		double notaMasAlta=0;
		for (int i=0; i<notas.length; i++) {
			if(notas[i]>notaMasAlta) {
				notaMasAlta = notas[i];
			}
		}
		return notaMasAlta;
	}
	
	/*public static double[] crearArrayNotasMas7(double [] notas) {
		double [] arrayNotasMas7= new double[5];
		for (int i=0; i<notas.length; i++) {
			if(notas[i] >=7) {
				arrayNotasMas7.
			}
		}
		
	}*/
}
