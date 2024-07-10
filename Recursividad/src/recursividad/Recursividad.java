/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author fmorales
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Recursiva rec = new Recursiva();
       int apoyo;
       int dato;
       int divisor;
       
       dato=5;
       apoyo= rec.factorial(dato);
       System.out.printf("\nEl factorial de %d es %d \n", dato, apoyo);
       
       dato=8;
       apoyo= rec.fibonaci(dato);
       System.out.printf("El elemento %d de la serie de Fibonaci es %d\n", dato, apoyo);
       
       dato=123;
       apoyo= rec.invertir(dato,String.valueOf(dato).length()-1);
       System.out.printf("El número %d invertido es %d\n", dato, apoyo);
       
       dato=8789;
       apoyo= rec.sumarDigitos(dato);
       System.out.printf("La suma de los dígitos de %d es %d\n", dato, apoyo);
       
       dato=8789;
       divisor=23;
       apoyo= rec.division(dato,divisor);
       System.out.printf("La division de %d entre %d es %d\n", dato, divisor, apoyo);
         
       dato=2;
       int exponente = 63;
       long apoyo2= rec.potencia(dato, exponente);
       System.out.printf("%d elevado a la %d potencia es %d\n", dato, exponente, apoyo2);
       
       
       RecursivaIndirecta rec2 = new RecursivaIndirecta();
       
       dato=9;
       if (rec2.impar(dato))
          System.out.printf("El número %d es impar\n", dato);
       else
          System.out.printf("El número %d es par\n", dato);
       
       int vector[]={8,7,8,9};
       apoyo= rec2.sumaVector(vector);
       System.out.printf("La suma del vector es %d\n", apoyo);
 
    }
    
}
