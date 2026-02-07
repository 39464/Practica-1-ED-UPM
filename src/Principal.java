public class Principal {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Felipe Arias González", "aa1253", 3.50);
        Alumno a2 = new Alumno("Manuel García Sacedón", "ax0074", 8.35);
        Alumno a3 = new Alumno("Margarita López Medina", "mj7726", 7.70);
        Alumno a4 = new Alumno("Estela Sánchez Arellano", "bc2658", 6.75);

        a1.matricularAsignatura("Estructuras de Datos");
        a2.matricularAsignatura("Estructuras de Datos");
        a3.matricularAsignatura("Estructuras de Datos");
        a4.matricularAsignatura("Estructuras de Datos");
        a4.matricularAsignatura("Estructuras de Computadores");
        a4.matricularAsignatura("Álgebra");

        a4.mostrarAsignaturas(); a1.mostrarAlumno(); a4.mostrarAlumno();

        GrupoAlumnos grupoAlumno = new GrupoAlumnos(20, "GX11");
        grupoAlumno.insertarAlumno(a1); grupoAlumno.insertarAlumno(a2); grupoAlumno.insertarAlumno(a3); grupoAlumno.insertarAlumno(a4);
        grupoAlumno.mostrarGrupo();
        grupoAlumno.getAlumno(1).mostrarAlumno();

        if(grupoAlumno.mediaCalificaciones() != -1){
            System.out.println("Media de calificaciones: "+grupoAlumno.mediaCalificaciones()+"\n");
        } else{
            System.out.println("El grupo está vacío");
        }

        if(grupoAlumno.mejorAlumno() != null){
            grupoAlumno.mejorAlumno().mostrarAlumno();
        }else{
            System.out.println("El grupo está vacío");
        }

        if(grupoAlumno.eliminarAlumno("Manuel García Sacedón")){
            grupoAlumno.mostrarGrupo();
        }else{
            System.out.println();
        }

        if(grupoAlumno.eliminarAlumno("Estela Sánchez Arellano")){
            grupoAlumno.mostrarGrupo();
        }else{
            System.out.println();
        }

        if(grupoAlumno.eliminarAlumno("Felipe Segovia López")){
            grupoAlumno.mostrarGrupo();
        }else{
            System.out.println();
        }
    }
}
