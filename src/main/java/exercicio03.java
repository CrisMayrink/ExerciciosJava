

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha");
        
        int senha = sc.nextInt();
        
        
        while (senha != 2002){  
            
            System.out.println(" Senha invalida.");
            senha = sc.nextInt();
            
        }
        System.out.println("Acesso permitido!");
        
                        
        sc.close();
        
    }
    
}
