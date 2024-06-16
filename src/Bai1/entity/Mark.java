package Bai1.entity;


import java.util.Scanner;

public class Mark implements IMark {
    private String fullName;
    private Boolean gender;
    private String className;
    private float markOfC;
    private float markOfHTML;
    private float markOfSQL;
    private float markOfPHP;

    public Mark() {
    }

    public Mark(String fullName, Boolean gender, String className, float markOfC, float markOfHTML, float markOfSQL, float markOfPHP) {
        this.fullName = fullName;
        this.gender = gender;
        this.className = className;
        this.markOfC = markOfC;
        this.markOfHTML = markOfHTML;
        this.markOfSQL = markOfSQL;
        this.markOfPHP = markOfPHP;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getMarkOfC() {
        return markOfC;
    }

    public void setMarkOfC(float markOfC) {
        this.markOfC = markOfC;
    }

    public float getMarkOfHTML() {
        return markOfHTML;
    }

    public void setMarkOfHTML(float markOfHTML) {
        this.markOfHTML = markOfHTML;
    }

    public float getMarkOfSQL() {
        return markOfSQL;
    }

    public void setMarkOfSQL(float markOfSQL) {
        this.markOfSQL = markOfSQL;
    }

    public float getMarkOfPHP() {
        return markOfPHP;
    }

    public void setMarkOfPHP(float markOfPHP) {
        this.markOfPHP = markOfPHP;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        this.fullName = inputName(sc);
        this.gender = inputGender(sc);
        this.className = inputClassName(sc);
        this.markOfC = inputMark(sc,"C");
        this.markOfHTML = inputMark(sc,"HTML");
        this.markOfSQL = inputMark(sc,"SQL");
        this.markOfPHP = inputMark(sc,"PHP");
    }

    @Override
    public void display() {
        System.out.printf("%-10s %-20s %-20s %-10s %-10s %-10s %-10s %-10s %-10s%n\n", "Name", "Gender", "Class", "C Mark", "HTML Mark", "SQL Mark", "PHP Mark","Average Mark", "ScholarShip");
    }

    @Override
    public float averageMark() {
        return (markOfC + markOfHTML + markOfSQL + markOfPHP)/4;
    }

    public String inputName(Scanner sc) {
        System.out.println("Enter full name");
        do {
            String fullName = sc.nextLine();
            if (fullName.trim().isEmpty()) {
                System.err.println("Full name is empty");
            } else {
                return fullName;
            }
        }while (true);
    }

    public boolean inputGender(Scanner sc) {
        System.out.println("Enter gender");
        do {
            String gender = sc.nextLine();
            if (gender.trim().isEmpty()) {
                System.err.println("Gender is empty");
            }else {
                if (gender.equalsIgnoreCase("true")||gender.equalsIgnoreCase("false")) {
                    return Boolean.parseBoolean(gender);
                }else {
                    System.err.println("Invalid gender. (True or False)");
                }
            }
        }while (true);
    }

    public String inputClassName(Scanner sc) {
        System.out.println("Enter class name");
        do {
            String className = sc.nextLine();
            if (className.trim().isEmpty()) {
                System.err.println("Class name is empty");
            } else {
                return className;
            }
        }while (true);
    }


    public float inputMark(Scanner sc, String subjectName) {
        System.out.println("Enter mark "+ subjectName);
        do {
            String mark = sc.nextLine();
            try {
                if(Float.parseFloat(mark)>0){
                    return Float.parseFloat(mark);
                }else {
                    System.err.println("Error parsing the float value. Please enter a valid Mark");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error parsing the float value. Please enter a valid Mark");
            }
        }while (true);
    }

}
