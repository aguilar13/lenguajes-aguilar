/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread3;

/**
 *
 * @author T-102
 * tercer forma de crear threads, es la mejor y es la que me van a preguntar
 * en el examen
 */
public class LaMejor {
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("soy el mejor");
            }
        });
        t1.start();
    }
    
}
