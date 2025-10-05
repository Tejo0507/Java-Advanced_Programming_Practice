package Inheritance;

class Student4
{
    public String name;        // Public - accessible anywhere
    protected int rollNumber;  // Protected - accessible in subclass & same package
    String course;             // Default (package-private) - accessible in same package
    private double marks;      // Private - accessible only within this class
