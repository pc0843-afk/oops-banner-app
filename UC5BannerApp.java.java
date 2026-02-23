public class UC5BannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in single statement using String.join()
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*"),
                String.join("", "*", "   ", "*"),
                String.join("", "*", "   ", "*"),
                String.join("", "*", "*", "*", "*", "*"),
                String.join("", "*", "   ", "*"),
                String.join("", "*", "   ", "*"),
                String.join("", "*", "   ", "*")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}