import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GeoTree implements Printable, Readable {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Person p2, Relationship reOne, Relationship reTwo) {
        tree.add(new Node(p1, reOne, p2));
        tree.add(new Node(p2, reTwo, p1));

    }

    @Override
    public void print(String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(tree.toString());
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void read(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}