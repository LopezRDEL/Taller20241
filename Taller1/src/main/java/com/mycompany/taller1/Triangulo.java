
package com.mycompany.taller1;

import java.util.Scanner;

/**
 *
 * @author DELR
 */
public class Triangulo {
    public static void main(String[] args){
    
        Scanner sc = new Scanner (System.in);
        
        float base, area, altura;
        
        System.out.println("Ingrese la base del triangulo: ");
        base= sc.nextFloat();
        System.out.println("Ingrese el area del triangulo: ");
        area= sc.nextFloat();
        System.out.println("Ingrese la altura del triangulo: ");
        altura= sc.nextFloat();
    
        area = base*altura/2;
        System.out.println("El area del triangulo es " + area);
    }
    
}
