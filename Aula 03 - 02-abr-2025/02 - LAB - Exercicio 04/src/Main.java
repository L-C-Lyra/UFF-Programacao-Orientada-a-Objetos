import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins, coinsAux, one, five, ten, twentyFive, fifty, hundred;

        System.out.println("Digite a Quantidade de Centavos: ");
        coins = sc.nextInt();

        coinsAux = coins;

        hundred = coins / 100;
        coins = coins % 100;

        fifty = coins / 50;
        coins = coins % 50;

        twentyFive = coins / 25;
        coins = coins % 25;

        ten = coins / 10;
        coins = coins % 10;

        five = coins / 5;
        coins = coins % 5;

        one = coins;

        System.out.println(coinsAux + " = ");
        System.out.println(hundred + " Moeda(s) de 1 Real");
        System.out.println(fifty + " Moeda(s) de 50 Centavos");
        System.out.println(twentyFive + " Moeda(s) de 25 Centavos");
        System.out.println(ten + " Moeda(s) de 10 Centavos");
        System.out.println(five + " Moeda(s) de 5 Centavos");
        System.out.println(one + " Moeda(s) de 1 Centavo");
    }
}

