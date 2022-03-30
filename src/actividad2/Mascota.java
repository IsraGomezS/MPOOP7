package actividad2;
/**
 * Clase que crea una mascota.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Mascota extends SerVivo{ 
    private String color;
    private String raza;
    private String colorOjos;
    /**
     * Constructor vacío
     */
    public Mascota() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Mascota.
     * @param color Color del pelaje de la mascota.
     * @param raza Raza de la mascota.
     * @param colorOjos Color de ojos de la mascota.
     * @param nombre Nombre de la mascota.
     * @param edad Edad de la mascota.
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    /**
     * Método para indicar que la mascota está durmiendo.
     */
    public void dormir (){
        System.out.println("Estoy durmiendo");
    }
    /**
     * Método para indicar que la mascota está saltando.
     */
    public void saltar (){
        System.out.println("Estoy saltando");
    }
    /**
     * Método para indicar que la mascota está jugando.
     */
    public void jugar (){
        System.out.println("Estoy jugando");
    }
    /**
     * Metodo que devuelve la información de la clase
     * Mascota y su superclase SerVivo.
     * @return Regresa la información de la mascota como String.
     */
    @Override
    public String toString() {
        return super.toString()+"\n Mascota{" + "color=" + color + 
                ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
   
}
