package grp.anon.ui.engine.parser;

import java.util.HashMap;
import java.util.List;

public class Element {
    private String element;
    private HashMap<String,String> props;
    private List<Element> childern;
    private Element parent;
}
