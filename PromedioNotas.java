import java.util.Scanner;
public class PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        int suma = 0;
        int contador = 0;
        System.out.println("Ingrese notas (-1 para terminar):");
        nota = entrada.nextInt();
        while (nota != -1) {
            suma = suma + nota;
            contador++;
            nota = entrada.nextInt();
        }
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }
        entrada.close();
    }
}
