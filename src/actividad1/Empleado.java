package actividad1;
/**
 * Clase que crea a un empleado.
 * @author @author Danna Blanco, David Gómez, David Montoya 
 */
public class Empleado extends Object{ 
// Todas las clases heredan de Object, por tanto no es necesario agregar el extends
    private String nombre;
    private int numEmpleado, sueldo;
    /**
     * Constructor vacío.
     */
    public Empleado() {
    }
    /**
     * Constructor que recibe parámetros.
     * @param nombre Nombre del empleado.
     * @param numEmpleado Número del empleado.
     * @param sueldo Sueldo del empleado.
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
    * Método que aumenta el sueldo del empleado.
    * @param porcentaje Recibe un entero que indica el porcentaje en 
    * que se incrementa el sueldo.
    */
    public void aumentarSueldo(int porcentaje){
        sueldo += (int) (sueldo * porcentaje / 100);
    }
    /**
     * Metodo que devuelve la información del empleado.
     * @return Regresa la información del empleado como String
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" 
                + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}
