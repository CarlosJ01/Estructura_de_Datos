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
public class Circulo {
    double radio;
    double x1;
    double y1;
    
    Circulo(double nX1, double nY1, double nRadio){
        x1= nX1;
        y1= nY1;
        radio= nRadio;
    }
    
    @Override
    public String toString(){
        return "Circulo: centro(" + x1 +","+y1+") radio: "+radio+ "\n" ;
    }
}
