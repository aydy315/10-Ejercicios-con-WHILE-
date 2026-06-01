import java.util.Scanner;
public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;          // extrae último dígito
            invertido = invertido * 10 + digito; // construye el número invertido
            numero = numero / 10;              // elimina último dígito
        }
        System.out.println("Número invertido: " + invertido);
        entrada.close();
    }
}
