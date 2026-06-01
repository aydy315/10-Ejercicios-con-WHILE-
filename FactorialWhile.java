import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("El factorial es: " + factorial);
        entrada.close();
    }
}
