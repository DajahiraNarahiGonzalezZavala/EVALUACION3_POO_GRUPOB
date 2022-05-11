/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_;

/**
 *
 * @author invitado
 */
public class EVA3_9_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        System.out.println("Introduce un numero entero 2");
 
        
        try{
            System.out.println("Introduce un numero entero 1:");
            int entero = input.nextInt();
            System.out.println("Introduce un numero entero 2");
            int entero2 =input.nextInt();
            System.out.println("Division: " + entero/entero2);
            
        }catch  (ArithmeticException miVariable){
            System.out.println("Se produjo una division entre 0");
        } catch (inputMismatchException e {
            System.out.println("El valor capturado no es un numero valido");
        }
        System.out.println("FIN DEL PROGRAMA");
    }

    private static class inputMismatchException {

        public inputMismatchException() {
        }
    }
    
}
    
    
