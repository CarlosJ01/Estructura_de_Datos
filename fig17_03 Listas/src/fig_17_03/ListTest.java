/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig_17_03;

// Fig. 17.5: ListTest.java
// ListTest class to demonstrate List capabilities.
//import com.deitel.jhtp7.ch17.List;
//import com.deitel.jhtp7.ch17.EmptyListException;

public class ListTest 
{
   public static void main( String args[] )
   {
      List list = new List(); // create the List container

      // insert integers in list
      list.insertAtFront( "prueba" );
      list.print();
      list.insertAtFront( -1 );
      list.print();
      list.insertAtBack( 'B' );
      list.print();
      list.insertAtBack( 5 );
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


/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

