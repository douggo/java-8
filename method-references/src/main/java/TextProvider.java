import Repository.TextRepository;
import Service.*;

public class TextProvider {

    private TextService service;

    public TextProvider(TextService service) {
        this.service = service;
    }

    public void process() {
        this.service.start();
        this.pulaLinha();
        this.imprimeMensagem("1. Ordem Original");
        this.service.print();
        this.pulaLinha();
        this.imprimeMensagem("2. Realizando Ordenação...");
        this.service.order();
        this.imprimeMensagem("Ordenação completa");
        this.pulaLinha();
        this.imprimeMensagem("3. Ordem Nova");
        this.service.print();
    }

    private void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    private void pulaLinha() {
        this.imprimeMensagem("");
    }


}
