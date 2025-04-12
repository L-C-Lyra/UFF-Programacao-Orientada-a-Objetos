import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b, minAB, maxAB;

        System.out.println("n: ");
        n = sc.nextInt();

        System.out.println("a: ");
        a = sc.nextInt();

        System.out.println("b: ");
        b = sc.nextInt();

        minAB = Math.min(a, b);
        maxAB = Math.max(a, b);

        if(n < minAB){
            System.out.println("O Numero " + n + " esta ANTES do Intervalo (" + minAB + ", " + maxAB + ").");
        }else if(n > maxAB){
            System.out.println("O Numero " + n + " esta DEPOIS do Intervalo (" + maxAB + ", " + minAB + ").");
        }else{
            System.out.println("O Numero " + n + " esta DENTRO do Intervalo (" + minAB + ", " + maxAB + ").");
        }

        sc.close();
    }
}