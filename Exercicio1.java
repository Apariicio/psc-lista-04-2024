package Lista4;
/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o usuário 
informe um valor válido.*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definindo que "nota" e um numero
        double nota;
        
        //repeticao de 0 10
        do {
            System.out.print("Digite uma nota entre 0 e 10:  ");
            nota = scanner.nextDouble();
            if (nota <=0 || nota >=10) {
                System.out.println("*NOTA INVALIDA!* A nota deve ser entre 0 e 10.");
             }
        } while (nota <=0 || nota >=10);
        System.out.println(nota + " Nota inserida valida."); 
        
        scanner.close();           
            
    }
}