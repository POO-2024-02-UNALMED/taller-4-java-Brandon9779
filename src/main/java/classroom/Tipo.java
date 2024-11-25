package classroom;

public enum Tipo {
    DISCIPLINAR(10, "Disciplinar"),
    FUNDAMENTACION(20, "Fundamentacion"),
    ELECTIVA(30, "Electiva");

    public  int codigo;
    public String nombre;

    Tipo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
