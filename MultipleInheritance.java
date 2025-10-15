package Interface;  
interface AnimalEat 
{
    void eat();
}

interface AnimalTravel 
{
    void travel();
}

class Animal implements AnimalEat, AnimalTravel 
{
    public void eat() 
    {
       System.out.println("Animal is eating");
    }
    public void travel() 
    {
       System.out.println("Animal is travelling");
    }
}
