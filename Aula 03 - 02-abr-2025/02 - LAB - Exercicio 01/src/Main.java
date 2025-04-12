import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Digite seu Nome: ");
        name = sc.nextLine();

        System.out.println("Ola, " + name + "! Bem-Vindo ao Java!");
    }
}
