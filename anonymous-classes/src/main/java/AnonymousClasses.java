import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class AnonymousClasses {

    private static List<String> texts;

    public static void main(String[] args) {
        createArrayListOfTexts();
        sortArrayOfTexts();
        printArrayOfTexts();
    }

    private static void createArrayListOfTexts() {
        texts = null;
        texts = new ArrayList<>(Arrays.asList("Otorrinolaringologista", "Café", "Computador"));
    }

    private static void sortArrayOfTexts() {
        texts.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length()) {
                    return -1;
                }
                if (s1.length() > s2.length()) {
                    return 1;
                }
                return 0;
            }
        });
    }

    private static void printArrayOfTexts() {
        texts.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

}
