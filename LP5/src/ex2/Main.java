package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<String> usuario = new ArrayList<>();
        int menu = 0;
        String nome, telefone, user, email;
        while (menu != 4) {
            System.out.println("       Opções      ");
            System.out.println(" 1 - Cadastrar ");
            System.out.println(" 2 - Excluir ");
            System.out.println(" 3 - Pesquisar ");
            System.out.println(" 4 - Sair ");
            System.out.println("Por gentileza, insira uma opção de [1-4]: ");
            System.out.println("                         ");

            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("       Cadastrar      ");
                    System.out.println("Escreva seu nome");
                    nome = ler.next();
                case 2:
                    System.out.println("")



            }

        }
    }
}