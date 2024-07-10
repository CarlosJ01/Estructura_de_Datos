/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPolinomios;
/**
 *
 * @author fmorales
 */
public class PruebaSumaPolinomios {
public static void main( String args[] )
   {
      PolinomialList pUno  = new PolinomialList("Uno");
      PolinomialList pDos  = new PolinomialList("Dos");
      PolinomialList pTres = new PolinomialList("Tres");
      
      System.out.println("\nDatos del Polinomio uno");
      pUno.readTerms();
      System.out.println("\nDatos del Polinomio dos");
      pDos.readTerms();
      
      pTres.sum(pUno, pDos);
      
      System.out.println("\nDatos de los Polinomios uno, dos y tres");
      pUno.print();
      pDos.print();
      pTres.print();
   } // end main
} // end class ListTest

