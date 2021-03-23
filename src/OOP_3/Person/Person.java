package OOP_3.Person;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void compareAge(Person person){
        int birinciYas=this.age;
        int ikinciYas=person.getAge();
        if(birinciYas>ikinciYas){
            System.out.println("I'm older than "+person.getName());
        }else if(birinciYas==ikinciYas){
            System.out.println(this.name+" and "+ person.getName()+ " are in the same age");
        }

        else {
            System.out.println(person.getName()+" is older than me");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

