package EstructuraLineal;
public class Nodo {
    Object dato;
    Nodo siguiente;
    //Constructores
    public Nodo (Object dato){//Solo un dato
        this(dato,null);
    }
    public Nodo (Object dato,Nodo siguiente){//Dato y el siguiente
        this.dato=dato;
        this.siguiente=siguiente;
    }
    //Obtener el dato
    public Object obtenerDato(){
        return dato;
    }
    //Obtener el siguiente
    public Nodo Siguiente(){
        return siguiente;
    }
}