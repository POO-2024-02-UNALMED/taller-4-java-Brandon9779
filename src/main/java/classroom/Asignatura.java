package classroom;

public class Asignatura {

    String nombre;
    int codigoExterno;
    Tipo tipo;


    public Asignatura() {
        this.nombre = "Sin nombre";
        this.tipo = Tipo.FUNDAMENTACION;
        this.codigoExterno = 0;
    }

   
    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
    }


    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}
