import java.util.HashMap;
import java.util.Map;

public class Main {
    static String LoremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit" +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
            " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
            " Excepteur sint occaecat cupidatat non proident," +
            " sunt in culpa qui officia deserunt mollit anim id est laborum";


    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < LoremIpsum.length(); i++) {
            char letter = LoremIpsum.charAt(i);
            if (map.get(letter) == null) {
                map.put(letter, 1);
            } else {
                int charNumber = map.get(letter);
                map.remove(letter);
                map.put(letter, charNumber + 1);
            }
        }

        long max = -1;
        char charMax = 0;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > max) {
                max = kv.getValue();
                charMax = kv.getKey();
            }
        }
        System.out.println(charMax + " - " + max);

        long min = Integer.MAX_VALUE;
        char charMin = 0;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() < max) {
                min = kv.getValue();
                charMin = kv.getKey();
            }
        }
        System.out.println(charMin + " - " + min);
    }
}
