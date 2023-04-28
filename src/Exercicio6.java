import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor,soma=0;

       while (true){
           System.out.println("Digite o valor: ");
           valor = sc.nextInt();
           if (valor<0){
               break;
           }
           soma += valor;

       }
        System.out.println("A soma dos valores e: "+soma);
    }
}
