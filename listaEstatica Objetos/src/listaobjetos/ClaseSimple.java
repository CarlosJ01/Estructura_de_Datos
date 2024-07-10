package listaobjetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estructura de Datos
 */
public class ClaseSimple{
    int a;
    int b;
    
    ClaseSimple(int x, int y){
        a=x;
        b=y;
    }
    public String toString(){
      return String.format("ClaseSimple(%2d,%2d)",a,b);
    }    
}
