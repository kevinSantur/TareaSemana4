/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;
import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (1-6): ");
        int numero = sc.nextInt();
        
        String ingles = "";
        switch (numero) {
            case 1: ingles = "one"; break;
            case 2: ingles = "two"; break;
            case 3: ingles = "three"; break;
            case 4: ingles = "four"; break;
            case 5: ingles = "five"; break;
            case 6: ingles = "six"; break;
            default: System.out.println("Número fuera de rango."); return;
        }
        
        System.out.println("El número en inglés es: " + ingles);
    }
}