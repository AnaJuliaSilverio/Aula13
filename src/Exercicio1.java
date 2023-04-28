import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

        if (a==b){
            c = a+b;
        }
        else {
            c = a*b;
        }
        System.out.println("Resultado de c eh : "+c);

    }
}