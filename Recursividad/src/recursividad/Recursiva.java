/**
 *
 * @author fmorales
 */
package recursividad;

public class Recursiva {
    //Calcula el factorial de un entero n
    public int factorial(int n){
        if(n==0)
            return 1; //Caso Base
        return n * factorial(n-1);  //Fórmula Recursiva
    }

    //Calcula el elemento n de la serie de Fibonaci 
    public int fibonaci(int n){
        if(n==1 || n==2)
            return 1;
        return fibonaci(n-1)+fibonaci(n-2);
    }
    //Calcula la división entera de a entre b por restas sucesivas
    public int division(int a, int b) {
        if(b > a)
            return 0;
        return division(a-b, b) + 1;
    }
    //Invierte los digitos de un número n, 123 a 321 
    // NO funciona
    public int invertir (int n,int m) {
        if (n < 10)  //caso base
            return n;
        else  
            return invertir (n / 10,m-1)+(n%10*(int)(Math.pow(10,m)));
    }
    //Suma los digitos de un numero n, 123 = 6
    public int sumarDigitos (int n) {
        if (n <= 9)     //caso base
            return n;
        return sumarDigitos(n / 10) + (n % 10);
    }
  
    //calculo de la potencia n de un entero x
    public long potencia (long x, int n) {
        long aux;
        if (n==0)
            return 1;
        aux = potencia(x, n/2);
        if (n%2 == 0) 
            return aux * aux;
        else
            return x * aux * aux;
    }
}