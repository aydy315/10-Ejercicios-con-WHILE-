import java.util.Scanner;
public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0;
        System.out.println("Ingrese números (0 para terminar):");
        while (true) {
            numero = entrada.nextInt();
            if (numero == 0) {
                break; // termina cuando ingresa 0
            }

            if (numero > 0) {
                contador++;
            }
        }
        System.out.println("Cantidad de números positivos: " + contador);
        entrada.close();
    }
}
