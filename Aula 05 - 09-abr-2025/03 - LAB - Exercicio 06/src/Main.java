import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prodName;
        double prodPrice, discQty, totalQty;
        int prodQty;

        System.out.println("Digite o Nome do Produto: ");
        prodName = sc.nextLine();

        System.out.println("Digite o Preco do Produto: ");
        prodPrice = sc.nextDouble();

        System.out.println("Digite a Quantidade do Produto: ");
        prodQty = sc.nextInt();

        totalQty = prodPrice * prodQty;
        if(prodQty <= 10){
            discQty = 0.00;
        }else if(prodQty <= 20){
            discQty = 0.10;
        }else if(prodQty <= 50){
            discQty = 0.20;
        }else{
            discQty = 0.25;
        }
        totalQty -= (totalQty * discQty);

        System.out.println("   Produto: " + prodName);
        System.out.println("Quantidade: " + prodQty);
        System.out.println("     Total: " + totalQty);

        sc.close();
    }
}