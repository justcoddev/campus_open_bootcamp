package Abstract;

import Abstract.Coche;

public class mainAbstract {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("BRRR");

        System.out.println(coche.getSonido());
    }
}
