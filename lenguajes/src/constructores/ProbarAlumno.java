/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
import javax.swing.*;
public class ProbarAlumno {
    public static void main(String[] args){
        Alumno a=new Alumno();
        Alumno a2=new Alumno("Mauricio");
        System.out.println("Tu nombre es"+a2.getNombre());
        
        JFrame ventana=new JFrame("Hola");
        ventana.setSize(200,120);
        ventana.setVisible(true);
        
        
        
        
    }
            
    
    
}
