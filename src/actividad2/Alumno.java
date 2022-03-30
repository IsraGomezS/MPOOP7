package actividad2;
/**
 * Clase que crea un alumno.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;
    /**
     * Constructor vacío.
     */
    public Alumno() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Alumno.
     * @param carrera Carrera del alumno.
     * @param semestre Semestre que cursa el alumno.
     * @param mascota Mascota del alumno.
     * @param nombre Nombre del alumno.
     * @param edad Edad del alumno.
     */
    public Alumno(String carrera, int semestre, Mascota mascota, 
            String nombre, int edad) {
        super(mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    /**
    * Método para indicar que el alumno está aprendiendo.
    */
    public void aprender(){
        System.out.println("Estoy aprendiendo.");
    }
    /**
    * Método para indicar que el alumno está estudiando.
    */
    public void estudiar(){
        System.out.println("Estoy estudiando.");
    }
    /**
    * Método para indicar que el alumno se está dando de baja.
    */
    public void darseDeBaja(){
        System.out.println("Me estoy dando de baja.");
    }
    /**
     * Metodo que devuelve la información de la clase
     * Alumno y sus superclases SerVivo y Persona.
     * @return Regresa la información del alumno como String.
     */
    @Override
    public String toString() {
        return super.toString()+"\n Alumno{" + "carrera=" 
                + carrera + ", semestre=" + semestre + '}';
    }
}
