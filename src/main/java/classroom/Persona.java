package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;

    static {
        totalPersonas = 0;
    }

    // Constructor con parámetros
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    // Constructor solo con nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 0; // Cédula por defecto
        totalPersonas++;
    }

    // Constructor solo con cédula
    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = ""; // Nombre por defecto
        totalPersonas++;
    }


    public Persona() {
        this.cedula = 0;
        this.nombre = ""; 
        totalPersonas++;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
