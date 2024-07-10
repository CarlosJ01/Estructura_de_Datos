package cambianocambia;

public class ClaseUno {

    public int a;
    public int b;
    public int c;

    public void actualiza(int dato1, int dato2, int dato3) {
        a= dato1;
        b= dato2;
        c= dato3;
    }

    public void muestra() {
        System.out.printf("\na=%d, b=%d, c=%d\n", a,b,c);
    }
}
