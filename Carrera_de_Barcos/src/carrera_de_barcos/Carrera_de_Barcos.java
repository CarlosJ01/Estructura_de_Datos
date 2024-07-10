package carrera_de_barcos;
import java.util.Random;
public class Carrera_de_Barcos {
    public static void main(String[] args) {
    int totBarcos = 20;
        Random nAleatorio = new Random();
        Lista listJuego = new Lista("Barcos");
        for (int i=0;i<totBarcos; i++)
            listJuego.insertarALFrente(new Barco());
        Nodo current;
        for (int dados=0; dados<10; dados++){
            System.out.print("\n\n\n\n");
            current = listJuego.primero();
            while (current!= null){
                Object temp = current.obtenerDato();
                ((Barco)temp).avanza(1+nAleatorio.nextInt(12));
                ((Barco)temp).pintate();
                current=current.Siguiente();
            }
        }
    }
}