/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_fibonacci;

/**
 *
 * @author adria
 */
public class EVA2_8_FIBONACCI {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int posicion = 7;
      int resultado = fibonacci(posicion);
      System.out.println("El valor de la serie de Fibonacci en la posicion " + posicion + " es: " + resultado);
      
      
   }
   
   public static int fibonacci(int posi){
      if (posi <= 0){
         return 1;
      }
      if (posi == 1){
         return 1;
         
      }
      
      return fibonacci(posi - 1) + fibonacci(posi - 2);
   
   
   
   
   }
   
}
