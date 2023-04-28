import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();

        for (int i = 101; i <= 150 ; i++) {
            valores.add(i);
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(valores.get(i));
        }
    }
}
