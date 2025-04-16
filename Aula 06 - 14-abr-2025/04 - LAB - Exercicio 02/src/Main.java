import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        long fib;
        long fibA = 0, fibB = 1;

        System.out.println("n: ");
        n = sc.nextInt();

        if(n == 0){
            System.out.println("Fib(" + n + ") = " + fibA + ".");
        }else if(n == 1){
            System.out.println("Fib(" + n + ") = " + fibA + ", " + fibB + ".");
        }else{
            System.out.print("Fib(" + n + ") = " + fibA + ", " + fibB);
            for(i = 2; i <= n; i++){
                fib = fibA + fibB;

                System.out.print(", " + fib);

                fibA = fibB;
                fibB = fib;
            }
            System.out.print(".\n");
        }

        sc.close();
    }
}
