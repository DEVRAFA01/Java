
import java.util.Scanner;
    public class Questao05 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int soma = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                int numero = s.nextInt();
                soma += numero;
            }


            System.out.println("A soma dos 10 números é: " + soma);

            s.close();
        }
    }





