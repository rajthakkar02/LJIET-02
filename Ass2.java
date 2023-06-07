import java.util.Scanner;

class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        final int numStudents = 5;
        Student[] students = new Student[numStudents];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            students[count] = new Student();

            System.out.print("Enter the name of student " + (count + 1) + ": ");
            students[count].name = scanner.nextLine();

            System.out.print("Enter the age of student " + (count + 1) + ": ");
            students[count].age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            count++;
        } while (count < numStudents);

        System.out.println("\nStudent details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i].name + ", Age: " + students[i].age);
        }

        scanner.close();
    }
}
