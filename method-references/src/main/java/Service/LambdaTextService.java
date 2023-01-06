package Service;

import Model.Text;
import Repository.TextRepository;

public class LambdaTextService implements TextService {

    private TextRepository repository;

    private Text text;

    public LambdaTextService() {
        this.repository = new TextRepository();
    }

    @Override
    public void start() {
        System.out.println("~~ Processando com Lambda ~~");
        this.text = this.repository.getText();
    }

    @Override
    public void order() {
        this.text.getLines().sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    @Override
    public void print() {
        this.text.getLines().forEach(line -> System.out.println(line));
    }
}
