
import java.util.*;
class switchCase
{
    public static void main(String arg[])
    {
        int ch;
        System.out.println("Enter any number (1 to 7) :");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        switch(ch)
        {
        case 1:
                System.out.println("Today is Monday");  
                break;
        case 2:
                System.out.println("Today is Tuesday");
                break;

        case 3:
                System.out.println("Today is wednesday");
                break;
        default:
                System.out.println("Choose correct choice");
                break;
        }
    }

}