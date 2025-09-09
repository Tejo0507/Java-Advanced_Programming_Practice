public class JavaOperators {
    
    public static void main(String[] args) {
        int a = 25, b = 7;
        
        System.out.println("=== Java Operators ===");
        System.out.println("a = " + a + ", b = " + b);
        
        System.out.println("\nArithmetic:");
        System.out.println("a + b = " + add(a, b));
        System.out.println("a - b = " + subtract(a, b));
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a / b = " + divide(a, b));
        System.out.println("a % b = " + modulus(a, b));
        
        System.out.println("\nRelational:");
        System.out.println("a == b: " + equal(a, b));
        System.out.println("a != b: " + notEqual(a, b));
        System.out.println("a > b: " + greater(a, b));
        System.out.println("a < b: " + less(a, b));
        System.out.println("a >= b: " + greaterEqual(a, b));
        System.out.println("a <= b: " + lessEqual(a, b));
        
        System.out.println("\nAssignment:");
        int c = a;
        c += b; System.out.println("c += b: " + c);
        c -= b; System.out.println("c -= b: " + c);
        c *= b; System.out.println("c *= b: " + c);
        c /= b; System.out.println("c /= b: " + c);
        c %= b; System.out.println("c %= b: " + c);

        System.out.println("\nUnary:");
        System.out.println("a++: " + (a++));
        System.out.println("++a: " + (++a));
        System.out.println("a--: " + (a--));
        System.out.println("--a: " + (--a));

        System.out.println("\nBitwise:");
        System.out.println("a & b: " + and(a, b));
        System.out.println("a | b: " + or(a, b));
        System.out.println("a ^ b: " + xor(a, b));
        System.out.println("~a: " + not(a));
        System.out.println("a << 2: " + leftShift(a, 2));
        System.out.println("a >> 2: " + rightShift(a, 2));
        
        System.out.println("\nTernary:");
        System.out.println("Max: " + max(a, b));
    }
    

    public static int add(int x, int y) { return x + y; }
    public static int subtract(int x, int y) { return x - y; }
    public static int multiply(int x, int y) { return x * y; }
    public static double divide(int x, int y) { return (double)x / y; }
    public static int modulus(int x, int y) { return x % y; }
    
    public static boolean equal(int x, int y) { return x == y; }
    public static boo                 lean notEqual(int x, int y) { return x != y; }
    public static boolean greater(int x, int y) { return x > y; }
    public                                                                         static boolean less(int x, int y) { return x < y; }
    public static boolean greaterEqual(int x, int y) { return x >= y; }
    public static boolean lessEqual(int x, int y) { return x <= y; }
    
    public static int and(int x, int y) { return x & y; }
    public static int or(int x, int y) { return x | y; }
    public static int xor(                                int x, int y) { return x ^ y; }
    public static int not(int x) { return ~x; }
    public static int le                                           ftShift(int x, int positions) { return x << positions; }
    public static int rightShift(int x, int positions) { return                          
        x >> positions; }
    
    public static int max(int x, int y) { return (x > y) ? x : y; }




                        }
