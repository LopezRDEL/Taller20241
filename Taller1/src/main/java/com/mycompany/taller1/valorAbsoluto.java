
package com.mycompany.taller1;

import java.util.Scanner;

/**
 *
 * @author DELR
 */
public class valorAbsoluto {
       public static void main(String[] args){
    
        Scanner sc= new Scanner (System.in);
            int n;
            System.out.println("Ingresa un numero para sacarle el valor absoluto: ");
            n= sc.nextInt();
            if (n>=0) {
                System.out.println("El valor absoluto es:" + n);
               
           } else { 
                System.out.println("El valor absoluto es: " +n*-1);
                
           }
            
            
            
            
               
           }
   
}
    

