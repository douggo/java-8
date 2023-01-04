import java.util.*;
import java.util.function.Consumer;

public class DefaultMethods {

    private static List<String> texts;

    public static void main(String[] args) {
        orderArrayListOldWayAlphabetically();
        System.out.println();
        orderArrayListOldWay();
        System.out.println();
        orderArrayListNewWay();
        System.out.println();
        System.out.println();
        iteratingArrayListOldWay();
        System.out.println();
        iteratingArrayListNewWay();
    }

    private static void createArrayListOfTexts() {
        texts = null;
        texts = new ArrayList<>(Arrays.asList(
                "Otorrinolaringologista",
                "Café",
                "Computador"
        ));
    }

    private static void orderArrayListOldWayAlphabetically() {
        createArrayListOfTexts();
        System.out.println("---Ordenando o ArrayList de textos em ORDEM ALFABÉTICA:");

        System.out.println("Original:");
        System.out.println(texts);

        Collections.sort(texts);

        System.out.println("Atual");
        System.out.println(texts);
    }

    private static void orderArrayListOldWay() {
        createArrayListOfTexts();
        texts.add("Teste");
        Comparator<String> comparator = new ComparatorString();

        System.out.println("---Ordenando o ArrayList de textos do jeito antigo---");

        System.out.println("Original:");
        System.out.println(texts);

        Collections.sort(texts, comparator);

        System.out.println("Atual:");
        System.out.println(texts);
    }

    private static void orderArrayListNewWay() {
        createArrayListOfTexts();
        Comparator<String> comparator = new ComparatorString();

        System.out.println("---Ordenando o ArrayList de textos do jeito novo---");

        System.out.println("Original:");
        System.out.println(texts);

        texts.sort(comparator);

        System.out.println("Atual:");
        System.out.println(texts);
    }

    private static void iteratingArrayListOldWay() {
        System.out.println("Iterando um ArrayList da forma antiga:");
        for (String text : texts) {
            System.out.println(text);
        }
    }

    private static void iteratingArrayListNewWay() {
        System.out.println("Iterando um ArrayList da forma nova:");
        Consumer<String> consumerString = new ConsumerString();
        texts.forEach(consumerString);
    }

}
