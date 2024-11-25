package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas = 0;

    public Persona() {
        this.cedula = totalPersonas++;  
        this.nombre = "";
    }

    public Persona(String nombre) {
        this.cedula = totalPersonas++;  
        this.nombre = nombre;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
    }

    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
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
