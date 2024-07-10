/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaobjetosgraficos;

/**
 *
 * @author Estructura de Datos
 */
public class ListaObjetosGraficos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Linea linea1 = new Linea(10.4,5.5,89.3,112.5);
        Cuadro cuadro1 = new Cuadro(1,2,3,4);
        Circulo circulo1 = new Circulo(3.5,2.3,10.0);
        
        List listAG = new List(); // create the List container

      // insert integers in list
        listAG.insertAtFront( linea1);
        listAG.insertAtFront( cuadro1 );
        listAG.print();
        listAG.insertAtFront( circulo1 );
        listAG.print();
        
        //linea1 = new Linea(45,23,89,12);
        //cuadro1 = new Cuadro(8,9,10,11);
        //circulo1 = new Circulo(35,23,100.0);
        
        listAG.insertAtBack( new Linea(45,23,89,12));
        listAG.insertAtBack( new Circulo(35,23,100.0) );
        listAG.insertAtBack( new Cuadro(8,9,10,11) );
        listAG.print();
    }
    
}
