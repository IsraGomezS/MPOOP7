package actividad2;
/**
 * Clase que crea un empleado.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Empleado extends Persona{
    private float salario;
    int horaEntrada, horaSalida;
    /**
     * Constructor vacío.
     */
    public Empleado() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Empleado.
     * @param salario Salario del empleado.
     * @param horaEntrada Hora de entrada del empleado.
     * @param horaSalida Hora de salida del empleado.
     * @param mascota Mascota del empleado.
     * @param nombre Nombre del empleado.
     * @param edad Edad del empleado.
     */
    public Empleado(float salario, int horaEntrada, int horaSalida, 
            Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    // MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    /**
     * Método para indicar que el empleado está aclarando dudas.
     */
    public void aclararDudas(){
        System.out.println("Empleado aclarando dudas.");
    }
    /**
     * Metodo que devuelve la información de la clase
     * Empleado y sus superclases SerVivo y Persona.
     * @return Regresa la información del empleado como String.
     */
    @Override
    public String toString() {
        return super.toString()+"\n Empleado{" + "salario=" + salario 
                + ", horaEntrada=" + horaEntrada + ", horaSalida=" 
                + horaSalida + '}';
    }
    
    
    
}
