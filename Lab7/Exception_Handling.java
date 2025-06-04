// WAP in Java to show the use of exception handling:

class myclass {
    static int divideByZero(int a, int b) {
        // this statement will cause ArithmeticException
        int i = a / b;
        return i;
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 0;

        // Try block to check for exceptions
        try {
            int i = divideByZero(a, b);
        }
        // Catch block to handle ArithmeticException
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
