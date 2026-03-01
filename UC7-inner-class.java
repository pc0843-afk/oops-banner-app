public class BannerApp {

    // UC7: Static Inner Class to encapsulate Character and its ASCII Pattern
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor to initialize data
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getters for data retrieval
        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static void main(String[] args) {
        // Define your ASCII patterns (adjust rows to match your UC6 design)
        String[] oPattern = {
            "  *** ",
            " * * ",
            " * * ",
            "  *** "
        };
        String[] pPattern = {
            " **** ",
            " * * ",
            " **** ",
            " * "
        };
        String[] sPattern = {
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        };

        // Create instances of the inner class
        CharacterPatternMap charO = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap charP = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap charS = new CharacterPatternMap('S', sPattern);

        // Store them in an array to represent "OOPS"
        CharacterPatternMap[] oopsBanner = { charO, charO, charP, charS };

        printHorizontalBanner(oopsBanner);
    }

    // Professional logic using StringBuilder and Getters
    public static void printHorizontalBanner(CharacterPatternMap[] bannerItems) {
        int rowCount = 5; // Adjust based on your tallest character pattern
        
        for (int i = 0; i < rowCount; i++) {
            StringBuilder sb = new StringBuilder();
            for (CharacterPatternMap item : bannerItems) {
                // Safely handle different pattern heights if necessary
                if (i < item.getPattern().length) {
                    sb.append(item.getPattern()[i]).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
