import java.util.Scanner;

public class Square {

  int num;

  public Square() {
    num = 10;
  }

  public int square() {
    return num * num;
  }

  public static void main(String[] args) {
    Square obj = new Square(); 
    int result = obj.square();

    System.out.println("Squared value of 10 is: " + result);
  }
}
