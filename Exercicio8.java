package Lista4;
/*Faça um programa que leia 5 números 
e informe a soma e a média dos números. */
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite o quarto numero: ");
        double n4 = scanner.nextDouble();
        System.out.print("DIgite o quinto numero: ");
        double n5 = scanner.nextDouble();        
        double soma = (n1 + n2 + n3 + n4 + n5);
        System.out.println(soma + ", e o resultado dos numeros digitados.");        
        double media = (n1 + n2 + n3 + n4 + n5) /5;
        System.out.println(media + ", e o resultado da media entre so numeros digitados.");
        scanner.close();

    }
    
}