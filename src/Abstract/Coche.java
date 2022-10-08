package Abstract;


import Abstract.Vehiculo;

class Coche extends Vehiculo {
    public String getSonido(){
        return this.sonido;}
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
