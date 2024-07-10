package arboles;
public class nodoArbol {
    int dato;
    nodoArbol izquierdo;
    nodoArbol derecho;
   
    nodoArbol (int dato) {
    this.dato=dato;
    izquierdo=derecho=null;
    }
    
    public void insertar (int nuevoDato){
        if (nuevoDato!=dato) {
            if (nuevoDato<dato){
                if(izquierdo==null)
                    izquierdo=new nodoArbol(nuevoDato);
                else
                    izquierdo.insertar(nuevoDato);
            }
            else {
                if(derecho==null)
                    derecho=new nodoArbol(nuevoDato);
                else
                    derecho.insertar(nuevoDato);
            }
        }
    }
    
}