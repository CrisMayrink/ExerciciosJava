
package udemystudy.aplicacao1;


import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        
        //definir o tamnho do vetor
        int n = sc.nextInt();
        
        //declarar o vetor chamado num com o tamanho escolhido pelo usuario 
        
        int[] pares  = new int[n];
        int contPares = 0;
                
        System.out.println("Digite os números do vetor: ");
        for (int i = 0; i < n; i++) {           
            sc.nextLine();
            int x = sc.nextInt();
            
                    // verificar se são pares
            if(x %2 ==0){
                pares[contPares] = x;//adiciona o numero no vetor
                contPares++; // avança para a proxima posição livre do vetor
            }
        }        
        //mostrando os pares
        System.out.println("\nOs números pares guardados no vetor são: " );
        for (int i=0; i<contPares; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.println("\nQuantidade de Pares:  " + contPares);       
                
        sc.close();
        
    }
}
