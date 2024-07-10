/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerabarcos;

/**
 *
 * @author EstrucDatos
 */
public class Barco {
    int posicion;
    
    public Barco(){
        posicion=0;
    }     
    public void avanza(int avance){
       posicion += avance;
    }
    public void pintate(){
        String texto ="";
        
        for (int i=0; i<posicion; i++)
            texto += " ";
        
        System.out.print(texto+"   )|)\n");
        System.out.print(texto+"+]\\____/\n");
    }
    
    public String toString(){
        String texto ="";
        
        for (int i=0; i<posicion; i++)
            texto += " ";
        return (texto+"   )|)\n" +
                texto+"+]\\____/\n");
    }
}
