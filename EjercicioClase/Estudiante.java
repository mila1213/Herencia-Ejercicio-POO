package EjercicioClase;

public class Estudiante extends Persona {
    String codigo;
    public Estudiante(String cedula, String nombre, int edad, String codigo) {
        super(cedula, nombre, edad);// para llamar ya los atributos de la clase padre
        this.codigo = codigo; // Se inicializa los atributos que no esten dentro de la clase padre
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Codigo: " + codigo);
    }
    public void imprimir2() {
        imprimir();
    }
}
