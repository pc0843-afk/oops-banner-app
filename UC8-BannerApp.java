import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // UC8: Static Inner Class for encapsulation (carried over from UC7)
    public static class CharacterPatternMap {
        private String[] pattern;

        public CharacterPatternMap(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // UC8 Requirement: Use HashMap to link characters to their patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // 1. Initialize the patterns in the Map
        patternMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            "  *** "
        });
        patternMap.put('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * "
        });
        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });

        // 2. The word to render
        String word = "OOPS";

        // 3. Render via function
        renderHorizontalBanner(word, patternMap);
    }

    /**
     * UC8: Technical process involving pattern retrieval via Map 
     * and StringBuilder within nested loops.
     */
    public static void renderHorizontalBanner(String word, Map<Character, String[]> patternMap) {
        int patternHeight = 4; // Number of rows in your ASCII art

        for (int i = 0; i < patternHeight; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c); // Efficient O(1) lookup
                
                if (pattern != null) {
                    rowBuilder.append(pattern[i]).append("  ");
                }
            }
            System.out.println(rowBuilder.toString());
        }
    }
}
