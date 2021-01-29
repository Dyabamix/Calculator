public class Calculate {
    public static int calculate(int a, int b, String sign) {
        switch (sign) {
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
