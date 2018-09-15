package mx.edu.ittepic.clase5;

public class Cliente {

    private String nombre;
    private String domicilio;
    private int edad;

    public Cliente() {

    }

    public Cliente(String nombre, String domicilio, int edad) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
