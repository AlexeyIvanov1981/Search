import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
            "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. Duis aute irure LLL dolor in reprehenderit in voluptate velit esse cillum " +
            "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
            "deserunt mollit anim id est laborum. LL ZZZ";

    public static void main(String[] args) {

        Map<Character, Integer> textSearch = new HashMap<>();
        Map<String, Map.Entry<Character, Integer>> Stat = new HashMap<>();


        for (int i = 0; i < text.length(); i++) {
            char tmpKey = text.charAt(i);

            if (Character.isLetter(tmpKey) && textSearch.get(tmpKey) == null) {
                int value = 1;
                textSearch.put(tmpKey, value);
            } else if (Character.isLetter(tmpKey) && textSearch.containsKey(tmpKey)) {
                int newValue = textSearch.remove(tmpKey) + 1;
                textSearch.put(tmpKey, newValue);
            }
        }
        System.out.println(textSearch);

        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : textSearch.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);

        Map.Entry<Character, Integer> minEntry = null;
        for (Map.Entry<Character, Integer> entry : textSearch.entrySet()) {
            if (minEntry == null || entry.getValue() < minEntry.getValue()) {
                minEntry = entry;
            }
        }
        System.out.println(minEntry);

    }
}


