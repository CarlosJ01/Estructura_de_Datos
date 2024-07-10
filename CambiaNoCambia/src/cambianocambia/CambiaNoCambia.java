package cambianocambia;
public class CambiaNoCambia {
    public static void main(String[] args) {
        ClaseUno uno;
        ClaseDos dos;
        
        uno = new ClaseUno();
        dos = new ClaseDos();
        int x= 10;
        int y[] = {7,5,3};
        
        uno.actualiza(7, 3, 5);
        
        // se envia por valor la variable x
        dos.cambiaNoCambia(x);
        System.out.printf("\nEl valor de x: %d", x);
        
        // se envia por valor la dirección del arreglo y el contenido 
        // del arreglo es accesible a través de esa dirección
        dos.cambiaNoCambia(y); 
        System.out.printf("\nDatos en el arreglo: \n");
        for( int aux: y)
            System.out.printf("%d  ", aux);
        System.out.println();
        
        // Se envía por valor el contenido del arreglo en la posición 0 y el
        // contenido de la posiciòn 1       
        dos.cambiaNoCambia(y[0], y[1]); 
        System.out.printf("\nDatos en el arreglo: \n");
        for( int aux: y)
            System.out.printf("%d  ", aux);
        System.out.println();
        
        // se envia por valor la direcciòn del objeto uno, el contenido del
        // objeto es accesible a través de esa dirección
        dos.cambiaNoCambia(uno);
        uno.muestra();
        
        // se contruten tres objetos de la clase uno, pero sólo se conserva 
        // uno (el tercero)
        ClaseUno recibeObjeto;
        recibeObjeto= dos.cambiaNoCambia();
        
        // se construyen tres objetos de la clase uno y todos se conservan
        // ya que se guardan sus direcciones en un arreglo
        ClaseUno[] recibeArreglo;
        recibeArreglo= dos.cambiaNoCambia2();
        
        System.out.printf("\nDatos en el arreglo: \n");
        for( ClaseUno aux: recibeArreglo)
            aux.muestra();
        
        // se envia por valor la direcciòn del arreglo que recibeArreglo durante
        // el proceso se altera su contenido y al final la variable recibeArreglo2
        // y recibeArreglo hacen referencia a la misma información.
        ClaseUno[] recibeArreglo2;
        recibeArreglo2= dos.cambiaNoCambia3(recibeArreglo);
        
        System.out.printf("\nDatos en recibeArreglo: \n");
        for( ClaseUno aux: recibeArreglo)
            aux.muestra();
        System.out.printf("\nDatos en recibeArreglo2: \n");
        for( ClaseUno aux: recibeArreglo2)
            aux.muestra();
        
        //Copiar el arreglo recibeArreglo2 
        ClaseUno[] copiaArreglo;
        copiaArreglo=dos.copiaArreglo(recibeArreglo2);
        System.out.printf("\nDatos en copiaArreglo: \n");
        for( ClaseUno aux: recibeArreglo2)
            aux.muestra();
        
        System.out.println();
    }
    
}
