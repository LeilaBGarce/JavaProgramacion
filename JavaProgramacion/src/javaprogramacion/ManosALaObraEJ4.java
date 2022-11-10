/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramacion;

import java.util.Scanner;

/**
 *
 * EJERCICIO 4 MANOS A LA OBRA
 */
public class ManosALaObraEJ4 {
    public static void main(String[] args) {
  
   Scanner leer = new Scanner(System.in);
   System.out.print("Ingrese su nombre ") ;
   String nombre = leer.nextLine();
   
        System.out.print("Ingrese su edad ");
        int edad = leer.nextInt();
        
        System.out.println("Su nombre es:" + nombre);
        System.out.println("Su edad es:" + edad);

    }
    }
