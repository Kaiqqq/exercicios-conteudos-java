package Application;

import Entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.a = sc.nextDouble();
        student.b = sc.nextDouble();
        student.c = sc.nextDouble();

        if(student.total() >= 60.0) {
            System.out.printf("FINAL GRADE = %.2f%nPASS", student.total());
        } else {
            System.out.printf("FINAL GRADE = %.2f%nFAILED %nMISSING %.2f POINTS", student.total(), student.missing());
        }
    }

}
