public class BannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", "                                      ", "*"),
                String.join("", "*", "     WELCOME TO OOPS BANNER APP      ", "*"),
                String.join("", "*", "                                      ", "*"),
                String.join("", "*", "        UC5 - ARRAY INITIALISATION   ", "*"),
                String.join("", "*", "                                      ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}