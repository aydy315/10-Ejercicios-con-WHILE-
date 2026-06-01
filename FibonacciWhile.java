import java.util.Scanner;
public class FibonacciWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos: ");
        int n = entrada.nextInt();
        int a = 0, b = 1;
        int contador = 0;
        System.out.println("Serie de Fibonacci:");
        while (contador < n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }
        entrada.close();
    }
}
