package pruebaPila;
/**
 *
 * @author Estructura de Datos
 */
public class ParenthesisCheker {
    
    public boolean checkBalanced(String cadena)
    {
        //StackComposition pila = new StackComposition(); 
        StackComposition< Character > pila = new StackComposition< Character >();
        
        for(int a = 0; a < cadena.length(); a++)
        {
            char corte = cadena.charAt(a);
            if(corte == '[' || corte == '{' || corte == '(')
                pila.push(corte);
            else if(corte == ']' || corte == '}' || corte == ')')
            {
                if(pila.isEmpty())
                    return false;
                switch(corte)
                {
                    // Opening square brace
                    case ']':
                        if ('[' != pila.pop())
                            return false;
                        break;
                    // Opening curly brace
                    case '}':
                        if ('{' != pila.pop())
                            return false;
                        break;
                    // Opening paren brace
                    case ')':
                        if ('(' != pila.pop())
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        return pila.isEmpty();
    }
}
