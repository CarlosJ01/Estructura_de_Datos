package EstructuraLineal;
public class EstaVacia extends Exception {
    public EstaVacia(String nombre) {
        super( nombre + " esta Vacia" );
    }
}
