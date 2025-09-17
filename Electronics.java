package Constructor;

import java.util.Scanner;

public class Electronics
{
    String name;
    int price;
    String processor;
    public Electronics(String name,int price,String processor)
    {
        this.name = name;
        this.price = price;
        this.processor = processor;
    }
    public void features (int RAm,int ROM)
    {
        System.out.println("the name , price and processor available in the laptop is"+this.name+this.price+this.processor);
        System.out.println("the  features in the laptop is"+RAm+ROM);

    }
    public float  EMI (String name,float price, String processor,int RAm,int ROM)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the months you want the EMI to last");
        float input = sc.nextFloat();
        System.out.println("total months ="+input);
        float payment_per_month = this.price /input;
        System.out.println("your emi per  month is");
        return  payment_per_month;
    }
    public static void main(String[] args)
    {
        Electronics e=new Electronics("Apple",199999,"appleM3pro");
        System.out.println("Product Details are" + e.name+" "+e.price+" "+e.processor);
        e.EMI("Apple", 19999.5F,"Apple M3 pro",18,512);
        e.features(18,512);
    }
}
