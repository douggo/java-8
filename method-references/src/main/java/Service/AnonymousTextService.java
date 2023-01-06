package Service;

import Model.Text;
import Repository.TextRepository;

import java.util.Comparator;
import java.util.function.Consumer;

public class AnonymousTextService implements TextService {

    private TextRepository repository;

    private Text text;

    public AnonymousTextService() {
        this.repository = new TextRepository();
    }

    @Override
    public void start() {
        System.out.println("~~ Processando com Classes Anônimas ~~");
        this.text = this.repository.getText();
    }

    @Override
    public void order() {
        this.text.getLines().sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
    }

    @Override
    public void print() {
        this.text.getLines().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

}
