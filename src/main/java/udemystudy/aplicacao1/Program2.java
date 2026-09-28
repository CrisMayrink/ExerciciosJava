
package udemystudy.aplicacao1;


import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        
        //definir o tamnho do vetor
        int n = sc.nextInt();
        
        //declarar o vetor chamado num com o tamanho escolhido pelo usuario 
        
        int[] vect = new int[n];
        
        System.out.println("Digite os números do vetor: ");
        for (int i = 0; i < n; i++) {           
            
            sc.nextLine();
            vect [i] = sc.nextInt();
            
        }
        //soma dos produtos:
        double sum = 0.0;
        // sustituir o n por vect.length -ftem o mesmo efeito
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        //criar a média:
        double media = sum / n;
        
        
        System.out.printf("A soma é %.2f e média é: %.2f%n" , sum, media);
        sc.close();
        
    }
}
