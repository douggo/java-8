package Service;

import Model.Text;
import Repository.TextRepository;

import java.util.Comparator; /* Usando o Comparator.comparing() */

import static java.util.Comparator.comparing; /* Usando apenas o comparing()  */

public class AbstractMethodReferenceTextService implements TextService {

    private TextRepository repository;

    private Text text;

    public AbstractMethodReferenceTextService() {
        this.repository = new TextRepository();
    }

    @Override
    public void start() {
        System.out.println("~~ Processando com Method Reference Abstrato ~~");
        this.text = this.repository.getText();
    }

    @Override
    public void order() {
        this.text.getLines().sort(Comparator.comparing(String::length));
        //this.text.getLines().sort(comparing(String::length));
    }

    @Override
    public void print() {
        this.text.getLines().forEach(System.out::println);
    }

}
