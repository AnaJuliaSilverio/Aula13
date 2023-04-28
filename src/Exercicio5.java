import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0,valor;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor: ");
            valor = sc.nextInt();
            if (valor>0 && valor<100){
                cont++;
            }
        }
        System.out.println(cont+" valores estão entre 0 e 100");
    }
}
