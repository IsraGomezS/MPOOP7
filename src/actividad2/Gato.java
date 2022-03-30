package actividad2;
/**
 * Clase que crea un gato.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Gato extends Mascota {
    /**
     * Constructor vacío
     */
    public Gato() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Gato.
     * @param color Color del pelaje del gato.
     * @param raza Raza del gato.
     * @param colorOjos Color de ojos del gato.
     * @param nombre Nombre del gato.
     * @param edad Edad del gato.
     */
    public Gato(String color, String raza, String colorOjos, 
            String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    /**
     * Método para indicar que el gato está rasguñando
     */
    public void rasguniar() {
        System.out.println("Estoy rasguñando");
    }
    /**
     * Método para indicar que el gato está trepando
     */
    public void trepar() {
        System.out.println("Estoy trepando");
    }
    /**
     * Metodo que devuelve la información de la clase
     * Gato y sus superclases SerVivo y Mascota.
     * @return Regresa la información del gato como String.
     */
    @Override
    public String toString() {
        return super.toString()+"\n Gato{" + '}';
    }
    
}
