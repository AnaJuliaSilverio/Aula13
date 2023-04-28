import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroIdentAluno;
        double nota1,nota2,nota3,ma,me;
        char conceito = 0;
        String maConceito;

        System.out.println("Digite a identificação do aluno: ");
        numeroIdentAluno = sc.nextInt();

        System.out.println("Digite a nota 1");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3");
        nota3 = sc.nextDouble();

        me = (nota1 + nota2 +nota3)/3;
        ma = (nota1 + (nota2*2) +(nota3*3) + me)/7;

        if (ma>=90){
            conceito = 'A';
        }
        else if (ma>=75 && ma<90) {
            conceito = 'B';
        } else if (ma>=60 && ma<75) {
            conceito = 'C';
        } else if (ma>=40 && ma<60) {
            conceito = 'D';
        } else if (ma<40){
            conceito = 'E';
        }

        if ((conceito == 'A') || (conceito == 'B') || (conceito == 'C')){
            maConceito = "Aprovado";
        }else{
            maConceito = "Reprovado";
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.printf("NÚMERO DO ALUNO : %d\nNOTAS 1: %.2f\nNOTAS 2: %.2f\nNOTAS 3: %.2f\nMEDIA DOS EXERCICIOS: %.2f\nMEDIA DE APROVEITAMENTO: %.2f\nCONCEITO: %c\n%s\n",numeroIdentAluno,nota1,nota2,nota3,me,ma,conceito,maConceito);
        System.out.println("-------------------------------------------------------------------");

    }
}
