package EjercicioClase;

public class Docente extends Persona {
    String materia;

    public Docente(String cedula, String nombre, int edad, String materia) {
        super(cedula, nombre, edad);
        this.materia = materia;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Materia: " + materia);
    }
    public void imprimirD() {
        imprimir();
    }
}
