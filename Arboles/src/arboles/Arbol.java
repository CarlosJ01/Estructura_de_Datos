package arboles;
public class Arbol {
    nodoArbol raiz;
    String nombre;
    boolean primero=true;
    
    Arbol (){
        nombre="Arbol";
        raiz=null;
    }
    Arbol (String nombre){
        this.nombre=nombre;
        raiz=null;
    }
    
    public void insertar (int dato){
        if (primero) {
            raiz = new nodoArbol(dato);
            primero=false;
        }
        else
            raiz.insertar(dato);
    }
    
    public void recorrerPreOrden(){
        preOrden (raiz);
    }
    
    public void recorrerInOrden(){
        inOrden (raiz);
    }
    
    public void recorrerPostOrden(){
        postOrden(raiz);
    }
    
    private void preOrden (nodoArbol nodo){
        if (nodo!=null){
            System.out.print(nodo.dato+", ");
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }
    
    private void inOrden(nodoArbol nodo){
        if (nodo!=null) {
            inOrden (nodo.izquierdo);
            System.out.print(nodo.dato+", ");
            inOrden (nodo.derecho);
        }
    }
    
    private void postOrden(nodoArbol nodo){
        if (nodo!=null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.dato+", ");
        }
    }
}