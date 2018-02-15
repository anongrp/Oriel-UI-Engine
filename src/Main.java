import grp.anon.ui.engine.parser.Document;
import grp.anon.ui.engine.parser.Element;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("ui.xml");
        Document document = new Document(file);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String data;
        /*while ((data = reader.readLine()) != null){
            System.out.println(data);
        }*/

        Element root = document.getRoot();
        System.out.println(root);
    }
}
