/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mavenproject3 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int senha = 9999;
        int senhanum;
        
        do {
            System.out.println("Digite a senha");
            senhanum = scanner.nextInt();
            
            if (senhanum != senha) {
                System.out.println("Senha incorreta. Tente outra vez.");
            

}
        } while (senhanum != senha);
        
        System.out.println("Senha correta");
        scanner.close();
        
        
        
        
}
    
}
    
