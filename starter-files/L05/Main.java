public class Main {
    public static void main(String[] args) {
        Mascota nube = new Mascota("Nube", 2);
        Mascota sol = new Mascota("Sol", 4);
        Mascota[] equipo = {nube, sol};
        for (Mascota mascota : equipo) {
            System.out.println(mascota.getNombre() + " tiene " + mascota.getEnergia());
        }
    }
}

class Mascota {
    private final String nombre;
    private int energia;

    Mascota(String nombre, int energiaInicial) {
        this.nombre = nombre;
        setEnergia(energiaInicial);
    }

    String getNombre() {
        return nombre;
    }

    int getEnergia() {
        return energia;
    }

    void setEnergia(int nueva) {
        energia = nueva;
    }

    void alimentar() {
        // Suma una unidad de energía aquí.
    }
}
