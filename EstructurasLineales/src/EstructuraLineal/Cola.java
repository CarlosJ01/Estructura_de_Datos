package EstructuraLineal;
public class Cola {
    private final Lista cola;
    //Constructor
    public Cola () {
        cola=new Lista("Cola");
    }
    //enQueue => Insertar al Final;
    public void enQueue (Object nuevo){
       cola.insertarAlFinal(nuevo);
    }
    //deQueue => Remover al Frente;
    public Object deQueue (Object nuevo){
        Object removido=null;
        try {
            cola.removerAlFrente();
        } catch (EstaVacia error) {
            System.out.println("NO EXISTEN MAS ELEMENTOS EN LA COLA");
        }
        return removido;
    }
    //Esta Vacia
    public boolean estaVacia(){
        return cola.estaVacio();
    }
    //Imprimir 
    public void imprimir(){
        cola.imprimir();
    }
}
