package actividad2;
/**
 * Clase que crea un mesero.
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class Mesero extends Empleado{ //
    private String restaurante;
    private String colorDelUniforme;
    /**
     * Constructor vacio
     */
    public Mesero() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Mesero.
     * @param restaurante Restaurante en donde trabaja el mesero
     * @param colorDelUniforme Color del uniforme del mesero.
     * @param salario Salario del mesero.
     * @param horaEntrada Hora de entrada del mesero.
     * @param horaSalida Hora de salida del mesero.
     * @param mascota Mascota del mesero.
     * @param nombre Nombre del mesero.
     * @param edad Edad del mesero. 
     */
    public Mesero(String restaurante, String colorDelUniforme, float salario, 
            int horaEntrada, int horaSalida, Mascota mascota, String nombre, 
            int edad){
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.restaurante = restaurante;
        this.colorDelUniforme = colorDelUniforme;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getColorDelUniforme() {
        return colorDelUniforme;
    }

    public void setColorDelUniforme(String colorDelUniforme) {
        this.colorDelUniforme = colorDelUniforme;
    }
    /**
     * Metodo que recibe la propina
     */
    public void recibirPropina(){
        System.out.println("Gracias por su propina");
    }
    /**
     * Metodo que da el pedido
     */
    public void darPedido(){
        System.out.println("El pedido de mesa es...");
    }
    /**
     * Metodo que toma la orden
     */
    public void recibirPedido(){
        System.out.println("Le tomo su orden");
    }
    /**
     * Metodo que devuelve la información de la clase
     * Mesero y sus superclases SerVivo, Persona y Empleado.
     * @return Regresa la información del mesero como String.
     */
    @Override
    public String toString() {
        return super.toString() + "\n Mesero{" + "restaurante=" + restaurante 
                + ", colorDelUniforme=" + colorDelUniforme + '}';
    }
      
}
