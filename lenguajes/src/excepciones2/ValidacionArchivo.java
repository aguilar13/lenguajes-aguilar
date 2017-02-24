/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author T-102
 */
import java.io.*;

public class ValidacionArchivo {
    public static void validarExtencion(File file)throws ExtensionNoValidaException{
        
       // throw new ExtensionNoValidaException();
        String nombre = file.getName();
        
       //como obtener la extension
       int indice1 =nombre.indexOf(".");
       int indice2 =nombre.length();
       String extencion= nombre.substring(indice1+1,indice2);
       if(!extencion.equals("txt"))
           throw new ExtensionNoValidaException();
    }
    
    public static void validarMayusculas(File file)throws MayusculasException
    {
    String nombre=file.getName();
    //como obtener la extension
    
    int indice1 =nombre.indexOf(".");
    
    String name= nombre.substring(0,indice1);
    String mayusculas=name.toUpperCase();
    if(name.equals(mayusculas))
        throw new MayusculasException();
    
    
   
    
}
}