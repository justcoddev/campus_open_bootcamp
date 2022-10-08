package Herencia;

 class Vehiculo {
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

     public int getVelocidadMaxima() {
         return velocidadMaxima;
     }

     public void setVelocidadMaxima(int velocidadMaxima) {
         this.velocidadMaxima = velocidadMaxima;
     }

     public String getMatricula() {
         return matricula;
     }

     public void setMatricula(String matricula) {
         this.matricula = matricula;
     }

     public String getSonido() {
         return sonido;
     }

     public void setSonido(String sonido) {
         this.sonido = sonido;
     }
 }
