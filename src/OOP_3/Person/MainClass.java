package OOP_3.Person;

public class MainClass {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.setName("Samuel");
        p1.setAge(24);

        Person p2=new Person("joel",36);
        Person p3=new Person("Lily",24);

        p1.compareAge(p2);
        p2.compareAge(p3);
        p1.compareAge(p3);

    }
}
