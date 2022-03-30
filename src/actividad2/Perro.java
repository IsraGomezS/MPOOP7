package actividad2;
/**
 * Clase que crea un perro.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Perro extends Mascota {
    private boolean colaCortada;
    /**
     * Constructor vacío
     */
    public Perro() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Perro.
     * @param colaCortada Atributo que indica si tiene la cola cortada o no.
     * @param color Color del pelaje del perro.
     * @param raza Raza del perro.
     * @param colorOjos Color de ojos del perro.
     * @param nombre Nombre del perro.
     * @param edad Edad del perro.
     */
    public Perro(boolean colaCortada, String color, String raza, 
            String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    /**
     * Método para indicar que el perro está corriendo.
     */
    public void correr (){
    System.out.println("Estoy corriendo");
    }
    /**
     * Método para indicar que el parro está correteando
     */
    public void corretear (){
    System.out.println("Estoy correteando");}    
    /**
     * Metodo que devuelve la información de la clase
     * Perro y sus superclases SerVivo y Mascota.
     * @return Regresa la información del perro como String.
     */
    public boolean isColaCortada() {
        return colaCortada;
    }
    /**
     * Metodo que devuelve la información de la clase
     * Perro y sus superclases SerVivo y Mascota.
     * @return Regresa la información del perro como String.
     */
    @Override
    public String toString() {
        return super.toString()+"\n Perro{" + "colaCortada=" 
                + colaCortada + '}';
    }
    
    
}
