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
public class Punto4 {
    public static void main(String[] args) {
           Scanner entrada = new Scanner (System.in);
        //La tarifa normal es de 20 por hora
       System.out.println ("Ingrese el numero total de empleados ");
         int NEmple = 0;
         
         NEmple = entrada.nextInt();
          
          
       String E[] = new String [NEmple];
       
       int H[] = new int [NEmple];
       
       int T[] = new int [NEmple];
       
       
        for (int i=0; i<NEmple; i++){
            
        
           
           
           System.out.println ("Ingrese el nombre del empleado numero "+(i+1));
           
         
              
           E[i] =   entrada.next().substring(0);
           System.out.println ("Las horas trabajadas del trabajador " + E[i] + " A lo largo de la semana");
         
            int Horas = entrada.nextInt();
           H[i] = Horas; 
           
           if (H[i] > 40) {
               
               T[i] = 30*H[i];
               
               
               
               
               
           } else {
               
               
               T[i] = 20*H[i];
               
               
               
           }
        }
               
               for ( int i= 0; i<NEmple; i++){
                   
                   System.out.println ("El sueldo bruto de cada empleado es : \n"
                           + E[i] + "  :  "
                           + H[i] + " : Horas "
                           + " Sueldo de : " + T[i]);
                           
                   
               }
           
            
        }
        
    }

