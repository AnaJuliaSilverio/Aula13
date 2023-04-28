import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDeExibicoes;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Quantas vezes voce quer exibir seu nome? ");
        numeroDeExibicoes = sc.nextInt();

        for (int i = 0; i < numeroDeExibicoes; i++) {
            System.out.println(nome);
        }
    }
}
