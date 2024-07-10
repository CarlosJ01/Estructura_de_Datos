package profundidad;
import java.util.Scanner;
public class Profundidad {
    static int cont=0,prof=0,llam=0;
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int n;
    System.out.print("Dame un numero para obtener el fibonacci: ");
    n=leer.nextInt();
    System.out.println("El fibonacci de : "+n+" es: "+fibonacci(n));
    System.out.println("La longitud mayor fue: "+prof);
    System.out.println("De : "+llam+" llamados");
     }
    
    public static int fibonacci(int n){
        cont++;
        llam++;
        if (n==1 || n==2){
            if (cont>prof)
                prof=cont;
            cont--;
            return 1;
        }
        else{
            int aux=fibonacci(n-1)+fibonacci(n-2);
            cont--;
            return aux;
    }
        
        
        
    }
     
}