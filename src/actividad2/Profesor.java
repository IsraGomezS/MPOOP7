package actividad2;
/**
 * Clase que crea un profesor.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Profesor extends Empleado{
    /**
     * Constructor vacio
     */
    public Profesor() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Profesor.
     * @param salario Salario del profesor.
     * @param horaEntrada Hora de entrada del profesor.
     * @param horaSalida Hora de salida del profesor.
     * @param mascota Mascota del profesor.
     * @param nombre Nombre del profesor.
     * @param edad Edad del profesor.
     */

    public Profesor(float salario, int horaEntrada, int horaSalida, 
            Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
    }
    /**
     * Metodo que aclara dudas
     */
    public void aclararDudas(){
        System.out.println("Aclarando dudas...");
    }
    /**
     * Metodo que devuelve la información de la clase
     * Profesor y sus superclases SerVivo, Persona y Empleado.
     * @return Regresa la información del mesero como String.
     */
    @Override
    public String toString() {
        return super.toString() + "\n Profesor{" + '}';
    }

    
    
    
}
