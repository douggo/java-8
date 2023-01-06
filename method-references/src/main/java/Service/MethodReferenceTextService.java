package Service;

import Model.Text;
import Repository.TextRepository;

import java.util.Comparator;
import java.util.function.Function;

public class MethodReferenceTextService implements TextService {

    private TextRepository repository;

    private Text text;

    public MethodReferenceTextService() {
        this.repository = new TextRepository();
    }

    @Override
    public void start() {
        System.out.println("~~ Processando com Method Reference ~~");
        this.text = this.repository.getText();
    }

    @Override
    public void order() {
        Function<String, Integer> compareFunction = line -> line.length();
        Comparator<String> comparator = Comparator.comparing(compareFunction);
        this.text.getLines().sort(comparator);
    }

    public void order2() {
        this.text.getLines().sort(Comparator.comparing(line -> line.length()));
    }

    @Override
    public void print() {
        this.text.getLines().forEach(line -> System.out.println(line));
    }
}
