package grp.anon.ui.engine.parser;

import java.io.*;
import java.util.ArrayList;

public class Document {
    private File docFile;
    private Element root;
    private ArrayList<String> usings;
    private String temp; // For Basic Temp data Holding
    private Integer fi,li; // For Basic Temp Index Storing


    public Document(File file) throws IOException {
        this.docFile = file;
        usings = new ArrayList<>();
        assignRoot();
    }

    public ArrayList<String> getUsings() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(docFile));
        while (!(temp = reader.readLine()).contains("commander")){
            if (temp.contains("Using") && temp.contains(">") && temp.length() > 9){
                fi = temp.indexOf(" ");
                li = temp.indexOf(",");
                while (li != -1){
                    usings.add(temp.substring(fi,li).trim());
                    fi = li+1;
                    li = temp.indexOf(",",fi);
                }
                li = temp.indexOf("?",fi);
                usings.add(temp.substring(fi,li).trim());
            }
        }

        reader.close();
        return usings;
    }

    private void assignRoot() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(docFile));
        while (!(temp = reader.readLine()).contains("commander")){
            // egnored because it will assign root tag to temp variable and we want this
        }
        temp = temp.substring(temp.indexOf("<")+1,temp.indexOf(" ")).trim();
        root = new Element(temp);
    }

    public Element getRoot(){
        return root;
    }
}
