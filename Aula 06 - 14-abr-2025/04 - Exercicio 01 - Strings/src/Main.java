import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chars, upperChars, lowerChars;
        int totalChars;

        System.out.println("Digite: ");
        chars = sc.nextLine().trim();

        totalChars = chars.length();

        upperChars = chars.toUpperCase();

        lowerChars = chars.toLowerCase();

        int i, counterA = 0;
        for(i = 0; i < totalChars; i++) {
            char c = chars.charAt(i);

            if((c == 'A') || (c == 'a')){
                counterA++;
            }
        }

        System.out.println("Numero Total de Caracteres: " + totalChars);
        System.out.println("Em MAIUSCULO: " + upperChars);
        System.out.println("Em minusculo: " + lowerChars);
        System.out.println("Total de Caracteres 'A': " + counterA);

        sc.close();
    }
}
