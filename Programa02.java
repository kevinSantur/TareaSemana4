/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
    int numero;
    String diasem="";
    Scanner lectura=new Scanner(System.in);
    //Entrada de datos
    System.out.print("Ingresar un número [1-7]:");
    numero=lectura.nextInt();
    //Proceso de datos
        switch (numero) {
            case 1:diasem="Lunes";break;
            case 2:diasem="Martes";break;
            case 3:diasem="Miercoles";break;
            case 4:diasem="Jueves";break;
            case 5:diasem="Viernes";break;
            case 6:diasem="Sábado";break;
            case 7:diasem="Domingo";break;
                
       
        }
        //Salida de datos
        System.out.print("El número de día de la semana es:"+diasem);
    }
}