public class Alumno {
    private String nombre;
    private String matricula;
    private double calificacion;
    private String[] asignaturas;
    private final int maximo = 5;
    private int numAsignaturas;

    public Alumno(){
        nombre = "";
        matricula = "";
        calificacion = 0;
        numAsignaturas = 0;
        asignaturas = new String[maximo];
    }

    public Alumno(String nombre, String matricula, int calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
        numAsignaturas = 0;
        asignaturas = new String[maximo];
    }

    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getCalificacion() {return this.calificacion;}
    public void setCalificacion(double calificacion) {this.calificacion = calificacion; }

    public void matricularAsignatura(String asignatura){
        asignaturas[numAsignaturas] = asignatura;
    }

    public int getNumAsignaturas() {return numAsignaturas;}
    public void mostrarAsignaturas(){
        if (numAsignaturas != 0) {
            System.out.println(numAsignaturas + " asignaturas: ");
            for (int i = 0; i < numAsignaturas; i++) {
                System.out.println("\t- " + asignaturas[i] + ".");
            }
        }else{
            System.out.println("No está matriculado en ninguna asignatura");
        }
    }

    public void mostrarAlumno(){
        System.out.println(nombre + ". Matrícula: "+matricula+ "("+calificacion+")");
        this.mostrarAsignaturas();
    }
}

