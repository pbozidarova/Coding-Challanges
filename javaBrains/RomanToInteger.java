package javaBrains;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));

    }

    private static int romanToInt(String romanNum) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int resultInt = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            if(i > 0 && map.get(romanNum.charAt(i)) > map.get(romanNum.charAt(i - 1))){
                resultInt += map.get(romanNum.charAt(i)) - 2 * map.get(romanNum.charAt(i - 1));
            }else {
                resultInt += map.get(romanNum.charAt(i));
            }

        }
        
        return resultInt;
    }

}
