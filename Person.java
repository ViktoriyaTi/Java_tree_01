public class Person implements Comparable<Person> {
    public String fullName;
    private int height;

    public Person(String fullName, int height) {
        this.fullName = fullName;
        this.height = height;
    }

    public String getFullName() {
        return fullName;
    }

    public int getHeight() {
        return height;
    }

    public int setHeight(int height) {
        return this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        return this.getHeight() - o.getHeight();
    }

}