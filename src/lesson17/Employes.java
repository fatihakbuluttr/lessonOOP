package lesson17;

public class Employes extends Members{
    private String specialization;


    public Employes(String name, int age, int phoneNumber, String address, int salary) {
        super(name, age, phoneNumber, address, salary);
    }

    public Employes() {
        super();
    }
}
