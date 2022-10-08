package Polimorfismo;

class Coche extends Vehiculo {
    public void diHola() {
        System.out.println("Soy un coche");
    }

    public int sumaNumeros(int a, int b) {
        System.out.println("Suma numeros de INT:");
        return a + b;
    }

    public float sumaNumeros(float a, float b) {
        System.out.println("Suma numeros de float:");
        return a + b * (float) 9.0;
    }

    public void sumaNumeros(double a, double b) {
        System.out.println("Suma numeros de double:");
        System.out.println("El resultado es: " + (a + b));
    }
}
