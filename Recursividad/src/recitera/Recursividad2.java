/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recitera;

/**
 *
 * @author fmorales
 */
public class Recursividad2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       RecursivoIterativo rec = new RecursivoIterativo();
       int apoyo;
       int dato1;
       int dato2;
       
       dato1=5;
       apoyo= rec.factorialR(dato1);
       System.out.printf("\nEl factorial de %d es %d \n", dato1, apoyo);
       
       apoyo= rec.factorialI(dato1);
       System.out.printf("El factorial de %d es %d \n", dato1, apoyo);
       
       apoyo= rec.factorial(dato1);
       System.out.printf("El factorial de %d es %d \n", dato1, apoyo);
          
       dato1=2;
       double apoyo2;
       int exponente = 64;
       apoyo2= rec.potenciaR(dato1, exponente);
       System.out.printf("\n%d elevado a la %d potencia es %f\n", dato1, exponente, apoyo2);
       
       apoyo2= rec.potenciaI(dato1, exponente);
       System.out.printf("%d elevado a la %d potencia es %f\n", dato1, exponente, apoyo2);
       
       dato1= 1900;
       dato2= 700;
       apoyo= rec.gcdR(dato1, dato2);
       System.out.printf("\nEl GCD de %d y %d es %d \n", dato1, dato2, apoyo);
       
       apoyo= rec.gcdI(dato1, dato2);
       System.out.printf("El GCD de %d y %d es %d \n", dato1, dato2, apoyo);
       
       dato1=8;
       apoyo= rec.fibonacciR(dato1);
       System.out.printf("\nEl elemento %d de la serie de Fibonaci es %d\n", dato1, apoyo);
       dato1=8;
       apoyo= rec.fibonacciI(dato1);
       System.out.printf("El elemento %d de la serie de Fibonaci es %d\n", dato1, apoyo);
    }
    
}
