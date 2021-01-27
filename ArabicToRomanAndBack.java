public class ArabicToRomanAndBack {

    public static final String[] d0 = new String[]{
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
    };
    public static final String[] d1 = new String[]{
            "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"
    };


    public static String arabicToRoman(int number) {
        String firstPart = "";
        String secondPart = "";
        if (number / 10 - 1 >= 0) {
            firstPart = d1[number / 10 - 1];
        }
        if (number % 10 - 1 >= 0) {
            secondPart = d0[number % 10 - 1];
        }
        return firstPart + secondPart;
    }

    public static int romanToArabic(String s) {
        for (int i = 0; i < d0.length; i++) {
            if (d0[i].equals(s)) {
                return i + 1;
            }
        }
            if (d1[0].equals(s)) {
            return 10;
        }

        throw new RuntimeException("Число не соответствует диапазону");
    }
}
