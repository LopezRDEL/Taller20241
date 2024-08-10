
package com.mycompany.taller1;

import java.util.Scanner;

/**
 *
 * @author DELR
 */
public class Circulo {
    public static void main(String[] args){
    
    Scanner sc = new Scanner (System.in);
    
        double radio, diametro, area;
        
        System.out.println("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
        System.out.println("Ingrese el diametro del circulo: ");
        diametro = sc.nextDouble();
        System.out.println("Ingrese el area del circulo: ");
        area = sc.nextDouble();
    
        diametro = radio*2;
        area= (3.1416)*(radio*radio);
        
        System.out.println("El area del circulo es: " + area);
    }
}

