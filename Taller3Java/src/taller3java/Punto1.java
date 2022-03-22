/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3java;
import java.util.Scanner;
/**
 *
 * @author Ramon
 */
public class Punto1 {
    
    public static void main (String[] args) {
            Scanner entrada = new Scanner (System.in);
   
          int cod, val,total2;
          total2 = 0;
          int total3= 0 ;
             System.out.println ("Ingrese el numero total de productos");
              
           int n = entrada.nextInt();
       String  A[] = new String [n];
       int  B[] = new int [n];
       int  C[] = new int [n];
        
          int  total[] = new int [n];
  
  
       
      
      for (int  i=0; i<n; i++){
      
            
                System.out.println ("Ingrese el codigo del producto " + (i+1));
              
                   
     
     A[i] = entrada.next().substring(0);
        System.out.println ("Cual fue el valor de la venta del producto "+ A[i] +"?: ");
        
         val =entrada.nextInt();
        
        B[i]= val;
              System.out.println ("Cuantas unidades vendio el producto "+ A[i] + " ?");
        
         int uni =entrada.nextInt();
         
         C[i] = uni;
         
         total2 = uni*B[i];
         total[i] =total2;
         
       
       
           total2=total[i];
      }
            int Mvendido, Mcostoso;
         
                 Mvendido = C[0];
       
       Mcostoso = B[0];
              String Mn2,Mn1;
              
              Mn2=A[0];
              Mn1=A[0];
           
         for (int i=0; i<n; i++){
                total3= total3+total[i];
        Mvendido = C[i];
                    Mcostoso = B[i];
         
        
                 if (B[i]> Mcostoso){
                     Mcostoso = B[i];
                     Mn1 = A[i];
                 }
                 
                   if (C[i]> Mvendido){
                     Mvendido = C[i];
                     Mn2 = A[i];
                 }
                   
            
      }
         System.out.println ("El total de productos vendidos en el dia fue : \n"
                 + n + " El total de ingresos en el dia fue de  : "+
               total3 + " El producto mas vendido en el dia fue : " + Mn1
                 
                 + " El producto mas costoso vendido en el dia fue : "+Mn2 );
      }


}
    
        
     
        
    
    

