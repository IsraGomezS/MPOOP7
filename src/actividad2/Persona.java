package actividad2;
/**
 * Clase que crea una persona.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Persona extends SerVivo{
    private Mascota mascota;
    /**
     * Constructor vacío.
     */
    public Persona() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Persona.
     * @param mascota El tipo de mascota que tiene
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona.
     */
    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    /**
     * Metodo que devuelve la información de la clase
     * Persona y su superclase SerVivo.
     * @return Regresa la información de la persona como String.
     */
    @Override
    public String toString() {
        return super.toString()+"\n Persona{" 
                + "mascota=" + mascota + '}';
    }

}
