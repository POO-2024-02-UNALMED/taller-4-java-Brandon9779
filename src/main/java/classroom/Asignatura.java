package classroom;

public class Asignatura {
    public String nombre = "Sin nombre";
    public int codigoInterno = 0;
    public int codigoExterno = 0;
    public Tipo tipo;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.codigoExterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0; 
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }


    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
        this.tipo = tipo;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoExterno(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
