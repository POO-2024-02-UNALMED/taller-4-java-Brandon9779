package classroom;

public class Asignatura {
    public String nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    // Constructor 1: Por defecto
    public Asignatura() {
        this.nombre = "Sin nombre";
        this.codigoExterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    // Constructor 2: Nombre y tipo
    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0; // Según el test, debe ser 0
    }

    // Constructor 3: Código externo y tipo
    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre"; // Según el test, debe ser "Sin nombre"
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    // Constructor 4: Nombre, código externo, código interno y tipo
    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoExterno(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
