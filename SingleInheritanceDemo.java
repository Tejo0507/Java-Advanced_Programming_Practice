package Inheritance;
// Single Inheritance
class Student1
{
    String name;
    int rollNo;

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
