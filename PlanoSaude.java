package Lista;

import java.util.Scanner;

public class PlanoSaude {

 public static void main(String[] args) {
    
            int numero;

        Scanner in = new Scanner(System.in);
        System.out.println("====== Olá bem vindos ======");
        System.out.println("=== Qual seria o seu plano === ");
        System.out.print("Digite sua idade: ");
        numero = in.nextInt();

        if (numero <= 18) {
            System.out.println("O plano custa 50,00 R$ ");} 

      
        else if (numero >= 19 && numero <= 40){
            System.out.println("O plano custa 70,00 R$");}
                
                
         else if (numero >= 41 && numero <= 60 ){
            System.out.println("O plano custa 90,00 R$");}

            
        else {
            System.out.println("O plano custa 100,00 R$");
        }
        
        
        in.close();

 }
    
    }
