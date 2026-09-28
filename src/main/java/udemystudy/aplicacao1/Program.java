
package udemystudy.aplicacao1;

import Entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        
        int n = sc.nextInt();
        //criar um vetor chamado produto
        Product[] vect = new Product[n];
        System.out.println("Digite os produtos do vetor: ");
        
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            //instanciar s objetos do vetor:
            vect[i] = new Product(name, price);
            
        }
        //soma dos produtos:
        double sum = 0.0;
        // sustituir o n por vect.length -ftem o mesmo efeito
        
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        //criar a média:
        double media = sum / n;
        
        
        System.out.printf("A média é: %.2f%n" , media);
        sc.close();
        
    }
}
