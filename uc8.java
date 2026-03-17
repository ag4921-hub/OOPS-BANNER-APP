import java.util.*;

public class OOPSBannerAppUC8 {

    
    public static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    
    public static void printBanner(String word, Map<Character, String[]> map) {
        word = word.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("     "); // blank if not found
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = createPatternMap();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();

        printBanner(word, patternMap);
    }
}