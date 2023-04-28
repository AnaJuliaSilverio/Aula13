import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Digite o  valor: ");
        valor = sc.nextInt();

        if (valor%2==0){
            valor+=5;
        }else {
            valor+=8;
        }
        System.out.println("O resultado foi: "+valor);

    }

}
