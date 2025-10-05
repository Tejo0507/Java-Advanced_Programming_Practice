package Inheritance;
class Student2
{
    protected String name;
    private int rollNo;
    
    void getStudentDetails(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudentDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Marks2 extends Student2
{
    int marks;

    void getMarks(int marks)
    {
        this.marks = marks;
    }

    void displayMarks()
    {
        System.out.println("Marks: " + marks);
    }
}

class Attendance extends Student2
{
    int daysPresent;

    void getAttendance(int days)
    {
        this.daysPresent = days;
    }

    void displayAttendance()
    {
        System.out.println("Days Present: " + daysPresent);
    }
}

public class HierarchicalInheritanceDemo
{
    public static void main(String[] args)
    {
        Marks2 m = new Marks2();
        m.getStudentDetails("Anand", 103);
        m.getMarks(95);
        m.displayStudentDetails();
        m.displayMarks();

        System.out.println();

        Attendance a = new Attendance();
        a.getStudentDetails("Divya", 104);
        a.getAttendance(180);
        a.displayStudentDetails();
        a.displayAttendance();
    }
}
