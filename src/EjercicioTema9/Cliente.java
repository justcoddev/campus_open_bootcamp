package EjercicioTema9;

public class Cliente extends Persona{
    private boolean credito;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, int telefono, boolean credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
}
