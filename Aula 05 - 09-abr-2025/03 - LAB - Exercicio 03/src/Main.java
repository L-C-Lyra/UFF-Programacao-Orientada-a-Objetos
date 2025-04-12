import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, tAux, hr, min, sec;

        System.out.println("t (sec(s)): ");
        t = sc.nextInt();

        tAux = t;

        hr = t / 3600;
        t %= 3600;

        min = t / 60;
        t %= 60;

        sec = t;

        System.out.println(tAux + " sec(s) = " + hr + " hr(s), " + min + " min(s), " + sec + " sec(s)");

        sc.close();
    }
}
