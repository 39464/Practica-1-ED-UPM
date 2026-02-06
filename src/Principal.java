public class Principal {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Felipe Arias Gonzalez", "aa1253", 3.50);
        Alumno a2 = new Alumno("Manuel Garcia Sacedon", "ax0074", 8.35);
        Alumno a3 = new Alumno("Margarita Lopez Medina", "mj7726", 7.70);
        Alumno a4 = new Alumno("Estela Sanchez Arellano", "bc2658", 6.75);

        a1.matricularAsignatura("Estructuras de Datos");
        a2.matricularAsignatura("Estructuras de Datos");
        a3.matricularAsignatura("Estructuras de Datos");
        a4.matricularAsignatura("Estructuras de Datos");
        a4.matricularAsignatura("Estructuras de Computadores");
        a4.matricularAsignatura("Algebra");

        a4.mostrarAsignaturas(); a1.mostrarAlumno(); a4.mostrarAlumno();
    }
}
