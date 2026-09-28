
import java.util.Locale;
import java.util.Scanner;

public class exemplo09 {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        
        int n = sc.nextInt();
        
        //1. declarar o vetor com o tamnho N informado
        double[] vect = new double[n];
        
        
        // 2. Leitura dos dados e armazenamento no vetor
        System.out.println("Digite os numeros do vetor: ");
        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }   
            
        // 3. Lógica para encontrar o maior e a sua posição
        // Inicializamos supondo que o primeiro elemento (índice 0) é o maior
        double maior = vect[0];
        int posicaoMaior = 0;
        
        // 4. Percorremos o vetor a partir do segundo elemento (índice 1)
        for (int i = 0; i < n; i++) {
            if (vect[i] > maior){
                maior = vect[i];
                posicaoMaior = i;
            }
        }
        // 5. Exibição dos resultados
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);       
        
        
        sc.close();
        
        
    }
    
}
