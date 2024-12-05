public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int dif(int a, int b) {
        return a - b;
    }
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    public int times(int a, int b) {
        return a * b;
    }
    public int solver(int a, int b) {
        return add(a, dif(b, div(times(a, b), dif(a, b))));
    }
}