import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Questão 1
public class Questão1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();


        System.out.print("Digite sua idade em anos: ");
        int anos = s.nextInt();

        System.out.print("Digite sua idade em meses: ");
        int meses = s.nextInt();

        System.out.print("Digite sua idade em dias:");
        int dias = s.nextInt();
        int idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("A idade em dias é: " + idadeEmDias + " dias");

    }
}