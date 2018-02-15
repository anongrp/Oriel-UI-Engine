package grp.anon.ui.engine.parser;

import java.util.HashMap;
import java.util.List;

public class Element {
    private String element;
    private HashMap<String,String> props;
    private List<Element> childern;
    private Element parent;
    private String temp; // For Basic Temp data Holding
    private Integer fi,li; // For Basic Temp Index Storing

    Element(String element){
        this.element = element;
        assignProps();
    }

    public String getName(){
        return element;
    }

    private void assignProps(){

    }
}
