package ocp.collections.immutable;

public class ImmutableCollectionMain {

    public static void main(String[] args) {

        Student student = new Student("Fulano");
        student.add(new Course("Java II"));
        student.add(new Course("Java III"));

        System.out.println(student);

    }
}
