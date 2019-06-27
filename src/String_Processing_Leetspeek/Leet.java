package String_Processing_Leetspeek;

public class Leet {

    public static String toLeet(String normal) {

        normal = normal.replaceAll("elite", "1337");
        normal = normal.replaceAll("cool", "k3wl");
        normal = normal.replaceAll("!", "!!!11");
        normal = normal.replaceAll("ck", "xx");
        normal = normal.replaceAll("ers", "0rz");
        normal = normal.replaceAll("er", "0rz");
        normal = normal.replaceAll("en", "n");
        normal = normal.replaceAll("e", "3");
        normal = normal.replaceAll("t", "7");
        normal = normal.replaceAll("o", "0");
        normal = normal.replaceAll("a", "@");

        return normal;

        }

    public static String[] allToLeet(String[] normals) {

        String[] leets = new String[normals.length];

        for (int i = 0; i < normals.length; i++) {

            String leet = toLeet(normals[i]);
            leets[i] = leet;
        }

        return leets;
    }
}
