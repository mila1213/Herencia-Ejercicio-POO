package EjercicioClase;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("17562385", "Cami", 20);
        Estudiante e1 = new Estudiante("1234567890", "Maria", 20, "E001");
        Docente d1 = new Docente("1234567890", "Juan", 20, "POO");
        p1.imprimir();
        e1.imprimir();
        e1.imprimir2();
        d1.imprimir();
        d1.imprimirD();
    }
}
