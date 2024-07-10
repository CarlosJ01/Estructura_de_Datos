/**
 * @author fmorales
 */
package simulacionbanco;

public class Cajero {
    int habilidad[];     //tiempo que tarda en cada operación
    int tiempoRestante;  //tiempo restante para terminar de atender al cliente actual
    Queue filaAtencion;  
    int tiempoTurnoCliente;    //tiempo de llegada del cliente actual al banco
    
    static int sumaTiempoAtencion=0; //Acumulador de todos los tiempos de espera
    static int cuentaClientes=0;     //Suma clientes atendidos
    static Reloj reloj;              //Reloj del banco  
    
    Cajero(){
        
    }
    Cajero(int hab1, int hab2, int hab3){
        habilidad = new int[3];
        
        habilidad[0] = hab1;
        habilidad[1] = hab2;
        habilidad[2] = hab3;
    }
    
    public static void asignaReloj(Reloj relojControl){
        reloj = relojControl;
    } 
    
    public static void iniciaContadores(){
        sumaTiempoAtencion=0;
        cuentaClientes=0;
    }
    
    public static int clientesAtendidos(){
        return cuentaClientes;
    }
    
    public static Reloj relojActual(){
        return reloj;
    }
    
    public static double promedioActual(){
        return (double)sumaTiempoAtencion/cuentaClientes;
    }
    
    public void asignaFila(Queue filaAtencion){
        this.filaAtencion = filaAtencion;
    }
    
    public boolean atendiendo(){
        return (tiempoRestante!=0);
    }
    
    public void atiendeCliente(){
        //tiempoRestante--;
	if (--tiempoRestante == 0){
            // Calcular tiempo de atención (tiempo reloj – tiempo turno)
            int tiempoAtencion = reloj.tiempoActual()-tiempoTurnoCliente;
            //Registrar tiempo de atención y cliente atendido
	    sumaTiempoAtencion+= tiempoAtencion;
            cuentaClientes++;
        }     
    }
    public void siguienteCliente(){
        if (this.filaAtencion.isEmpty())
            return;
        
        Cliente siguienteCliente;
        int operaciones[];
        //Atiende al siguiente cliente en la fila que atiende
        siguienteCliente = (Cliente) filaAtencion.dequeue();
        tiempoTurnoCliente=siguienteCliente.entregaTurno();
        operaciones = siguienteCliente.entregaOperaciones();
        
        tiempoRestante = 0;
        for (int i=0; i <operaciones.length; i++)
            tiempoRestante += habilidad[operaciones[i]];
    }
}
