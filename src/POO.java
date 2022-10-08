public class POO {
    public static void main(String[] args) {
        Coche coche = new Coche(2, 90);
        System.out.println(coche.numeroPuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

    }
}

class Coche {
    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche() {
        numeroPuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor");
    }

    public Coche(int numeroPuertas, int velocidadMaxima) {
        this.numeroPuertas = numeroPuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor con parametros");
    }


}
