package actividad2;
/**
 * Clase que crea un ser vivo.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class SerVivo {
    private String nombre;
    private int edad;
    /**
     * Constructor vacío.
     */
    public SerVivo() {
    }
    /**
     * Constructor que recibe los parámetros de la clase SerVivo.
     * @param nombre Nombre del ser vivo.
     * @param edad Edad del ser vivo.
     */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para indicar que el ser vivo está respirando.
     */
    public void respirar(){
        System.out.println("Estoy respirando.");
    }
    /**
     * Metodo que devuelve la información de la clase SerVivo.
     * @return Regresa la información del ser vivo como String.
     */
    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
