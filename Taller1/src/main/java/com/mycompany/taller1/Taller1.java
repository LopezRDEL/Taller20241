/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1;

import java.util.Scanner;

/**
 *
 * @author Alejandro Rico
 */
public class Taller1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese el primer puntaje " );
        int promedio1 = sc.nextInt();
        System.out.println("Ingrese el segundo puntaje " );
        int promedio2 = sc.nextInt();
        
        double promedio = (promedio1+promedio2)/2;
        
        System.out.println("El promedio final es " + promedio);
    }
}
