
package pruebaPila;

public class Barco {
   public Casco bCasco;
   public Motor bMotor;
   public Vela bVela;
   private String nombre;

   public Barco(String name, int vela){
       bCasco= new Casco();
       bMotor= new Motor();
       bVela=  new Vela();
       nombre = name;

       bCasco.ancho=10;
       bCasco.longitud=100;
       bMotor.conbusible=1;
       
       bVela.tamaño= vela;
    }
   
   @Override
   public String toString(){
          return "<"+nombre + "-"+ bVela.tamaño+">"; 
   }
}
