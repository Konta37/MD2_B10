package Bai1.entity;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BKapStudent extends Mark{
    private String courseName;
    private double scholarShip;

    public BKapStudent() {
    }

    public BKapStudent(double scholarShip, String courseName) {
        this.scholarShip = scholarShip;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getScholarShip() {
        return scholarShip;
    }

    public void setScholarShip(double scholarShip) {
        this.scholarShip = scholarShip;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        this.courseName = inputCourseName(sc);
        this.scholarShip = inputScholarShip();
        System.out.println("===============================================");
    }

    public String inputCourseName(Scanner sc) {
        System.out.println("Enter course name: ");
        do {
            String courseName = sc.nextLine();
            if (courseName.trim().isEmpty()) {
                System.err.println("Course name is empty");
            } else {
                return courseName;
            }
        }while (true);
    }

    public double inputScholarShip() {
        float scholarShip = averageMark();
        if (scholarShip >=17 && getMarkOfC() >=8 && getMarkOfHTML() >=8 && getMarkOfSQL() >=8 && getMarkOfPHP() >=8) {
            return 3500;
        }else if(scholarShip>=12 && scholarShip<17){
            return 2500;
        }else {
            return 0;
        }
    }

    @Override
    public float averageMark() {
        return super.averageMark();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%-10s %-20s %-20s %-10f %-10f %-10f %-10f %-10f %-10f%n\n", getFullName(), getGender()? "Male" : "Female", getClassName(), getMarkOfC(), getMarkOfHTML(), getMarkOfSQL(), getMarkOfPHP(), averageMark(), getScholarShip());
    }
}
