

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para o raio de um círculo: ");
        
        double pi, A, r;
        pi = 3.14159;
        r = sc.nextDouble();
        A = pi* Math.pow( r, 2);
        System.out.printf(" A área é %.4f%n",  A);
        sc.close();
        
    }
    
}
