package hackerRank_30DaysOfCode;

import java.util.HashMap;
import java.util.Map;

public class Day8EnglishSpanishDictionary {

    public static void main(String[] args) {
        //English to Spanish Dictionary

        Map<String, String> englSpanDictionary = new HashMap<String, String>();

        //Inserting
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        //Retrieving
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        System.out.println(englSpanDictionary.keySet());
        System.out.println(englSpanDictionary.values());
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());

        System.out.println("-".repeat(30));

        //Shopping list
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreo's", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", false);

        //Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.toString());
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println("Is empty? - " + shoppingList.isEmpty());
    }

}
