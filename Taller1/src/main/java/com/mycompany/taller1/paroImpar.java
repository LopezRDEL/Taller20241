
package com.mycompany.taller1;

import java.util.Scanner;

/**
 *
 * @author DELR
 */
public class paroImpar {
     public static void main(String[] args){
    
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Ingrese un numero y determinare si es par o impar: ");
         int n;
         n=sc.nextInt();
    
            if (n%2==0) {
                System.out.println("El numero es par " + n);
             
         } else {
                System.out.println("El numero es impar "+ n);
         }
     }
}
