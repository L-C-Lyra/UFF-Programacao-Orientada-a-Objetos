import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius, fahrenheit;

        System.out.print("Digite a Temperatura em Celsius: ");
        celsius = sc.nextInt();

        fahrenheit = (int) (celsius * 1.8) + 32;

        System.out.println(celsius + "ºC Equivalem a " + fahrenheit + "ºF.");
    }
}
