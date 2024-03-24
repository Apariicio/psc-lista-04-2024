package Lista4;
//Faça um programa que leia e valide as seguintes informações: 
//Nome: maior que 3 caracteres 
//Idade: entre 0 e 150
//Salário: maior que zero
//Sexo: 'f' ou 'm'
//Estado Civil: 's', 'c', 'v', 'd'.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        
        do {
            System.out.print("Por favor, digite seu nome: ");
            nome = scanner.nextLine();
        } while (nome.length() <=3);

        int idade;
        do {
            System.out.print("Por favor, digite sua idade: ");
            idade = scanner.nextInt();
        } while (idade <0 || idade >=150);

        double salario;
        do {
            System.out.print("Por favor, informe seu salario: ");
            salario = scanner. nextDouble();
        } while (salario <0);

        char sexo;
        do {
            System.out.print("Por favor, informe seu sexo F ou M." +
            "\nOnde: f de femino / " + "m de masculino: ");
            sexo = scanner.next().charAt(0);
            sexo = Character.toLowerCase(sexo);
        } while (sexo != 'f' && sexo != 'm');

        char eC;
        do{
            System.out.print("Por favor, informe seu estado civil." +
            "\nOnde:" + "\nS de solteiro(a) " + "\nC de casado(a)" + "\nV de viuvo(a)" +
            "\nD de divorciado(a): ");
            eC = scanner.next().charAt(0);
            eC = Character.toLowerCase(eC);
        } while (eC != 's' && eC != 'c' && eC != 'v' && eC != 'd');

        System.out.println("**INFORMACOES DE VALIDACAO:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + eC);

    scanner.close();
    
    }
    
}