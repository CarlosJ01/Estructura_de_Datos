package contar_recursividad;
import java.util.Scanner;
public class Contar_Recursividad { 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[] cont=new int[1];
        cont[0]=0;
        int n;
        String word;
        System.out.print("Dame un numero para obtener el factorial y fibonacci: ");
        n=leer.nextInt();
        System.out.print("Dame una palabra: ");
        leer.nextLine();
        word=leer.nextLine();
        System.out.println("==========================================================================================");
        System.out.println("El factorial de : "+n+" es: "+factorial(n,cont)+ "\ny se volvio llamar : "+cont[0]+" veces.\n");
        cont[0]=0;
        System.out.println("El fibonacci de : "+n+" es: "+fibonacci(n,cont)+ "\ny se volvio llamar : "+cont[0]+" veces.\n");
        cont[0]=0;
        System.out.println("La palabra: "+word+" Invertida es: "+invertirCadena(word,cont)+ "\ny se volvio llamar : "+cont[0]+" veces.\n");
    }
    
    public static double factorial(int n,int[] cont){
        cont[0]++;
        if (n<=1)
            return 1;
        else
            return factorial(n-1,cont)*n;
    }
    
    public static int fibonacci(int n,int[] cont){
        cont[0]++;
        if (n<=1)
            return 1;
        else
            return fibonacci(n-1,cont)+fibonacci(n-2,cont);
    }
    
    public static String invertirCadena(String word,int[] cont){
        cont[0]++;
        if (word.equalsIgnoreCase(""))
            return word;
        else {
            String subProblem=word.substring(1,word.length());
            String subSolucion=invertirCadena(subProblem,cont);
            String solucion=subSolucion+word.charAt(0);
            return solucion;
        }
    }
}
