import Service.Enum.EnumService;
import Service.TextService;

public class Main {

    public static void main(String[] args) {
        TextService service = EnumService.ANONYMOUS.getService();
        TextProvider provider = new TextProvider(service);
        provider.process();
    }

}
