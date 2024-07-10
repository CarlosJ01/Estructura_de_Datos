/**
 * @author fmorales
 */
package simulacionbanco;

public class Reloj {
    private  int horaActual;
    
    Reloj(int tiempoInicio){
        horaActual = tiempoInicio;
    }
    
    public void inicializa(int tiempoInicio){
        horaActual = tiempoInicio;
    }
    
    public void avanza(){
        horaActual++;
    }
    
    public int tiempoActual(){
        return horaActual;
    }
}
