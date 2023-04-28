import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma=0,idade;


        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa "+(i+1));
            idade = sc.nextInt();
            soma+=idade;
        }

        System.out.println("A media de idades e "+(soma/20));
    }
}
