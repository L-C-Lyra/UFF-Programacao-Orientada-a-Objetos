import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        String[] names = new String[10];
        int[] ages = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Nome da Pessoa " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Idade da Pessoa " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            sc.nextLine();
        }

        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 10; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    String tmpName = names[i];
                    names[i] = names[j];
                    names[j] = tmpName;

                    int tmpAge = ages[i];
                    ages[i] = ages[j];
                    ages[j] = tmpAge;
                }
            }
        }

        System.out.println("\nListagem em ORDEM ALFABETICA: ");
        for (i = 0; i < 10; i++) {
            System.out.println(names[i] + " - " + ages[i] + " Ano(s);");
        }

        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 10; j++) {
                if (ages[i] > ages[j]) {
                    int tmpAge = ages[i];
                    ages[i] = ages[j];
                    ages[j] = tmpAge;

                    String tmpName = names[i];
                    names[i] = names[j];
                    names[j] = tmpName;
                }
            }
        }

        System.out.println("\nListagem em ORDEM CRESCENTE DE IDADE:");
        for (i = 0; i < 10; i++) {
            System.out.println(names[i] + " - " + ages[i] + " Ano(s);");
        }
    }
}
