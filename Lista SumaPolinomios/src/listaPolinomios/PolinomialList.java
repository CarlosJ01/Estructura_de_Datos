package listaPolinomios;

import java.util.Scanner;

class Term{
    double coefficient;
    int exponent;

    public Term(double coefficient,int exponent){
        this.coefficient= coefficient;
        this.exponent = exponent;
    }
    
    public Term(Term dato){
        this.coefficient= dato.coefficient;
        this.exponent = dato.exponent;
    }
    
    public double getCoeficient(){
        return coefficient;
    }

    public int getExponent(){
        return exponent;
    }
    
    @Override
    public String toString(){
        String text;
        
        text = String.format(" %fX**%d",coefficient,exponent);
        
        if (coefficient > 0)
            text=" +" + text;
        return text;
    }
}

// class PolinomialList definition
public class PolinomialList extends List
{
    // constructor creates empty List with "list" as the name
    public PolinomialList() { 
        super( "Polinomial" ); 
    } // end List no-argument constructor
  
    public PolinomialList(String name) { 
        super( name ); 
    } // end List no-argument constructor
    
    public void readTerms(){
        double coefficient;
        int exponent;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("ingrese el siguiente término, coeficiente exponente: ");
	    coefficient = teclado.nextDouble();
            exponent = teclado.nextInt();
		if(coefficient != 0 || exponent != 0)
                    insertAtBack(new Term(coefficient,exponent));
        }while (coefficient != 0 || exponent != 0);
    }

    public void sum(PolinomialList uno, PolinomialList dos){
        PolinomialList cuatro= new PolinomialList("cuatro");
        
        copyList(uno);
        cuatro.copyList(dos);
        
        ListNode termCurrent= firstNode;
        Term dataCurrent;
        Term dataFound;
        while (termCurrent != null ){
            dataCurrent = (Term)termCurrent.data;
            dataFound = cuatro.locateAndDelete(dataCurrent.exponent);
//            dataFound = cuatro.locateAndDelete(((Term)current.data).exponent);
            if (dataFound != null)
                dataCurrent.coefficient += dataFound.coefficient;
            termCurrent = termCurrent.nextNode;
        }
        cutAndPasteBack(cuatro);
    }
    // hace una copia de la lista nueva en la lista actual
    public void copyList(List nueva){
        if (!nueva.isEmpty()){
            ListNode nodeCurrent = nueva.firstNode;
            while ( nodeCurrent != null ){
                insertAtBack(new Term((Term)nodeCurrent.data));
                nodeCurrent = nodeCurrent.nextNode;
            }
        }
    }
   
    // Localiza un nodo de lista que guarda un término con el exponente 
    // igual al de entrada, si existe recupera el término, borra el nodo
    // de la lista y regresa el término encontrado 
    public Term locateAndDelete0(int exponent){
        if (isEmpty())
           return null;
      
        ListNode nodeCurrent = firstNode;
        ListNode nodePrevious = null;
        Term dataTerm = null;
        while ( nodeCurrent != null ){
            Term dataTemp = (Term)nodeCurrent.data;
            if (dataTemp.exponent==exponent){
                dataTerm=dataTemp;
                break;
            }
            nodePrevious = nodeCurrent;
            nodeCurrent = nodeCurrent.nextNode;
        }
        // no se encuentra un término con el exponente buscado
        if(dataTerm == null)
            return null;
        // borrar el término del polinomio      
        if (nodeCurrent == firstNode){
            removeFromFront();
        } else if (nodeCurrent == lastNode){
            removeFromBack();
        } else {
            nodePrevious.nextNode = nodeCurrent.nextNode;
            nodeCurrent.nextNode= null;
        }
        return dataTerm;
    }
    
    public Term locateAndDelete(int exponent){
        if (isEmpty())
           return null;
        ListNode nodeCurrent = firstNode;
        while ( nodeCurrent != null 
            && ((Term)nodeCurrent.data).exponent!=exponent){
                nodeCurrent = nodeCurrent.nextNode;
        }
        // no se encuentra un término con el exponente buscado
        if(nodeCurrent == null)
            return null;
        this.removeFromList(nodeCurrent);
        return (Term)nodeCurrent.data;
    }
} // end class List
