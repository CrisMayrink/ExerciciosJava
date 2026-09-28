
package udemystudy.aplicacao1;

import Entities.Estudante;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       // 1. Vetor de 10 posições para representar os quartos de 0 a 9
        Estudante [] quarto = new Estudante[10];
        
        // 2. definir quantos quartos serão alugados:        
        System.out.println("Quantos quartos serão alugados: ");
        int n = sc.nextInt();
        
        //receber os dados dos estudantes com o for
        for (int i = 1; i <= n; i++) {
            System.out.println("\nAluguel #" + i + ":");
            sc.nextLine(); // Limpeza de buffer
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.next();
            
            System.out.print("Quarto (0 a 9): ");
            int numeroQuarto = sc.nextInt();
            
            
            // O quarto agora é passado junto no construtor do objeto Estudante
            quarto[numeroQuarto] = new Estudante(nome, email, numeroQuarto);
        }
        // Relatório final usar o for para percorrer o vetor
        System.out.println("\nQuartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (quarto[i] != null) {
                // Buscamos o número do quarto direto de dentro do objeto usando o getQuarto()
                System.out.println(quarto[i].getQuarto() + ": " + quarto[i].getNome() + ", " +                   quarto[i].getEmail());
            }
        }
           
        sc.close();
    }
}
    
