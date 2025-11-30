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

    // (x² + 3x - 4) для x=2
    public int solver(){
        //  (5 * 3) + (10 - 4) / 2
        int part1 = times(5, 3);      // 5 * 3 = 15
        int part2 = dif(10, 4);       // 10 - 4 = 6
        int part3 = div(part2, 2);    // 6 / 2 = 3
        int result = add(part1, part3); // 15 + 3 = 18

        return result;
    }
}
