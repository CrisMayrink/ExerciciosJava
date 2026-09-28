
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cmaya
 */
public class exemplo6 {

    public static void main(String[] args) {
        System.out.println("Digite um número inteiro, e após, digite três palavras: ");
        Scanner sc = new Scanner(System.in);
        int x;
        String  s1, s2, s3;
        x = sc.nextInt();// na mudança de tipos gera um espaço inutilizado na memoria
        sc.nextLine();//esse sc evita  que  esse espaço na memora e impeça de ler a prox palavra
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println("Você digitou: " + x + "," + s1 + ", " + s2 + ", " + s3 +"." );

        sc.close();
    }
    
}
