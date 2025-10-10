package ejercicios;

import java.text.DecimalFormat;

/**

 * Ejemplo de rendimiento de String vs StringBuilder.
 *
 * @see java.lang.String
 * @see java.lang.StringBuilder
 */
public class RendimientoStringVsStringBuilder {
    /**
     * Ejemplo de rendimiento de String vs StringBuilder.
     * Metodo main.
     *
     * @param args argumentos de la linea de comandos
     */

    public static void main(String[] args) {

        int iterations = 10_000;

        long startTime;

        long endTime;

        // Usando String para concatenar
        String strConcatenated = "";
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            strConcatenated += "Hola";
        }
        endTime = System.nanoTime();
        double stringTime = (endTime - startTime) / 1_000_000.0; // pasamos a milisegundos
        DecimalFormat decimalFormatString = new DecimalFormat("#,###.###");
        String stringTimeFormatted = decimalFormatString.format(stringTime);
        System.out.println("Tiempo usando String: "
                        + stringTimeFormatted + " segundos");
        
        // Usando StringBuilder para concatenar
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("Hola");
        }
        endTime = System.nanoTime();
        double stringBuilderTime = (endTime - startTime) / 1_000_000.0; // pasamos a milisegundos
        DecimalFormat decimalFormatStringBuilder = new DecimalFormat("#,###.###");
        String stringBuilderTimeFormatted = decimalFormatStringBuilder.format(stringBuilderTime);
        System.out.println(
                "Tiempo usando StringBuilder: "
                        + stringBuilderTimeFormatted + " segundos");
    }

}
