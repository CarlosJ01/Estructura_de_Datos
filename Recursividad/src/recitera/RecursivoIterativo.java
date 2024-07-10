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
public class RecursivoIterativo {
    
    // factorial de un número
    public int factorialR(int n){
        if(n==0)
            return 1; //Caso Base
        return n * factorialR(n-1);  //Fórmula Recursiva
    }

    public int factorialI(int n){
        int fact =1;
        
        for (int i=2; i<=n; i++)    //Fórmula Iterativa
            fact *= i;
        return fact;  
    }
    
    public int factorial(int n){
        return (n==0)? 1: n * factorialR(n-1);  //Fórmula Recursiva
    }


    //Calcula el elemento n de la serie de Fibonacci 
    public int fibonacciR(int n){
        if(n==1 || n==2)
            return 1;
        return fibonacciR(n-1)+fibonacciR(n-2);
    }
    
     //Calcula el elemento n de la serie de Fibonacci 
    public int fibonacciI(int n){
        int nMenos1=0;
        int nMenos2=1;
        int fibo=0;
        
        if(n==1 || n==2)
            return 1;
        for(int i=2; i<=n; i++){
            fibo= nMenos1 + nMenos2;
            nMenos1 = nMenos2;
            nMenos2 = fibo;
        }
        return fibo;
    }

    
    // Máximo común denominador de (x, y) con el algoritmo de Euclides
    public int gcdR(int x, int y){ 
        return (y>0) ? gcdR(y, x % y) : x;
    }
    
    // Máximo común denominador de (x, y) con el algoritmo de Euclides
    // Iterativo;
    public int gcdI (int x, int y){
	int r;
	if (x<0) x = -x;
	if (y<0) y = -y;
	while (y>0) {
            r = x % y; 
            x = y; 
            y = r;
        }  
        return  x;
    }
    
    
    //cálculo de la potencia n de un entero x
    public double potenciaR (double x, int n) 
    {
        double aux;
        if (n==0)
            return 1;
        aux = potenciaR(x, n/2);
        if (n%2 == 0) 
            return aux * aux;
        else
            return x * aux * aux;
    }
  
    //cálculo de la potencia n de un entero x
    public double potenciaI(double x, int n) 
    {
        boolean negExp = n <0;
        double aux;
        if (n==0)
            return 1;
        if (negExp) n = -n;
        while ( n%2 == 0){
            x*= x;
            n = n /2;
        }
        aux = x;
        while (n/2 != 0){
            n = n/2;
            x*= x;
            if (n%2 != 0)
                aux *= x;
        }
        return negExp ? 1.0/aux : aux;
    }
}
