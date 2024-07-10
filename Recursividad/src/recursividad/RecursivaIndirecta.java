/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fmorales
 */
package recursividad;

public class RecursivaIndirecta {
    
    //Determina si un número n es impar   
    public boolean par(int n){
        if(n==0)
            return true;
        return impar(n-1);
    } 
    //Determina si un número n es impar  
    public boolean impar(int n){
        if(n==0)
            return false;
        return par(n-1);
    }
  
    // suma los elementos de un vector (no es recursiva indirecta)
    public int sumaVector(int v []) {
        return sumaVector1(v, v.length - 1);
    }
    // el método anterior disfraza el llamado "complejo"
    public int sumaVector1(int v [], int n) {
        if (n == 0)
            return v[0];
        return sumaVector1(v, n - 1) + v [n];
    }
}
