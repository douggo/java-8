import Service.Enum.EnumService;
import Service.TextService;

public class Main {

    public static void main(String[] args) {
        TextService service = EnumService.ABSTRACT_METHOD_REFERENCE.getService();
        TextProvider provider = new TextProvider(service);
        provider.process();
    }

}
