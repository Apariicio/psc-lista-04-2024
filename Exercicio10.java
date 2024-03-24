package Lista4;
/*  Faça um programa que receba dois números inteiros e gere os números 
inteiros que estão no intervalo compreendido por eles. */
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite um numero inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Por favor, digite outro numero inteiro: ");
        int n2 = scanner.nextInt();  
        
        int menN = Math.min(n1, n2);
        int maiN = Math.max(n1, n2);

        for (int i = menN + 1; i < maiN; i++){
            System.out.print(i + ", ");
        }

        scanner.close();

    }
    
}
