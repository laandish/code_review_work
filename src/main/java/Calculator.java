public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    // (3x*x - 2x + 5) для x = 3
    public int solver(){
        int x = 3;

        int xSquared = times(x, x);           // 9
        int term1 = times(3, xSquared);       // 27
        int term2 = times(-2, x);             // -6
        int sum1 = add(term1, term2);         // 21
        int result = add(sum1, 5);            // 26

        return result;
    }
}
