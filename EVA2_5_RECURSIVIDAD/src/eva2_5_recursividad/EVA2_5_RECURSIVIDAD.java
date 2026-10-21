/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_recursividad;

/**
 *
 * @author adria
 */
public class EVA2_5_RECURSIVIDAD {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
   }
   public static void imprimirInvCiclo(int valor){
      for (int i = valor; i >= 1; i--){
         System.out.println(i + " - ");
      }
      System.out.println("");
   
   }
   public static void imprimirInvRec(int valor){
      if(valor >= 1){
      System.out.println(valor + " - ");
      imprimirInvRec(valor - 1 );
      }   
   
   }
   

}