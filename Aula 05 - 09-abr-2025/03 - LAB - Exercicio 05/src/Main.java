import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3, AB, BC, CA;
        double epsilon = 0.001;

        System.out.println("A(x, y): ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.println("B(x, y): ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        System.out.println("C(x, y): ");
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();

        AB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        BC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        CA = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        if(((AB + BC) > CA) && ((AB + CA) > BC) && ((BC + CA) > AB)){
            if((Math.abs(AB - BC) < epsilon) && (Math.abs(BC - CA) < epsilon)){
                System.out.println("△ABC eh EQUILATERO.");
            }else if((Math.abs(AB - BC) < epsilon) || (Math.abs(BC - CA) < epsilon) || (Math.abs(CA - AB) < epsilon)){
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