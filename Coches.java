public class Coches {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        System.out.println("Las puertas del coche son: 4");

        miCoche.AgragarPuerta();

        System.out.println("El total de Puertas son: " + miCoche.Puertas);
    }

}

class Coche {
    public int Puertas = 4;

    public void AgragarPuerta() {
        this.Puertas++;
    }
}
