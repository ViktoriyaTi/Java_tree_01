import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Person irina = new Person("Ирина");
        Person vasya = new Person("Вася", 120);
        Person masha = new Person("Маша", 150);
        Person liza = new Person("Елизавета", 130);
        Person egor = new Person("Егор", 112);

        GeoTree gt = new GeoTree();
        // родитель - ребенок
        // gt.append(irina, vasya, Relationship.parent, Relationship.children);
        // gt.append(irina, masha, Relationship.parent, Relationship.children);
        // gt.append(irina, liza, Relationship.parent, Relationship.children);
        // gt.append(irina, egor, Relationship.parent, Relationship.children);
        // брат(сестра) - брат(сестра)
        gt.append(vasya, masha, Relationship.sibling, Relationship.sibling);
        gt.append(vasya, liza, Relationship.sibling, Relationship.sibling);
        gt.append(vasya, egor, Relationship.sibling, Relationship.sibling);
        gt.append(masha, liza, Relationship.sibling, Relationship.sibling);
        gt.append(masha, egor, Relationship.sibling, Relationship.sibling);
        gt.append(liza, egor, Relationship.sibling, Relationship.sibling);

        // Вывести на экран всех детей Ирины
        // System.out.println(new Reserch(gt).spend(irina,
        // Relationship.parent));

        // Вывести на экран всех братьев и сестер Маши
        System.out.println("Вывести на экран всех братьев и сестер Маши:");
        ArrayList<String> siblingMasha = new Reserch(gt).spend(masha, Relationship.sibling);
        System.out.println(siblingMasha);
        System.out.println();
        // Вывести на экран всех братьев и сестер Маши, чьи имена начинаются на Е
        System.out.println("Вывести на экран всех братьев и сестер Маши, чьи имена начинаются на Е: \n"
                + new Reserch(gt).getNameWhoseFirstLetterIsE(siblingMasha));
        System.out.println();
        gt.print("fileGeoTree.txt");
        gt.read("fileGeoTree.txt");

        System.out.println("Вывести на экран, кто выше из братьев и сестр Маши, чьи имена начинаются на Е:");
        if (egor.compareTo(liza) > 0) {
            System.out.println(egor.getFullName() + "выше ");
        } else
            System.out.println(liza.getFullName() + " выше ");

    }

}