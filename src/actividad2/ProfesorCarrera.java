package actividad2;
/**
 * @author alumno
 */
public class ProfesorCarrera extends Profesor{
    private int numAsignaturas;
    private int grupos;
    /**
     * Constructor vacio
     */
    public ProfesorCarrera() {
    }
    /**
     * Constructor que recibe los parámetros de la clase ProfesorCarrera.
     * @param numAsignaturas El número de asignaturas que imparte.
     * @param grupos Los grupos a los que imparte clases.
      * @param salario Salario del profesor de carrera.
     * @param horaEntrada Hora de entrada del profesor de carrera.
     * @param horaSalida Hora de salida del profesor de carrera.
     * @param mascota Mascota del profesor de carrera.
     * @param nombre Nombre del profesor de carrera.
     * @param edad Edad del profesor de carrera.
     */
    public ProfesorCarrera(int numAsignaturas, int grupos, 
            float salario, int horaEntrada, int horaSalida, 
            Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAsignaturas = numAsignaturas;
        this.grupos = grupos;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }
    /**
     * Metodo que devuelve la información de la clase ProfesorCarrera
     * y sus superclases SerVivo, Persona, Empleado y Profesor.
     * @return Regresa la información del mesero como String.
     */
    @Override
    public String toString() {
        return super.toString() + "\n ProfesorCarrera{" + "numAsignaturas=" 
                + numAsignaturas + ", grupos=" + grupos + '}';
    }
    
    
}
