import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
            "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
            "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
            "deserunt mollit anim id est laborum. LL";

    public static void main(String[] args) {

        Map<Character, Integer> textSearch = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char tmp = text.charAt(i);


            if (Character.isLetter(tmp)) {
                int key = 1;
                textSearch.put(tmp, key);

                if (textSearch.containsKey(tmp)) {
                    int tmpkey = textSearch.get(tmp);
                    textSearch.put(tmp, tmpkey + 1);
                }
            }
        }

        System.out.println(textSearch.keySet() + " " + textSearch.values());
    }
}