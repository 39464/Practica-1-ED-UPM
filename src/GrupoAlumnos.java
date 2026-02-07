public class GrupoAlumnos {
    private String nombre;
    private Alumno[] listaAlumnos;
    private int numAlumnos;
    private final int MAXIMO;

    public GrupoAlumnos() {
        this.nombre = "GrupoDesconocido";
        this.MAXIMO = 10;
        this.listaAlumnos = new Alumno[MAXIMO];
        this.numAlumnos = 0;
    }

    public GrupoAlumnos(int maximo, String nombre) {
        this.MAXIMO = maximo;
        this.nombre = nombre;
        this.listaAlumnos = new Alumno[MAXIMO];
        this.numAlumnos = 0;
    }

    public String getNombre(){ return this.nombre; }

    public void setNombre(String nombre){ this.nombre = nombre; }

    public int getMaximo(){ return this.MAXIMO; }

    public int getNumAlumnos(){ return this.numAlumnos; }

    public Alumno getAlumno(int i){
        if (listaAlumnos[i] == null) return null;
        else return this.listaAlumnos[i];
    }

    public boolean insertarAlumno(Alumno alumno){
        boolean resultado = false;
        if(this.numAlumnos < this.MAXIMO){
            this.listaAlumnos[this.numAlumnos] = alumno;
            resultado = true;
            numAlumnos++;
        }
        return resultado;
    }

    public void mostrarGrupo(){
        System.out.printf("GRUPO %s: %d alumnos \n", this.nombre, this.numAlumnos);
        for (int i = 0; i < this.numAlumnos; i++) {
            listaAlumnos[i].mostrarAlumno();
        }
    }

    public double mediaCalificaciones(){
        double total = 0;
        int cont = 0;
        if(this.numAlumnos == 0) return -1;
        else{
            for(int i = 0; i < this.numAlumnos; i++){
                total += listaAlumnos[i].getCalificacion();
                cont++;
            }
            return total / cont;
        }
    }

    public Alumno mejorAlumno(){
        double mejorNota = 0;
        Alumno mejor = new Alumno();
        if(this.numAlumnos == 0) return null;
        else {
            for (int i = 0; i < this.numAlumnos; i++) {
                if (listaAlumnos[i].getCalificacion() > mejorNota) {
                    mejorNota = listaAlumnos[i].getCalificacion();
                    mejor = listaAlumnos[i];
                }
            }
            return mejor;
        }
    }

    public boolean eliminarAlumno(String nombreAlumno){
        String nombre = "";
        int i = 0;
        if(this.numAlumnos == 0) return false;
        else {
            try {
                while (nombre.isEmpty()) {
                    if (this.listaAlumnos[i].getNombre().equals(nombreAlumno)) {
                        nombre = this.listaAlumnos[i].getNombre();
                        this.listaAlumnos[i] = null;
                        for (int j = i; j <= numAlumnos; j++) {
                            this.listaAlumnos[j] = this.listaAlumnos[j + 1];
                        }
                        this.numAlumnos--;
                    }
                    i++;
                }
            }catch(java.lang.NullPointerException e){
                System.out.println("No se pudo eliminar al alumno "+nombreAlumno);
            }
            return nombre.equals(nombreAlumno);
        }
    }
}
