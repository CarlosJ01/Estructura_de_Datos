/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaobjetos;
import graficos.*;
/**
 *
 * @author Estructura de Datos
 */
public class ListaMemoriaEstatica {
public static void main( String args[] )
   { 
      List list = new List(); // create the List container
      
      ClaseSimple obj1= new ClaseSimple(5,20);
      ClaseSimple obj2 = new ClaseSimple(34,56);
      
      Linea linea1 = new Linea(10.4,5.5,89.3,112.5);
      Cuadro cuadro1 = new Cuadro(1,2,3,4);
      Circulo circulo1 = new Circulo(3.5,2.3,10.0);
      // insert integers in list
      list.insertAtFront( "prueba" );
      
      List listAG = new List();
      
      listAG.insertAtFront( linea1);
      listAG.insertAtFront( cuadro1 );
      listAG.insertAtFront( circulo1 );
      list.print();
      list.insertAtFront( obj1 );
      list.print();
      listAG.insertAtBack( new Linea(45,23,89,12));
      list.insertAtBack( 'B' );
      list.print();
      list.insertAtBack( 5 );
      listAG.insertAtBack( new Circulo(35,23,100.0) );
      list.print();
      list.insertAtBack( obj2 );
      list.print();
      listAG.insertAtBack( new Cuadro(8,9,10,11) );
      listAG.print();
      
      List listT1 = new List("listT1");
      List listT2 = new List("listT2");
      
      listT1.insertAtFront("Para embarcarse en la aventura\n");
      listT1.insertAtFront("otros soñar.\n");
      listT2.insertAtFront("primero\n");
      listT2.insertAtBack("debemos\n");
      listT1.insertAtBack("es necesario que la ambición\n");
      listT2.insertAtFront("fantástico,\n");
      listT2.insertAtFront("lo \n");
      listT1.insertAtBack("sea más fuerte que la razón,\n");
      listT2.insertAtBack("entender\n");
      listT1.insertAtFront("unos pueden pensar,\n");
      listT2.insertAtFront("crear\n");
      listT2.insertAtBack("lo \n");
      listT1.insertAtBack("que la confianza sea más grande\n");
      listT1.insertAtFront("un nuevo comienzo\n");
      listT2.insertAtFront("para\n");
      listT2.insertAtBack("real.\n");
      listT2.insertAtBack("Walt Disney\n");
      listT1.insertAtBack("que el miedo a lo desconocido.\n");
      listT1.insertAtFront("un cambio de vida\n");
      
      listT1.print();
      listT2.print();
        
      // remove objects from list; print after each removal
      try 
      { 
         Object removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();
      } // end try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class ListTest

