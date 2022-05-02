/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_stack_overflow;

/**
 *
 * //Narahi
 */
public class EVA3_1_STACK_OVERFLOW {

    /**
     */
    public static int cont = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        terminarStack();
    }
    public static void terminarStack (){
    
        cont = cont + 1;
        System.out.println(cont);
        terminarStack (); //
    }
    
}
