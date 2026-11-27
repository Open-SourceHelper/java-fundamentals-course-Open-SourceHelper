import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un apodo:");
        String apodo = teclado.nextLine();
        saludar(apodo);
        Mascota mascota = new Mascota(apodo);
        System.out.println("Ficha: " + mascota.nombre);
        teclado.close();
    }

    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }
}

class Mascota {
    String nombre;

    Mascota(String nombreInicial) {
        nombre = nombreInicial;
    }
}
