package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Text {

    private List<String> lines;

    public Text(List<String> lines) {
        this.lines = lines;
    }

    public List<String> getLines() {
        return this.lines;
    }
}
