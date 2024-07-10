/**
 * @author fmorales
 */
package simulacionbanco;

import java.util.Random;

public class Cliente {
    int operaciones[];  //Operaciones a realizar en el banco
    int tiempoLlegada;  //Tiempo del reloj al momento de llegada
    int ingreso;        //Tiempo de llegada en el orden de la simulación
    
    Cliente(){
        Random genAleatorio = new Random();
        int OperacionesRealiza = genAleatorio.nextInt(3)+1;
        
        operaciones = new int[OperacionesRealiza];
        for (int i=0; i<OperacionesRealiza; i++)
           operaciones[i]= genAleatorio.nextInt(3); //operación 0,1 o 2
    }
   
    public void tomaTurno(int tiempo){
        tiempoLlegada= tiempo;
    }
    
    public int entregaTurno(){
        return tiempoLlegada;
    }
    
    public void registroIngreso(int tiempo){
        ingreso = tiempo;
    }
    
    public int ordenIngreso(){
        return ingreso;
    }
    
    public int[] entregaOperaciones(){
        return operaciones;
    }
}
