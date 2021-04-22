package javaBrains;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(romanToInt(104));
    }

    public static String romanToInt(int num){
        String romanNumber = "";

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        romanNumber = thousands[num / 1000]
                + hundreds[(num % 1000)/100]
                + tens[(num % 100) / 10]
                + units[(num % 10)];

        return romanNumber;
    }
}
