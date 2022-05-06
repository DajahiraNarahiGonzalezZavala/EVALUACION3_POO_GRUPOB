/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_nullpointerexception;

/**
 *
 * @author invitado
 */
public class EVA3_4_NULLPOINTEREXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = null;
        imprimir (persona);
    }
  public static void imprimir (Persona perso) {
masComplicado (perso);
      
  } 
  public static void masComplicado (Persona perso) {
      System.out.println("Nombre" + perso.getNombre());
  }
}
class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }
    
}