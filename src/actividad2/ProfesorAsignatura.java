package actividad2;
/**
 * Clase que crea un profesor de asignatura.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class ProfesorAsignatura extends Profesor{
    private String nombreAsignatura;
    /**
     * Constructor vacio
     */
    public ProfesorAsignatura() {
    }
    /**
     * Constructor que recibe los parámetros de la clase ProfesorAsignatura.
     * @param nombreAsignatura El nombre de la asignatura que imparte
     * @param salario Salario del profesor de asignatura.
     * @param horaEntrada Hora de entrada del profesor de asignatura.
     * @param horaSalida Hora de salida del profesor de asignatura.
     * @param mascota Mascota del profesor de asignatura.
     * @param nombre Nombre del profesor de asignatura.
     * @param edad Edad del profesor de asignatura.
     */
    public ProfesorAsignatura(String nombreAsignatura, float salario, 
            int horaEntrada, int horaSalida, Mascota mascota, 
            String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    /**
     * Metodo que devuelve la información de la clase ProfesorAsignatura
     * y sus superclases SerVivo, Persona, Empleado y Profesor.
     * @return Regresa la información del mesero como String.
     */
    @Override
    public String toString() {
        return super.toString() + "\n ProfesorAsignatura{" 
        + "nombreAsignatura=" + nombreAsignatura + '}';
    }
    
}
