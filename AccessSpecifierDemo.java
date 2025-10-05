package Inheritance;

class Student4
{
    public String name;
    protected int rollNumber;
    String course;
    private double marks;
    
    public Student4(String name, int rollNumber, String course, double marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
    }
    
    public void displayPublicInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }

    private void displayMarks()
    {
        System.out.println("Marks: " + marks);
    }

    public void showFullInfo()
    {
        displayPublicInfo();
        displayMarks();
    }
}

class GraduateStudent extends Student4
{
    public String specialization;
    
    public GraduateStudent(String name, int rollNumber, String course, double marks, String specialization)
    {
        super(name, rollNumber, course, marks);
        this.specialization = specialization;
    }

    public void displayGraduateInfo()
    {
        System.out.println("Graduate Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Specialization: " + specialization);
    }
}

public class AccessSpecifierDemo
{
    public static void main(String[] args)
    {
         GraduateStudent gs = new GraduateStudent("Rahul", 101, "Computer Science", 88.5, "AI");
        
         gs.displayPublicInfo();
         gs.displayGraduateInfo();
        
         gs.showFullInfo();
        
         System.out.println("Name: " + gs.name);
    }
}
