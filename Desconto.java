package Lista;

import java.util.Scanner;

public class Desconto {
    
    
    public static void main(String[] args) {

       double valor;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        valor = in.nextDouble();

        if (valor <= 99.99) {
            System.out.println("você não tem desconto a essa compra ");} 
        
        
        
        else {
            System.out.println(" você gastou acima de 100,00R$, seu desconto é R$" + valor * 0.1 );}
        
        
         in.close();

    }
}
