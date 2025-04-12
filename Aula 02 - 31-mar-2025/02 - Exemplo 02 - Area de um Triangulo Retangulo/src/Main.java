import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Leitor do Teclado
        int height, basis; // Dados de ENTRADA
        float area; // Dados de SAIDA

        System.out.print("Informe a Altura: ");
        height = sc.nextInt();
        System.out.print("Informe a Base: ");
        basis = sc.nextInt();

        area = (float) (height * basis) / 2;

        System.out.println("Area: " + area);
    }
}
