
public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person liza = new Person("Елизавета");
        Person egor = new Person("Егор");
        // Person jane = new Person("Женя");
        // Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(irina, liza);
        gt.append(irina, egor);
        // gt.append(vasya, jane);
        // gt.append(vasya, ivan);
        gt.appendSibling(vasya, masha);
        gt.appendSibling(vasya, liza);
        gt.appendSibling(vasya, egor);
        gt.appendSibling(masha, liza);
        gt.appendSibling(masha, egor);
        gt.appendSibling(liza, egor);

        // Вывести на экран всех детей Ирины
        // System.out.println(new Reserch(gt).spend(irina,
        // Relationship.parent));

        // Вывести на экран всех братьев и сестер Маши
        System.out.println("Вывести на экран всех братьев и сестер Маши:");
        var a = new Reserch(gt).spend(masha, Relationship.sibling);
        System.out.println(a);
        System.out.println("");
        System.out.println("Вывести на экран всех братьев и сестер Маши, чьи имена начинаются на Е: \n"
                + new Reserch(gt).getNameWhoseFirstLetterIsE(a));

    }

}