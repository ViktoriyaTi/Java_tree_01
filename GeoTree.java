import java.util.ArrayList;


public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));

    }

    // personOne and personTwo - brothers or sisters
    public void appendSibling(Person personX, Person personY) {
        tree.add(new Node(personX, Relationship.sibling, personY));
        tree.add(new Node(personY, Relationship.sibling, personX));
    }

}