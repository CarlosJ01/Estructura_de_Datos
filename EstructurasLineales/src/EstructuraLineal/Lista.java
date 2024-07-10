package EstructuraLineal;
public class Lista {
    private Nodo primero;
    private Nodo ultimo;
    private String nombre;
    //Constructores
    public Lista (){
        this ("Lista");
    }
    public Lista (String nombre){
        this.nombre=nombre;
        this.primero=this.ultimo=null;
    }
    //Insertar al Frente
    public void insertarALFrente(Object nuevo){
        if (this.estaVacio())
            primero=ultimo=new Nodo(nuevo); 
        else
            primero=new Nodo(nuevo,primero);
    }
    //Insertar al Final
    public void insertarAlFinal(Object nuevo){
        if (this.estaVacio())
            primero=ultimo=new Nodo(nuevo); 
        else
            ultimo=ultimo.siguiente=new Nodo(nuevo);
    }
    //Remover al Frente
    public Object removerAlFrente() throws EstaVacia{
        if (this.estaVacio())
            throw new EstaVacia( nombre );
        Object removido = primero.dato;
        if (primero==ultimo)
            primero=ultimo=null;
        else
            primero=primero.siguiente;
        return removido;
    }
    //Remover al Final
    public Object removerAlFinal() throws EstaVacia{
        if (this.estaVacio())
            throw new EstaVacia( nombre );
        Object removido = ultimo.dato;
        if (primero==ultimo)
            primero=ultimo=null;
        else{
            Nodo buscador=primero;
            while (buscador.siguiente != ultimo)                
                buscador=buscador.siguiente;
            ultimo=buscador;
            buscador.siguiente=null;
        }
        return removido;
    } 
    //Esta vacio
    public boolean estaVacio(){
        return (this.primero==null && this.ultimo==null);
    }
    // Imprimir lista;
    public void imprimir(){
        if (this.estaVacio()) {
            System.out.println("La Lista "+nombre+" esta Vacia");
            return;
        }
        System.out.println(nombre+" => Contiene: ");
        Nodo corredor=primero;
        while (corredor!=null) {            
            System.out.println(corredor.obtenerDato());
            corredor=corredor.siguiente;
        }
        System.out.println("\n");
    }
}