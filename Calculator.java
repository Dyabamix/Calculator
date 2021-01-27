import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, наш калькулятор выполняет операции: сложения(+), вычитания(-), умножения(*) и деления(/)\nОстальные операции будут считаться ошибкой!");
        System.out.print("Используйте только арабские, либо только Римские цифры! В диапазоне 1 - 10\nВведите выражение в формате a + b(с пробелами): ");
        String input = scanner.nextLine();
        String[] arrayInput = input.split(" ");
        int a;
        boolean aIsRome;
        try {
            a = Integer.parseInt(arrayInput[0]);
            aIsRome = false;
        } catch (NumberFormatException e) {
            aIsRome = true;
            a = ArabicToRomanAndBack.romanToArabic(arrayInput[0]);
        }

        int b;
        boolean bIsRome;
        try {
            b = Integer.parseInt(arrayInput[2]);
            bIsRome = false;
        } catch (NumberFormatException e) {
            bIsRome = true;
            b = ArabicToRomanAndBack.romanToArabic(arrayInput[2]);
        }

        if (a > 10 || b > 10){
            throw new RuntimeException("Числа превышают необходимый диапазон");
        }
        if (aIsRome == bIsRome) {
            int result = Calculate.calculate(a, b, arrayInput[1]);
            if (aIsRome) {
                System.out.println(ArabicToRomanAndBack.arabicToRoman(result));
            } else {
                System.out.println(result);
            }
        } else {
            throw new RuntimeException("Числа указаны в разных форматах");
        }
    }
}
