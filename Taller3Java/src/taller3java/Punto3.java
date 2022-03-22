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
public class Punto3 {
    
    public static void main (String[] args) {
        
        int sum = 0 ;
        int sum2;
        int selec = 0;
        int pago;  
        Scanner entrada = new Scanner (System.in);
        
        int reg[] = new int [7];
        
           System.out.println ("De que categoria eres? : \n"
                   + "Categoria A : 1 "
                   + "Categoria B : 2 "); 
           
           
         selec=entrada.nextInt();
         
         if (selec <1){
             
             System.out.println ("Opcion invalida intentelo de nuevo ! ");
             System.exit(0);
         } else if (selec >2){ 
             
              
             
             System.out.println ("Opcion invalida intentelo de nuevo ! ");
             System.exit(0);
         }
         
             
        System.out.println ("Ingrese cuanto gano el lunes : "); 
        
        
        
         int n=entrada.nextInt();
        reg [0] = n; 
                  System.out.println ("Ingrese cuanto gano el martes : "); 
        
        
        
         n=entrada.nextInt();
        reg[1] = n; 
                 
                  System.out.println ("Ingrese cuanto gano el miercoles : "); 
        
        
        
         n=entrada.nextInt();
        reg[2] = n; 
                 
                  System.out.println ("Ingrese cuanto gano el jueves : "); 
        
        
        
         n=entrada.nextInt();
        reg[3] = n; 
                 
                  System.out.println ("Ingrese cuanto gano el viernes :: "); 
        
        
        
         n=entrada.nextInt();
        reg[4] = n; 
                 
                  System.out.println ("Ingrese cuanto gano el sabado : "); 
        
        
        
         n=entrada.nextInt();
        reg[5] = n; 
                 
                 
                 
                 
                 
                 
        
         System.out.println ("Ingrese cuanto gano el domingo "); 
        
        
        
         n=entrada.nextInt();
        reg[6] = n; 
        
        for (int i = 0; i<7; i++){
            
            
            
        }
            
          for (int y = 0; y < 7; y++){
              
              sum += reg[y];
              
              
              
          }
         System.out.println (sum);
         
         pago = (int) (0.09*sum);
         
         sum2 = pago+200;
         
         System.out.println ("Has ganado " +  sum2+ "En toda la semana ");
    
         
 
             
             switch (selec )
             {
             
                 
                 
             
                     
                     
                     
                     case 1: 
                         if (sum > 3000 && sum < 5000) {
                             
                             
                             sum = (int) (0.05*sum2);
                             
                             pago = (sum+sum2);
                             
                             System.out.println ("Has vendido mas de 3k, Se te suma un 5% mas a tu pago semanal\n"
                                     + "el pago es  : " + pago + "$ Con El 5% Extra");
                             
                             
                             
                             

                             
                         }
                         else if (sum >5000 && sum <7000 ){
                              
                             sum = (int) (0.07*sum2);
                             
                             pago = (sum+sum2);
                             
                             System.out.println ("Has vendido mas de 5k, Se te suma un 5% mas a tu pago semanal\n"
                                     + "el pago es  : " + pago + "$ Con El 5% Extra");
                             
                         
                         
                     } 
                             else if (sum >10000 ){
                              
                             sum = (int) (0.10*sum2);
                             
                             pago = (sum+sum2);
                             
                             System.out.println ("Has vendido mas de 7k, Se te suma un 5% mas a tu pago semanal\n"
                                     + "el pago es  : " + pago + "$ Con El 5% Extra");
                             }
                         
                         break;
                         
                    
                                   case 2:
                         if (sum > 5000 ) {
                             
                             
                             sum = (int) (0.07*sum2);
                             
                             pago = (sum+sum2);
                             
                             System.out.println ("Has vendido mas de 5k, Se te suma un 7% mas a tu pago semanal\n"
                                     + "el pago es  : " + pago + "$ Con El 5% Extra");
                             
                             
                             
                             

                             
                         }
                         else if (sum >10000 && sum <15000){
                              
                             sum = (int) (0.07*sum2);
                             
                             pago = (sum+sum2);
                             
                             System.out.println ("Has vendido mas de 5k, Se te suma un 5% mas a tu pago semanal\n"
                                     + "el pago es  : " + pago + "$ Con El 10% Extra");
                             
                         
                         
                     } 
                             else if (sum >15000 ){
                              
                             sum = (int) (0.10*sum2);
                             
                             pago = (sum+sum2);
                             
                             System.out.println ("Has vendido mas de 5k, Se te suma un 5% mas a tu pago semanal\n"
                                     + "el pago es  : " + pago + "$ Con El 13% Extra");
                             
                         
                         break;
                         
                    
                         
                         
             
         }
                 
         }    
                 
    }
    
    }
                
    

