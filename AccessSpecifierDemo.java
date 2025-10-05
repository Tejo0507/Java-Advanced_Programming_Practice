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
