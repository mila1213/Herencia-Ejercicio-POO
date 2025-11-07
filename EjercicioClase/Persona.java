package EjercicioClase;
//public  final class Persona- error ya que la poner final no permite heredar
public  class Persona { //final para que no sea heredada
    String cedula;
    String nombre;
    int edad;

    public Persona(String cedula,String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }
    public void imprimir() {
        System.out.println("-----DATOS PERSONALES-----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
    }
}