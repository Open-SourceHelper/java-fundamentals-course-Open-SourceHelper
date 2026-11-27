import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un apodo:");
        String apodo = teclado.nextLine();
        System.out.println(apodo);
        teclado.close();
    }
}
