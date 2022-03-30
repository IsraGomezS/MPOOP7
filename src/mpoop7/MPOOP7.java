package mpoop7;

import actividad1.Empleado;
import actividad1.Gerente;
// Actividad extra
import actividad2.Perro;
import actividad2.Alumno;
import actividad2.Gato;
import actividad2.Mascota;
import actividad2.Mesero;
import actividad2.ProfesorAsignatura;
import actividad2.ProfesorCarrera;
/**
 * @author Danna Blanco, David Gómez, David Montoya 
 */
public class MPOOP7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado ();
        empleado.setNombre("Joaquin");
        empleado.setNumEmpleado(998877);
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        System.out.println(empleado.toString());
        /*
        Como todas las clases heredan de Object, ya no sera necesario
        la linea 20 donde se manda a imprimir el empleado.toString()
        */
        empleado.aumentarSueldo(30);
        System.out.println(empleado);
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(887766);
        gerente.setSueldo(30_000);
        gerente.setPresupuesto(100_000);
        System.out.println(gerente);
        gerente.aumentarSueldo(50);
        System.out.println(gerente);
        
        Gerente gerente2 = new Gerente(1_000_000,"Saul",113365,50_000);
        System.out.println(gerente2);
        
        System.out.println("\n########## Actividades Extra ###########\n");
        System.out.println("########## Objeto perro ###########");
        Perro perro = new Perro();
        perro.setColaCortada(true);
        perro.setColor("café");
        perro.setRaza("husky");
        perro.setColorOjos("azules");
        perro.setNombre("Laila");
        perro.setEdad(5);
        System.out.println(perro);
        
        System.out.println("\n########## Objeto gato ###########");
        Gato gato = new Gato ("blanco", "persa", "verdes", "Milo", 4);
        System.out.println(gato);
        
        System.out.println("\n########## Objeto Alumno ###########");
        Alumno alumno = new Alumno("Eléctrica", 5, new Mascota("negro", 
                "doberman", "cafés", "Bruno", 3),"Juan", 19);
        System.out.println(alumno);
        
        System.out.println("\n########## Objeto Mesero ###########");
        Mesero mesero = new Mesero("Vapiano", "negro", 
                7_500, 10, 19,new Mascota("blanco", "pug", "negros", "Lola", 3),
                "Juan", 21);
        System.out.println(mesero);
        
        System.out.println("\n########## Objeto ProfesorAsigntura ###########");
        ProfesorAsignatura profesor1 = new ProfesorAsignatura("Mecánica", 
                8_500, 9, 11, new Mascota("blanco", "siamés", "azules", "Freddy", 
                        3), "Benito", 40);
        System.out.println(profesor1);
        
        System.out.println("\n########## Objeto ProfesorCarrera ###########");
        ProfesorCarrera profesor2 = new ProfesorCarrera(3, 4, 
            11_500, 7, 13,new Mascota("café", "cobrador dorado", "negros",
                    "Bongo",7), "Fidel", 52);
        System.out.println(profesor2);
    }
}
