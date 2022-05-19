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
            System.out.println("-------Opções------");
            System.out.println(" 1 - Cadastrar ");
            System.out.println(" 2 - Excluir ");
            System.out.println(" 3 - Pesquisar ");
            System.out.println(" 4 - Sair ");
            System.out.println("Por gentileza, insira uma opção de [1-4]: ");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("---------Cadastrar--------");
                    System.out.println("Insira o nome");
                    nome = ler.next();
                    System.out.println("Insira o telefone");
                    telefone = ler.next();
                    System.out.println("Insira o user");
                    user = ler.next();
                    System.out.println("Insira o email");
                    email = ler.next();
                    usuario.add(nome + ";"+ telefone + ";" + user + ";" +email);
                    break;
                case 2:
                    System.out.println("-------Excluir------");
                    System.out.println("Nome do usuário que deseja excluir");
                    nome = ler.next();
                    int indice = -1;
                    for( int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i))
                    }
                    break;
                case 3:
                    System.out.println("-------Pesquisar------");
                    System.out.println("Nome do usuário que deseja pesquisar");
                    nome = ler.next();
                    break;
                case 4:
                    System.out.println("Sair da aplicação");
                    break;
            }

        }
    }
}