import java.util.Scanner;
import java.util.Random;
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int intento = 0;
        System.out.println("Adivina el número (entre 1 y 100)");
        while (intento != numeroSecreto) {
            System.out.print("Ingresa tu número: ");
            intento = entrada.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Correcto! Adivinaste el número");
            }
        }
        entrada.close();
    }
}
