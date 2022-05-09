/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce tu edad (numero entero)"); int edad = input.nextInt();
          try{
               
           } catch (InputMismatchException e){
             e.printStackTrace (); 
           }
        
                    System.out.println("Tu edad" +  edad);
        // TODO code application logic here
    }
    
}
