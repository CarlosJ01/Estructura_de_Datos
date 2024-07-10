/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaobjetos;

/**
 *
 * @author Estructura de Datos
 */
public class ListaObjetos {
public static void main( String args[] )
   {
      List list = new List(); // create the List container
      ClaseSimple obj1= new ClaseSimple(5,20);
      ClaseSimple obj2 = new ClaseSimple(34,56);
      // insert integers in list
      list.insertAtFront( "prueba" );
      
      list.print();
      list.insertAtFront( obj1 );
      list.print();
      list.insertAtBack( 'B' );
      list.print();
      list.insertAtBack( 5 );
      list.print();
      list.insertAtBack( obj2 );
      list.print();

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

