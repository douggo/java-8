package Repository;

import Model.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class TextRepository {

    private Text text;

    public Text getText() {
        return new Text(new ArrayList<>(
            Arrays.asList(
                "Café",
                "Otorrinolaringologista",
                "Apelido",
                "Computador",
                "Duodenopancreatectômico",
                "Toalha",
                "Rio"
            )
        ));
    }

}
