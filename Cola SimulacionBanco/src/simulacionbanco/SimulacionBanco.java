/*
 * @author Estructura de Datos
 */
package simulacionbanco;

import java.util.Random;
// import static simulacionbanco.SimulacionBanco.realizaSimulacion;

public class SimulacionBanco {
        static final int MAXCLIENTES = 500;
        static final int MAXCAJEROS = 4;
        static final int CLIENTESSIMULTANEOS = 5;
        static final int TIEMPOENTRECLIENTESMAXIMO=40;

    public static void main(String[] args) {
        Cajero cajeros[] = new Cajero[MAXCAJEROS];
        Reloj relojBanco = new Reloj(0);
        double promedio;
        
        Cajero.asignaReloj(relojBanco);
        cajeros[0] = new Cajero(1,2,3);
        cajeros[1] = new Cajero(2,2,4);
        cajeros[2] = new Cajero(2,2,4);
        cajeros[3] = new Cajero(3,3,5);
        
        //genera MAXCLIENTES clientes con incremento de llegada
        Random gAleatorio1 = new Random();
        Random gAleatorio2 = new Random();
        Cliente aClientes[] = new Cliente[MAXCLIENTES];
        
        // Dado que se desea usar el mismpo conjunto de cliente en ambas 
        // simulaciones se generan primero los clientes
        int llegaron=0;
        int tiempoLlegada =0;
        for (int j = 0; j < aClientes.length; j++){
            if (llegaron==0){
                llegaron = 1+gAleatorio1.nextInt(CLIENTESSIMULTANEOS);
                tiempoLlegada += 1+gAleatorio2.nextInt(TIEMPOENTRECLIENTESMAXIMO);
            }
            aClientes[j] = new Cliente();
            aClientes[j].registroIngreso(tiempoLlegada);
            llegaron--;
        }
        
        // Crea una cola para cada fila y se la asigna a un cajero
        Queue filas[] = new Queue[MAXCAJEROS];
        for (int i =0; i< cajeros.length; i++)
            cajeros[i].asignaFila(filas[i] = new Queue());
        
        relojBanco.inicializa(0);
        promedio = realizaSimulacion(aClientes, cajeros, filas);
        System.out.printf("\n Tiempo de atención Promedio: %f", promedio);
        
        Queue fila[] = new Queue[1];
        Queue filaUnica = new Queue();
        
        fila[0] = filaUnica;
        for (Cajero cajero : cajeros)
            cajero.asignaFila(filaUnica);
        relojBanco.inicializa(0);
        promedio = realizaSimulacion(aClientes, cajeros, fila);
        System.out.printf("\n Tiempo de atención Promedio: %f", promedio);
        System.out.println();
    }
    
    static double realizaSimulacion(Cliente aClientes[], Cajero cajeros[], Queue filas[]){
        Random gAleatorio = new Random();
        Cajero.iniciaContadores();
        Reloj relojBanco = Cajero.relojActual();
        
        int tiempoAcceso=0;
        int nextCliente =0;
        while(Cajero.clientesAtendidos()<MAXCLIENTES ){// o filas con clientes
            relojBanco.avanza();
            //Cajeros atienden filas
            for (Cajero cajero : cajeros) {
                if (cajero.atendiendo()) {
                    cajero.atiendeCliente();
                } else {
                    cajero.siguienteCliente();
                }
            }
            // Llegada de clientes
            while(nextCliente<MAXCLIENTES && aClientes[nextCliente].ordenIngreso() == tiempoAcceso){
                aClientes[nextCliente].tomaTurno(relojBanco.tiempoActual());
                //fila=gAleatorio2.nextInt(MAXCAJEROS);
                if (filas.length >1)
                   filas[gAleatorio.nextInt(MAXCAJEROS)].enqueue(aClientes[nextCliente]);
                else
                   filas[0].enqueue(aClientes[nextCliente]);
                nextCliente++;
            }
            tiempoAcceso++;
        }
        return Cajero.promedioActual();
    }
}
