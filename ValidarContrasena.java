import java.util.Scanner;
public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String claveCorrecta = "1234";
        String claveIngresada = "";
        while (!claveIngresada.equals(claveCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            claveIngresada = entrada.nextLine();
            if (!claveIngresada.equals(claveCorrecta)) {
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("¡Acceso concedido!");
        entrada.close();
    }
}
