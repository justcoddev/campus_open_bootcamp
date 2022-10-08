package Encapsulacion;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coche");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scooter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println("Vehiculo: " + coche.getTipo());
        System.out.println("Velocidad: " + coche.getVelocidadMaxima());
        System.out.println("Rapido: " + coche.isRapido());

        System.out.println("\nVehiculo: " + moto.getTipo() + "\nVelocidad: " + moto.getVelocidadMaxima() + "\nRapido: " + moto.isRapido());

    }
}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }
}