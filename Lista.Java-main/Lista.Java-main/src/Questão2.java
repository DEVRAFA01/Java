import java.util.Scanner;

public class Questão2{

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("A primeira média é: ");
    int n1 = 8;
    int n2 = 9;
    int n3 = 7;
    int media1 = (n1+ n2 + n3)/3;

    System.out.println("A segunda media é : ");
    int ns1 = 4;
    int ns2 = 5;
    int ns3 = 6;
    int media2 = (ns1 + ns2 + ns3)/3;


    int soma = (media1 + media2);
    System.out.print("A soma das medias é: "+ soma);



  }
}
