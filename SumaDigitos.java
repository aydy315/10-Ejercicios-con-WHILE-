import java.util.Scanner;
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        int suma = 0;
        while (numero > 0) {
            suma = suma + (numero % 10); // obtiene el último dígito
            numero = numero / 10;        // elimina el último dígito
        }
        System.out.println("La suma de los dígitos es: " + suma);
        entrada.close();
    }
}