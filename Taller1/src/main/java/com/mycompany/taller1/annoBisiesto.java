
package com.mycompany.taller1;

import java.util.Scanner;

/**
 *
 * @author DELR
 */
public class annoBisiesto {
    public static void main(String[] args){
    
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese un anno para determinar si es bisiesto: ");
        int a;
        a=sc.nextInt();
         if (a%400==0) {
            System.out.println("El anno es bisiesto ");   
        }
         else if (a%100==0) { System.out.println("El anno no es bisiesto ");
        }
         else if (a%4==0){ System.out.println("El anno es bisiesto ");
        }
         else { System.out.println("El anno no es bisiesto "); 
         }
        
    }
}
