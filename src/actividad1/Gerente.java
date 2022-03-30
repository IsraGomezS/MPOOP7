package actividad1;
/**
 * Método que crea un gerente
 * @author @author Danna Blanco, David Gómez, David Montoya 
 */
public class Gerente extends Empleado{ // Clase heredad de Empleado
    private int presupuesto;
    /**
     * Constructor vacío
     */
    public Gerente() {
    }
    /**
     * Constructor que recibe parámetros.
     * @param presupuesto Presupuesto que posee el gerente.
     * @param nombre Nombre del empleado.
     * @param numEmpleado Número del empleado.
     * @param sueldo Sueldo del empleado.
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, 
            int sueldo) {
        super(nombre, numEmpleado, sueldo); // Inflada, mètodo constructor de Empleado
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Método que asigna un presupuesto al gerente.
     * @param presupuesto Presupuesto que posee el gerente.
     */
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }
    /**
     * Metodo que devuelve la información del gerente y la superclase Empleado.
     * @return Regresa la información del gerente como String.
     */
    @Override
    public String toString() {
        return super.toString() + "\n Gerente{" + "presupuesto=" 
                + presupuesto + '}';
        // Recupera el metodo toString() de Empleado
    }       
}
