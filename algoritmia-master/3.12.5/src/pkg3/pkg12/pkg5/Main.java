/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg5;

import java.util.Scanner;

/**
 *
 * @author Pc-Jhon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = scan.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exponente = scan.nextInt();
        int resultado = 1;
        String proceso = "";
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
            proceso += base;
            if (i != exponente) {
                proceso += " * ";
            }
        }
        System.out.println("El proceso es: " + proceso + "   =  " + resultado);
    }
    
}
