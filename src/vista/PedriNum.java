/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Control.Numeros; 
import java.util.Scanner; 
/**
 *
 * @author Personal
 */
public class PedriNum {
     public static void main(String[] args) { 

       Scanner sc = new Scanner(System.in); 

        System.out.println("Digite el primer número"); 

        int numero1 = sc.nextInt(); 

        System.out.println("Digite el segundo número"); 

        int numero2 = sc.nextInt(); 

        Numeros numeros = new Numeros(numero1,numero2 ); 

        numeros.Mostrar(); 

    } 
}
