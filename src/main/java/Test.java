public class Test {
    public static int test(int dividend, int divider) throws Exceptions {
        try {
            return dividend / divider;
        } catch (ArithmeticException e) {
            throw new Exceptions(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        try {
            int result = test(a, b);
            System.out.println("Result = " + result);
        } catch (Exceptions exceptions) {
            System.out.println("Error " + exceptions.getMessage());
        }
    }
}
