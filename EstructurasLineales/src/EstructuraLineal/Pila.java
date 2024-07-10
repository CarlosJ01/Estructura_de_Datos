package EstructuraLineal;
public class Pila {
    private final Lista pila;
    //Constructor
    public Pila () {
        pila=new Lista("Pila");
    }
    //push => Insertar al Frente
    public void push (Object nuevo){
        pila.insertarALFrente(nuevo);
    }
    //pop => Remover del Frente
    public Object pop(){
        Object removido=null;
        try {
            removido=pila.removerAlFrente();
        } catch (EstaVacia error) {
            System.out.println("NO EXISTEN MAS ELEMENTOS EN LA PILA");
        }
        return removido;
    }
    //Esta vacia
    public boolean estaVacia(){
        return pila.estaVacio();
    }
    //Imprimir 
    public void imprimir(){
        pila.imprimir();
    }
}
