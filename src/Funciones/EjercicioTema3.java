package Funciones;

//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.
//Segunda parte:
//Crear una clase coche.
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//Una función que incremente el número de puertas que tiene el coche.
//Crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el número de puertas que tiene el objeto.

public class EjercicioTema3 {
    public static void main(String[] args) {
        int resultado = Suma(2, 3, 4);
        System.out.println("Suma: " + resultado);


        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("Cantidad de Puertas incrementadas: " + miCoche.puerta);
    }

    public static int Suma(int a, int b, int c) {
        return a + b + c;
    }


}

class Coche {
    public int puerta = 0;

    public void IncrementarPuertas() {
        this.puerta++;
    }
}