/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_mcd;

/**
 *
 * @author adria
 */
public class EVA2_7_MCD {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int dividendo = 180;
      int divisor = 48;
      int resu= mcd(dividendo, divisor);
      
      
      
      
      System.out.println("El MCD de " + dividendo + " y " + divisor + " es: " + resu);
   }
   
   public static int mcd (int dividendo, int divisor){ 
      if (divisor == 0){
         return dividendo;
      
      }
      int residuo = dividendo % divisor;
      return mcd(divisor, residuo); 
      
   
      
   
   }
   
}
