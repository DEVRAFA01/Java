import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite salário mínimo: ");
        Double salariominimo = s.nextDouble();

        System.out.print("Digite seu salário: ");
        Double salario = s.nextDouble();

        Double Qtdsalario = salario/salariominimo;

        System.out.printf("O salario do usuario é %.2f", Qtdsalario);



        }
    }

