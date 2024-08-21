import java.util.Scanner;

public class Questão13 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.println("Pode digitar os 20 numeros por gentileza? ");
        for (int i = 0; i < 20; i++){
            int numero = s.nextInt();
            if(numero >= 0 && numero <=100){
                count++;
            }
        }
        System.out.println("A quantidade de numeros entre 0 a 100: " + count);
    }


        }