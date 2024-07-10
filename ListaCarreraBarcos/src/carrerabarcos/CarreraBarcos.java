/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerabarcos;

import java.util.Random;

/**
 *
 * @author EstrucDatos
 */
public class CarreraBarcos {

    public static void main(String[] args) {
        int totBarcos = 20;
        Random nAleatorio = new Random();
        
        List listJuego = new List("Barcos");
        
        for (int i=0;i<totBarcos; i++)
            listJuego.insertAtBack(new Barco());
        
        ListNode current;
        for (int dados=0; dados<10; dados++){
            System.out.print("\n\n\n\n");
            current = listJuego.firstNode();
            while (current!= null){
                Object temp = current.getObject();
                ((Barco)temp).avanza(1+nAleatorio.nextInt(12));
                ((Barco)temp).pintate();
                current=current.getNext();
            }
        }
    }
}
