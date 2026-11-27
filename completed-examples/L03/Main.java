public class Main {
    public static void main(String[] args) {
        int energia = 2;
        if (energia >= 3) {
            System.out.println("A jugar");
        } else {
            System.out.println("A descansar");
        }
        for (int paso = 1; paso <= 3; paso++) {
            System.out.println("Paso " + paso);
        }
        while (energia < 3) {
            energia++;
            System.out.println("Recarga: " + energia);
        }
    }
}
