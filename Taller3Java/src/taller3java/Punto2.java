
package taller3java;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Punto2 {

public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int saldoM,saldoF;
        int Limit=2500;
        int bono=1000;
        int Deducc=50;
        
        System.out.print("Ingrese el saldo inicial del mes: ");
     
        saldoM= entrada.nextInt();
        
        
        
        saldoF= saldoM+bono-Deducc;
        
        System.out.println("El nuevo balance es: "+saldoF);
        
        if (saldoF > Limit){
            System.out.println("* Se excedio el limite de credito");
        }
        
        
        
    }
}