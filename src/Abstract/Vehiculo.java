package Abstract;

abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "xxx") {
            return true;
        }
        return false;
    }

    public Vehiculo() {
        System.out.println("Cosntructor vacio");
    }

    abstract public String getSonido();

    abstract public void setSonido(String sonido);
}
