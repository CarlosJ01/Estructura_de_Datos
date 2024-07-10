package arboles;
import java.util.Scanner;
public class Arboles {
    public static void main(String[] args) {
        Arbol arbol=new Arbol ("Arbol 1");
        Scanner leer = new Scanner (System.in);
        int opc,dato;
        boolean salir=true;
        do {
            System.out.println("===============================================");
            System.out.println("1) Insertar");
            System.out.println("2) PreOrden");
            System.out.println("3) InOrden");
            System.out.println("4) PostOrden");
            System.out.println("5) Salir");
            System.out.print("Opcion: ");
            opc=leer.nextInt();
            System.out.println("________________________________________________");
            switch (opc) {
                case 1:
                    System.out.print("Dato a insertar: ");
                    dato=leer.nextInt();
                    arbol.insertar(dato);
                    break;
                case 2:
                    System.out.println("Datos: ");
                    arbol.recorrerPreOrden();
                    break;
                case 3:
                    System.out.println("Datos: ");
                    arbol.recorrerInOrden();
                    break;
                case 4:
                    System.out.println("Datos: ");
                    arbol.recorrerPostOrden();
                    break;
                default:
                    salir=false;
            }
            System.out.println("");
        } while (salir);
    }
}