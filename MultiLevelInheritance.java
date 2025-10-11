package Inheritance;
// Multilevel Inheritance
class Student
{
    String name;
    int rollNo;
    
    void getStudentDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Marks extends Student {
    int marks;
    
    void getMarks(int marks) {
        this.marks = marks;
    }

    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

class Result extends Marks {
    void displayResult() {
        if (marks >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Result r = new Result();
        r.getStudentDetails("Priya", 102);
        r.getMarks(72);

        r.displayStudentDetails();
        r.displayMarks();
        r.displayResult();
    }
}
