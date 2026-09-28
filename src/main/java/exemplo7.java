
import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
Exemplo:
Entrada: Saída:
2 2
3 -2
-8 -1
-7 1
0 2
primeiro
quarto
terceiro
segundo
 */
public class exemplo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite dois números: ");
        
        while (sc.hasNextInt()){
            int x = sc.nextInt();
            int y = sc.nextInt();
        
        
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0){
                    System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0){
                    System.out.println("Terceiro quadrante");
            } else if ( x > 0 && y < 0){
                    System.out.println("Quarto quadrante");
            }
        }
            
         sc.close();
    }
    
}
