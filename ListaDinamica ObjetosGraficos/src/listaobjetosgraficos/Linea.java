/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaobjetosgraficos;

/**
 *
 * @author Estructura de Datos
 */
public class Linea {
    double x1;
    double y1;
    double x2;
    double y2;
    
    Linea(double nX1, double nY1, double nX2, double nY2){
        x1= nX1;
        y1= nY1;
        x2= nX2;
        y2= nY2;
    }
    @Override
    public String toString(){
        return "Linea: P1(" + x1 +","+y1+") P2(" + x2 +","+y2+") \n" ;
    }
}
