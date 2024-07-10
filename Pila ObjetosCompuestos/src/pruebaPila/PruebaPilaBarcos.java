/*-------------------------------------------------------------
   Programa para probar el funcionamiento de la estructura pila
--------------------------------------------------------------*/
package pruebaPila;

public class PruebaPilaBarcos 
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
        String otra = "[{{ { } ( )}[]} []{}])";
        

        ParenthesisCheker analizador = new ParenthesisCheker();
      
        System.out.println(analizador.checkBalanced(test_good));
        System.out.println(analizador.checkBalanced(test_bad));
        System.out.println(analizador.checkBalanced(otra)+"\n");
        
        StackComposition pila2 = new StackComposition();
        Barco barco1 = new Barco("Barco 1", 10);
        Barco barco2 = new Barco("Barco 2", 20);
        Barco barco3 = new Barco("Barco 3", 30);
        
        
        pila2.push(barco1);
        pila2.print();
        pila2.push(barco2);
        pila2.print();
        pila2.push(barco3);
        pila2.print();
        System.out.println("Inicia vaciado de la pila");
        pila2.pop();
        pila2.print();
        pila2.pop();
        pila2.print();
        pila2.pop();
        pila2.print();
        
   } // end main
} // end class StackInheritanceTest

