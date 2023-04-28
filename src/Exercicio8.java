import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> salarios = new ArrayList<>();
        double valorSalarios=0,reajuste;
        char pergunta;

        while (true){
            System.out.println("Digite o salário: ");
            valorSalarios = sc.nextDouble();
            if (valorSalarios==-1){
                break;
            }
            salarios.add(valorSalarios);
        }
        System.out.println("Digite o valor dos reajustes em porcentagem: ");
        reajuste = sc.nextDouble();
        while (true){
            System.out.println("Voce deseja aumentar ou diminuir o salario? Para aumentar digite 'a' e para diminuir 'd' ");
            pergunta = sc.next().charAt(0);
            if (pergunta =='a'){
                reajuste = (reajuste/100)+1;
                break;
            }
            else if (pergunta =='d') {
                reajuste =1- (reajuste/100);
                break;
            }else {
                System.out.println("Valor invalido! Por favor digite apenas 'a' ou 'd'");
            }
        }


        for (int i = 0; i < salarios.size(); i++) {
            salarios.set(i,(salarios.get(i)*reajuste));
        }
        System.out.println("Salarios reajustados");
        for (int i = 0; i < salarios.size(); i++) {

            System.out.printf("R$ %.2f\n",salarios.get(i));
        }


    }
}
