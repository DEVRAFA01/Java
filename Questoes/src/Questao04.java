import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.print("Digite um número: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(nome);
        }

        s.close();
    }
}
