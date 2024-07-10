package invertir_numero;
import java.util.Scanner;
public class Invertir_Numero {
    static int cont=0;
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n,m;
        System.out.print("Dame un numero: ");
        n=leer.nextInt();
        m=multiplicador(n);
        System.out.println("=================================================");
        System.out.println("El numero invertido es: "+(int)invertirNumero(n,m));
        System.out.println("En : " +cont+ " llamados" );
    }
    
    public static double invertirNumero(int n,int m){
       cont++;
        if (n<10)
            return n;
        else
            return invertirNumero(n/10,m/10)+(n%10*m);
    }
    
    public static int multiplicador (int n){
        int m=1;
        while (true) {            
            if (n/10==0)
                return m;
            else{
                n/=10;
                m*=10;
            }
        }
    }
}
