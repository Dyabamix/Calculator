import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, наш калькулятор выполняет операции: сложения(+), вычитания(-), умножения(*) и деления(/)\nОстальные операции будут считаться ошибкой!");
        System.out.print("Используйте только арабские, либо только Римские цифры! В диапазоне 1 - 10\nВведите выражение в формате a + b(с пробелами): ");
        String input = scanner.nextLine();
        String[] arrayInput = input.split(" ");
        int a;
        boolean aIsRoman;
        try {
            a = Integer.parseInt(arrayInput[0]);
            aIsRoman = false;
        } catch (NumberFormatException e) {
            aIsRoman = true;
            a = ArabicToRomanAndBack.romanToArabic(arrayInput[0]);
        }

        int b;
        boolean bIsRoman;
        try {
            b = Integer.parseInt(arrayInput[2]);
            bIsRoman = false;
        } catch (NumberFormatException e) {
            bIsRoman = true;
            b = ArabicToRomanAndBack.romanToArabic(arrayInput[2]);
        }

        if (a > 10 || b > 10 || a < 1 || b < 1) {
            throw new RuntimeException("Числа превышают необходимый диапазон");
        }
        if (aIsRoman == bIsRoman) {
            int result = Calculate.calculate(a, b, arrayInput[1]);
            if (aIsRoman) {
                System.out.println(ArabicToRomanAndBack.arabicToRoman(result));
            } else {
                System.out.println(result);
            }
        } else {
            throw new RuntimeException("Числа указаны в разных форматах");
        }
    }
}
