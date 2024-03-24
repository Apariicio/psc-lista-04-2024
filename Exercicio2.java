package Lista4;
/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
senha igual ao nome do usuário, mostrando uma mensagem de erro e 
voltando a pedir as informações. */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome de usuario: ");
        String usuario = scanner.nextLine().toLowerCase();

        System.out.println(" Por favor, insira a senha: ");
        String senha = scanner.nextLine().toLowerCase();            
            
        while (senha.equals(usuario)) {                
            System.out.println("SENHA INVALIDA!! Digite uma senha valida.");
            senha = scanner.nextLine().toLowerCase(); 
        }
        System.out.println("Senha valida.");
        System.out.println("Seja Bem vindo " + usuario);
        scanner.close();           
            
    }
}