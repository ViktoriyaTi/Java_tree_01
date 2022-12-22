import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class Reserch implements Printable {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultList = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> getNameWhoseFirstLetterIsE(ArrayList<String> result) {
        // Вывести братьев и сестер Маши,чьи имена начинаются на букву Е
        for (String name : result) {
            if (name.startsWith("Е")) {
                resultList.add(name);
            }
        }
        print("fileSiblingMashaWhoseNameFirstLetterE.txt");
        return resultList;
    }

    @Override
    public void print(String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(resultList.toString());
            fw.flush();
            fw.close();
            System.out.println("Информация в файл внесена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}