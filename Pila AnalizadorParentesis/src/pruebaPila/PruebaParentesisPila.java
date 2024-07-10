
package pruebaPila;

// Fig. 17.11: StackInheritanceTest.java
// Class StackInheritanceTest.
//import com.deitel.jhtp7.ch17.StackInheritance;
//import com.deitel.jhtp7.ch17.EmptyListException;

public class PruebaParentesisPila 
{
   public static void main( String args[] )
   {
       
        StackComposition stack = new StackComposition();  

        // use push method
        stack.push( -1 );
        stack.print();
        stack.push( 0 );
        stack.print();
        stack.push( 1 );
        stack.print();
        stack.push( 5 );
        stack.print();
/*
        // remove items from stack
        try {
            Object removedObject = null;

            while ( true ) {
                removedObject = stack.pop(); // use pop method
                System.out.printf( "%s popped\n", removedObject );
                stack.print();
            } // end while
        } // end try
        catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        } // end catch
    */
        String test_good = "()(){}{}{()}";
        String test_bad = "((({}{}))()";
        String otra = "[{{ { } ( )}[]} []{}]";
        

        ParenthesisCheker analizador = new ParenthesisCheker();
      
        System.out.println(analizador.checkBalanced(test_good));
        System.out.println(analizador.checkBalanced(test_bad));
        System.out.println(analizador.checkBalanced(otra));
   } // end main
} // end class StackInheritanceTest


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
