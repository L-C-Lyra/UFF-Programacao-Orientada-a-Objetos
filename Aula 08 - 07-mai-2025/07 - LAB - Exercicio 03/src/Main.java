import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j = 0, k, p;
        int tmp;
        int[] v;

        System.out.print("n: ");
        n = sc.nextInt();

        v = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextInt();
        }

        System.out.print("k: ");
        k = sc.nextInt();
        System.out.print("p: ");
        p = sc.nextInt();

        if(p > n - 1){
            System.out.println("Posicao INVALIDA.");
        } else {
            System.out.printf("v = {%d", v[0]);
            for(i = 1; i < n; i++) {
                System.out.printf("\t%d", v[i]);
            }
            System.out.println("}");

            for(i = n - 1; i > p; i--) {
                v[i] = v[i - 1];
            }
            v[p] = k;

            System.out.printf("v = {%d", v[0]);
            for(i = 1; i < n; i++) {
                System.out.printf("\t%d", v[i]);
            }
            System.out.println("}");
        }
    }
}
