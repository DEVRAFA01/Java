import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu saldo: ");
        Double saldo = s.nextDouble();
        Double salarioReaj = saldo+(saldo*1/100);
        System.out.printf("Seu salário reajustado é: " +salarioReaj);




    }
}
