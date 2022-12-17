import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

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
        ArrayList<String> resultList = new ArrayList<>();
        for (String name : result) {
            if (name.startsWith("Е")) {
                resultList.add(name);
            }
        }
        return resultList;
    }

}