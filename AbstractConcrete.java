package Abstraction;
// Abstract class
//•	Abstract Method → only what to do. (No body)
//•	Concrete Method → what + how to do. (Full body)
abstract class Vehicle
{
    // Abstract method (no body → must be implemented by subclasses)
    abstract void start();
    // Concrete method (has body → common logic for all subclasses)
    void fuelCheck()
    {
        System. out.println("Fuel level is sufficient.");
    }
}
// Concrete subclass
class Car extends Vehicle
{
    // Implementing abstract method
    void start()
    {
        System. out.println("Car starts with a key.");
    }
}
// Another subclass
class Bike extends Vehicle
{
    // Implementing abstract method
    void start()
    {
        System. out.println("Bike starts with a self-start button.");
    }
}
public class AbstractConcrete
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();       // Output: Car starts with a key.
        v1.fuelCheck();   // Output: Fuel level is sufficient.

        v2.start();       // Output: Bike starts with a self-start button.
        v2.fuelCheck();   // Output: Fuel level is sufficient.
    }
}
