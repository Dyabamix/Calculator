public class Calculate {
    public static int calculate(int a, int b, String input) {
        switch (input) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new RuntimeException("Неправильный операнд");
        }
    }
}
