/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mavenproject5 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int cont=0;
        int num;
        
       do {
           System.out.print("Digite um número INT: ");
           num = scanner.nextInt();
           
           if (num != 0) {
               
               cont++;
               System.out.println("Voce digitou:"+cont+" numeros ate agora");
           }
         
       }while (num !=0); 
       
       System.out.println("Você inseriu: " +cont+ " números. ");
       scanner.close();
        

    }
}
