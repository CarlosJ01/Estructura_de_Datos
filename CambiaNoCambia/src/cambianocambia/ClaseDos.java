package cambianocambia;

public class ClaseDos {

    private int c;
    private int z;

    public void cambiaNoCambia(int a) {
        a+=50;
    }

    public void cambiaNoCambia(int a, int b) {
        int temp;
        
        temp = a;
        a = b;
        b = temp;
    }
    

    public void cambiaNoCambia(int[] arreglo) {
        int temp;
        if (arreglo[0]>arreglo[1]){
            temp= arreglo[0];
            arreglo[0]= arreglo[1];
            arreglo[1]= temp;
        }
        if(arreglo[1]>arreglo[2]){
            temp= arreglo[2];
            arreglo[2] = arreglo[1];
            arreglo[1]= temp;
        }
         if (arreglo[0]>arreglo[1]){
            temp= arreglo[0];
            arreglo[0]= arreglo[1];
            arreglo[1]= temp;
        }
    }
    
    public void cambiaNoCambia(ClaseUno objUno) {
        int temp;
        if (objUno.a>objUno.b){
            temp= objUno.a;
            objUno.a= objUno.b;
            objUno.b= temp;
        }
        if(objUno.b>objUno.c){
            temp= objUno.c;
            objUno.c = objUno.b;
            objUno.b= temp;
        }
         if (objUno.a>objUno.b){
            temp= objUno.a;
            objUno.a= objUno.b;
            objUno.b= temp;
        }
    }
    
     public ClaseUno cambiaNoCambia() {
        ClaseUno uno;
        ClaseUno dos;
        ClaseUno tres;
        
        uno = new ClaseUno();
        dos = new ClaseUno();
        tres= new ClaseUno();
        
        uno.actualiza(7,8,9);
        dos.actualiza(1, 2, 3);
        tres.actualiza(10, 11, 12);
        
        return tres;
    }
     
    public ClaseUno[] cambiaNoCambia2() {
        ClaseUno uno;
        ClaseUno dos;
        ClaseUno tres;
        
        uno = new ClaseUno();
        dos = new ClaseUno();
        tres= new ClaseUno();
        
        uno.actualiza(7,8,9);
        dos.actualiza(1, 2, 3);
        tres.actualiza(10, 11, 12);
        
        ClaseUno arreglo[] = new ClaseUno[3];
        arreglo[0]= uno;
        arreglo[1]= dos;
        arreglo[2]= tres;
        return arreglo;
    }
    
    public ClaseUno[] cambiaNoCambia3(ClaseUno otroArreglo[]) {
        ClaseUno uno;
        ClaseUno dos;
        ClaseUno tres;
        
        uno = new ClaseUno();
        dos = new ClaseUno();
        tres= new ClaseUno();
        
        uno.actualiza(107,108,109);
        dos.actualiza(101, 102, 103);
        tres.actualiza(110, 111, 112);
        
        otroArreglo[0]= uno;
        otroArreglo[1]= dos;
        otroArreglo[2]= tres;
        return otroArreglo;
    }
    
    public ClaseUno[] copiaArreglo(ClaseUno [] ori){
        ClaseUno[] cop=new ClaseUno[ori.length];
        for (int i=0;i<ori.length;i++) {
            cop[i]=new ClaseUno();
            cop[i].actualiza(ori[i].a,ori[i].b,ori[i].c);
        }
        return cop;
    }
}
