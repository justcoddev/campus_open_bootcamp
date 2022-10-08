package EjercicioTema9;

//        Crea una clase Persona con las siguientes variables:
//        La edad
//        El nombre
//        El teléfono
//        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá
//        la variable credito solo para esa clase.
//        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono,
//        el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario
//        que solo tenga la clase Trabajador.
public class main {
    public static void main(String[] args) {
        System.out.println("CLIENTE");
        Cliente cliente = new Cliente();
        cliente.setNombre("justcoddev");
        cliente.setEdad(26);
        cliente.setTelefono(123456789);
        cliente.setCredito(true);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.isCredito());

        System.out.println("TRABAJADOR");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("justcoddev");
        trabajador.setEdad(26);
        trabajador.setTelefono(123456789);
        trabajador.setSalario(200.13);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Credito: " + trabajador.getSalario());
    }
}
