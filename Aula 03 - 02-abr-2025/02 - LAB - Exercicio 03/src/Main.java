import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um Numero: ");
        n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("O Numero " + n + " eh PAR.");
        }else{
            System.out.println("O Numero " + n + " eh IMPAR.");
        }
    }
}
