package Lista4;

/*Altere o programa anterior permitindo 
ao usuário informar as populações e as 
taxas de crescimento iniciais. 
Valide a entrada e permita repetir a operação.  */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Por favor, informe a quantidade de populacao do pais A: ");
            int paisA = scanner.nextInt();

            System.out.print("Por favor, informe a quantidade de populacao do pais B: ");
            int paisB = scanner.nextInt();

            System.out.print("Por favor, informe a porcentagem de taxa de crescimento do pais A: ");
            double taxaCrescA = scanner.nextDouble() /100;

            System.out.print("Por favor, informe a porcentagem de taxa de crescimento do pais B: ");
            double taxaCrescB = scanner.nextDouble() /100;

            int anos = 0;
            while (paisA < paisB){
                paisA += (int) (paisA * taxaCrescA);
                paisB += (int) (paisB * taxaCrescB);
                anos++;
            }

            System.out.println(anos + " anos  sao necessarios para que o pais A iguale ou ultrapasse o pais B.");

            System.out.print("Deseja fazer uma nova operacao? (s ou n): ");
            repetir = scanner.next().charAt(0);
        } while (repetir == 's');
    
    
    scanner.close();
    }
}