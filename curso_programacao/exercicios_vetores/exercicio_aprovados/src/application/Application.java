package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] vect = new Student[n];

        for (int i = 0; i < vect.length; i++) {
            int position = i+1;
            System.out.println("Digite nome, primeira e segunda nota do " + position + "o aluno:");
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            double studentAverage = (grade1 + grade2) / 2;
            vect[i] = new Student(name, grade1, grade2, studentAverage);
            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getStudentAverage() >= 6.0) {
                System.out.println(vect[i].getName());
            }
        }
    }

}
