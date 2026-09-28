

import java.util.Locale;
import java.util.Scanner;


public class Vetores2 {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        
        //leitura do tamanho
        int n = sc.nextInt();
        

        //declarar o vetor com o tamnho N informado
        int[] vect = new int[n];
        
        //leitura dos numeros:
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os numeros do vetor: ");        
            sc.nextLine();
            vect [i] = sc.nextInt();
                                  
        }
        //exibição dos  negativos com for-each
        System.out.println("os números negativos são: ");
        //variavel de controle, flag, assume que n existem n negativos no vetor
        boolean possuiNegativo = false;
        
        //"Para cada número inteiro (que chamaremos de num) contido dentro do vetor...".
        for (int num : vect) {
            //se for menor que zero = possuinegativo true
            if (num < 0){
                System.out.println(num);
                possuiNegativo = true;
            }
            
        }
         // Mensagem caso nenhum número negativo tenha sido digitado
        if (!possuiNegativo) {
            System.out.println("Nenhum numero negativo foi encontrado.");
        }

        sc.close();
        
    }
    
}
