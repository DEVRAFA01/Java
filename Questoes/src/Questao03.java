import java.util.Scanner;

public class Questao03
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();


        scanner.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }
}
