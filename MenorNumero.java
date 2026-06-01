import java.util.Scanner;
public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int menor = Integer.MAX_VALUE; // valor inicial grande
        System.out.println("Ingrese números (0 para terminar):");
        numero = entrada.nextInt();
        while (numero != 0) {
            if (numero < menor) {
                menor = numero;
            }
            numero = entrada.nextInt();
        }
        if (menor == Integer.MAX_VALUE) {
            System.out.println("No se ingresaron números.");
        } else {
            System.out.println("El menor número es: " + menor);
        }
        entrada.close();
    }
}
