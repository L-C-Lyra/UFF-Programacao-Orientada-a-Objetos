import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noStud, i, j = 0;
        double avgGrades = 0.0;
        double[] studGrades;
        double[] aboveAvgGrades;

        System.out.print("Numero de Alunos: ");
        noStud = sc.nextInt();

        studGrades = new double[noStud];
        aboveAvgGrades = new double[noStud];

        for(i = 0; i < noStud; i++) {
            System.out.print("Nota do Aluno " + (i + 1) + ": ");
            studGrades[i] = sc.nextDouble();

            avgGrades += studGrades[i];
        }

        avgGrades /= noStud;
        for(i = 0; i < noStud; i++) {
            if(studGrades[i] > avgGrades) {
                aboveAvgGrades[j] = studGrades[i];

                j++;
            }
        }

        System.out.printf("Media das Notas: %.2f\n", avgGrades);

        if(aboveAvgGrades[0] == 0.0) {
            System.out.println("NAO ha Notas ACIMA da Media.");
        } else {
            System.out.println("Notas ACIMA da Media: ");
            for(i = 0; i < noStud; i++) {
                if(aboveAvgGrades[i] != 0.0) {
                    System.out.printf("%.2f\t", aboveAvgGrades[i]);
                }
            }
        }
    }
}
