package Bai1.run;

import Bai1.entity.BKapStudent;
import Bai1.entity.ClassNameComparator;
import Bai1.entity.ScholarShipComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerMark {
    public static BKapStudent[] students =new BKapStudent[100];
    public static int currentStudentIndex = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("==========MENU==========");
            System.out.println("1. Add student information");
            System.out.println("2. Show information");
            System.out.println("3. Sort students by scholar ship (low to high)");
            System.out.println("4. Sort students by class name (z-a)");
            System.out.println("5. Search students by class name");
            System.out.println("6. Exit");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputListStudent(sc);
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    sortByScholarShip();
                    break;
                case 4:
                    sortByClassName(sc);
                    break;
                case 5:
                    searchStudentByClassName(sc);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }

    public static void inputListStudent(Scanner sc) {
        System.out.println("Enter the number of student");
        int numberOfStudents = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfStudents; i++) {
            students[currentStudentIndex] = new BKapStudent();
            students[currentStudentIndex].input();
            currentStudentIndex++;
        }
    }

    public static void displayStudent() {
        for (int i = 0; i < currentStudentIndex; i++) {
            students[i].display();
        }
        if (currentStudentIndex == 0) {
            System.out.println("No students found");
        }
    }

    public static void sortByScholarShip() {
        Arrays.sort(students, 0, currentStudentIndex, new ScholarShipComparator());
        System.out.println("List sorted by Scholarship (low to high):");
        displayStudent();
    }

    public static void sortByClassName(Scanner sc) {
        Arrays.sort(students, 0, currentStudentIndex, new ClassNameComparator());
        System.out.println("List sorted by Class Name (z-a):");
        displayStudent();
    }

    public static void searchStudentByClassName(Scanner sc) {
        System.out.println("Enter the class name");
        String className = sc.nextLine();
        for (int i = 0; i < currentStudentIndex; i++) {
            if (students[i].getClassName().equals(className)) {
                students[i].display();
            }
        }
    }
}
