/* WAP in Java:  
exception handling using 
•	Throw
•	Throws
*/
 
class Exception_Handling2 {
    static int divideByZero(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int result = divideByZero(a, b);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
