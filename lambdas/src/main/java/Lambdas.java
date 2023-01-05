import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

    private static List<String> texts;

    private static String t1 = "Otorrinolaringologista";
    private static String t2 = "Café";
    private static String t3 = "Computador";
    private static String t4 = "Xícara";
    private static String t5 = "Bolacha";

    public static void main(String[] args) {
        createArrayListOfTexts(t1,t2,t3);
        sortArrayListOfTextsInLine();
        printArrayListOfTexts();
        System.out.println();
        System.out.println("------------");
        System.out.println();
        createArrayListOfTexts(t5,t1,t4);
        sortArrayListOfTextsWithComparator();
        printArrayListOfTexts();
    }

    private static void createArrayListOfTexts(String o1, String o2, String o3) {
        texts = null;
        texts = new ArrayList<>(Arrays.asList(o1, o2, o3));
    }

    private static void sortArrayListOfTextsInLine() {
        texts.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
    }

    private static void sortArrayListOfTextsWithComparator() {
        Comparator<String> comparatorLength = (s1,s2) -> Integer.compare(s1.length(), s2.length());
        texts.sort(comparatorLength);
    }

    private static void printArrayListOfTexts() {
        texts.forEach(s -> System.out.println(s));
    }

}
