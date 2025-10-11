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
