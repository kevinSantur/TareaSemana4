/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (1, 2, 3, 4, 6, 12): ");
        int numero = sc.nextInt();
        
        String periodo = "";
        switch (numero) {
            case 1: periodo = "mensual"; break;
            case 2: periodo = "bimestral"; break;
            case 3: periodo = "trimestral"; break;
            case 4: periodo = "cuatrimestral"; break;
            case 6: periodo = "semestral"; break;
            case 12: periodo = "anual"; break;
            default: System.out.println("Número fuera de rango."); return;
        }
        
        System.out.println("El período es: " + periodo);
    }
}