package Ciclos;

public class Bucles {
    public static void main(String[] args) {
        int contador = 2;
        while (contador > 0) {
            System.out.println(contador);
            contador = contador - 1;
        }

        do {
            System.out.println(contador);
            contador = contador - 1;

        } while (contador > 2);


    }
}
