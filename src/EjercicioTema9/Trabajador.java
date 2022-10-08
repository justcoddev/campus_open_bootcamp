package EjercicioTema9;

public class Trabajador extends Persona {
    private double salario;

    public Trabajador() {
    }



    public Trabajador(String nombre, int edad, int telefono, double salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
