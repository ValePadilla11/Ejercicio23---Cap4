/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23.cap4;

import java.util.Scanner;
public class Ejercicio23Cap4 {

    public static void main(String[] args) {
        double A,B,C,X1,X2;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        A = input.nextDouble();
        
        System.out.print("Ingrese el valor de B: ");
        B = input.nextDouble();
        
        System.out.print("Ingrese el valor de C: ");
        C = input.nextDouble();
        double z = 4*A*C;
        double x = Math.pow(B,2);
        double y = Math.sqrt(x-z);
        X1=(-B-y)/(2*A);
        X2=(-B+y)/(2*A);
        System.out.println(X1);
        System.out.println(X2);
        
    }
    
}
