/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trhread1;

/**
 *
 * @author T-102
 */
public class AplicacionThread1 {
    public static void main(String[] args) {
        //Creado
        TareaMensa t1=new TareaMensa();
        //iniciando
        t1.start();
        //ejecucion
        try{     t1.start();
            Thread.sleep(5000);
       
        }catch(InterruptedException e){
        }
        //La muerte viene cuando acaba de ejecutarse
        
    }
    
}
