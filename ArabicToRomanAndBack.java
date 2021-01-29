public class ArabicToRomanAndBack {

    public static final String[] romanUnits = new String[]{
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
    };
    public static final String[] romanTens = new String[]{
            "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"
    };


    public static String arabicToRoman(int number) {
        String firstPart = "";
        String secondPart = "";
        if (number / 10 - 1 >= 0) {
            firstPart = romanTens[number / 10 - 1];
        }
        if (number % 10 - 1 >= 0) {
            secondPart = romanUnits[number % 10 - 1];
        }
        return firstPart + secondPart;
    }

    public static int romanToArabic(String number) {
        for (int i = 0; i < romanUnits.length; i++) {
            if (romanUnits[i].equals(number)) {
                return i + 1;
            }
        }

        if (romanTens[0].equals(number)) {
            return 10;
        }

        throw new RuntimeException("Число не соответствует диапазону");
    }
}
