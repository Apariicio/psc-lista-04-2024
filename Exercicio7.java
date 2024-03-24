package Lista4;
/*Faça um programa que leia 5 números e informe o maior número */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
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
        double maN = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
        System.out.println(maN + ", e o maior numero digitado.");
        scanner.close();
        
    }
}