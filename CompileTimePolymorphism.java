class BillingCounter {
    // Method for 2 items
    void generateBill(int price1, int price2) {
        int total = price1 + price2;
        System.out.println("Bill for 2 items: " + total);
    }

    // Method for 3 items
    void generateBill(int price1, int price2, int price3) {
        int total = price1 + price2 + price3;
        System.out.println("Bill for 3 items: " + total);
    }

    // Method for 4 items
    void generateBill(int price1, int price2, int price3, int price4) {
        int total = price1 + price2 + price3 + price4;
        System.out.println("Bill for 4 items: " + total);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        BillingCounter counter = new BillingCounter();

        counter.generateBill(100, 200);                  // 2 items
        counter.generateBill(50, 150, 250);             // 3 items
        counter.generateBill(40, 60, 80, 120);          // 4 items
    }
}

