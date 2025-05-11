import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j = 0, k;
        int[] v;
        int[] v_aux;

        System.out.print("n: ");
        n = sc.nextInt();

        v = new int[n];
        v_aux = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextInt();
        }

        for(i = 0; i < n; i++) {
            v_aux[i] = -1;
        }

        System.out.print("k: ");
        k = sc.nextInt();

        for (i = 0; i < n; i++) {
            if(v[i] == k){
                v_aux[j] = i;

                j++;
            }
        }

        if(v_aux[0] == -1){
            System.out.println("Numero NAO ENCONTRADO.");
        } else {
            System.out.println("Numero ENCONTRADO na(s) Posicao(oes): ");
            for (i = 0; i < n; i++) {
                if(v_aux[i] != -1){
                    System.out.printf("%d\t", v_aux[i]);
                }
            }
        }
    }
}
