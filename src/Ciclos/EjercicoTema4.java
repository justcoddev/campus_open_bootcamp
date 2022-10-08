package Ciclos;

public class EjercicoTema4 {
    public static void main(String[] args) {
       /* Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
        int numeroIf = 3;
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

       /* Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
       el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.*/
        int numeroWhile = 0;
        System.out.println("Número While: " + numeroWhile);
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println("Incrementar en 1: " + numeroWhile);
        }
//        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numeroDoWhile = 0;
        do {
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);
        System.out.println(numeroDoWhile);
/*        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
        que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
        deberá mostrarse por pantalla.*/

        for (int numeroFor = 1; numeroFor <= 3; numeroFor++) {
            System.out.println("Incremento en 1 For: " + numeroFor);
        }
        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación
        en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.*/
        String estacion = "Invierno";

        switch (estacion) {
            case "Invierno":
                System.out.println("Estanción de Invierno!! Uff que ausencia de calor!!");
                break;
            case "Otoño":
                System.out.println("Estanción de Otoño!!");
                break;
            case "Verano":
                System.out.println("Estanción de Verano!! ");
                break;
            case "Primavera":
                System.out.println("Estanción de Primavera!!");
                break;
            default:
                System.out.println("No es una estación del año");

        }


    }
}
