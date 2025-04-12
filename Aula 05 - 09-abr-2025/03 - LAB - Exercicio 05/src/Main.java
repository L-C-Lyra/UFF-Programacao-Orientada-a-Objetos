import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, AB, BC, CA;

        System.out.println("A(x, y): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.println("B(x, y): ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("C(x, y): ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        AB = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        BC = (int) Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        CA = (int) Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        if(((AB + BC) > CA) && ((AB + CA) > BC) && ((BC + CA) > AB)){
            if((AB == BC) && (BC == CA)){
                System.out.println("△ABC eh EQUILATERO.");
            }else if((AB == BC) || (BC == CA) || (CA == AB)){
                System.out.println("△ABC eh ISOSCELES.");
            }else{
                System.out.println("△ABC eh ESCALENO.");
            }
        }else{
            System.out.println("Os Pontos NAO Formam um △.");
        }

        sc.close();
    }
}