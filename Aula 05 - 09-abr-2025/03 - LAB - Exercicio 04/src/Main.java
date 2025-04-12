import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, t, gas;
        double avgV, fuelGas;

        System.out.println("d (m): ");
        d = sc.nextInt();

        System.out.println("t (min(s)): ");
        t = sc.nextInt();

        System.out.println("gas: ");
        gas = sc.nextInt();

        avgV = (double) ((d / 1000) / (t / 60));
        fuelGas = (double) ((d / 1000) / gas);

        System.out.println("Average Speed: " + avgV);
        System.out.println("Fuel Consumption: " + fuelGas);

        sc.close();
    }
}
