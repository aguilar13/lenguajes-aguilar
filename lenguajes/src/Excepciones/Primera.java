/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T-102
 */
public class Primera {
    public static void main(String[] args) {
        //vamos primero la familia de excepciones 
        //que el compilador se hace catgo de ellas.
        
        
      /*  int x=0;
        float y=2;
        //este renglon manda una excepcion que se llama aritmethicException
        
        System.out.println(y/x);
        
        int[] arreglo={1,2,3};
        System.out.println(arreglo[3]);*/
        try{
        float a=2;
        float b=Float.parseFloat("veinte");
        System.out.println(a*b);
        
    }catch(Exception hola){
            System.out.println(hola.getMessage());

    }
    
}
}