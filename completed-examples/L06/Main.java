public class Main {
    public static void main(String[] args) {
        Mascota[] equipo = {new Mascota("Nube", 2), new Mascota("Sol", 4)};
        Mascota elegida = equipo[0];
        elegida.alimentar();
        System.out.println(elegida.getNombre() + " tiene " + elegida.getEnergia());
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
        if (nueva >= 0 && nueva <= 5) {
            energia = nueva;
        }
    }

    void alimentar() {
        setEnergia(energia + 1);
    }
}
