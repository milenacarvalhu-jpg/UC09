package Aula6;

import java.util.Scanner;

public class Categoria {

 public static void main(String[] args) {
    
            int numero;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        numero = in.nextInt();

        if (numero <= 12) {
            System.out.println("Criança");} 

      
        else if (numero >= 13 && numero <= 17 ){
            System.out.println("Adolecente");}
                
                
         else if (numero >= 18 && numero <= 59 ){
            System.out.println("Adulto");}

            
        else {
            System.out.println("Idoso");
        }
        
        
        in.close();

 }
    
    }
