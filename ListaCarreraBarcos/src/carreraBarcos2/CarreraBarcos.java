package carreraBarcos2;
import java.util.Random;
import carrerabarcos.Barco;

public class CarreraBarcos {

    public static void main(String[] args) {
        Random nAleatorio = new Random();
        Barco nBarco01 = new Barco();
        Barco nBarco02 = new Barco();
        Barco nBarco03 = new Barco();
        Barco nBarco04 = new Barco();
        Barco nBarco05 = new Barco();
        Barco nBarco06 = new Barco();
        Barco nBarco07 = new Barco();
        Barco nBarco08 = new Barco();
        
        for (int dados=0; dados<10; dados++){
            nBarco01.avanza(1+nAleatorio.nextInt(12));
            nBarco01.pintate();
            nBarco02.avanza(1+nAleatorio.nextInt(12));
            nBarco02.pintate();
            nBarco03.avanza(1+nAleatorio.nextInt(12));
            nBarco03.pintate();
            nBarco04.avanza(1+nAleatorio.nextInt(12));
            nBarco04.pintate();
            nBarco05.avanza(1+nAleatorio.nextInt(12));
            nBarco05.pintate();
            nBarco06.avanza(1+nAleatorio.nextInt(12));
            nBarco06.pintate();
            nBarco07.avanza(1+nAleatorio.nextInt(12));
            nBarco07.pintate();
            nBarco08.avanza(1+nAleatorio.nextInt(12));
            nBarco08.pintate();
            System.out.print("\n\n\n\n");           
        }
    }
}
