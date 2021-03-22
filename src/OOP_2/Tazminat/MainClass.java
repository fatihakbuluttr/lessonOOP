package OOP_2.Tazminat;

public class MainClass {
    public static void main(String[] args) {
        Mudur mudur = new Mudur();
        mudur.setIsim("Fatih");
        mudur.setDeneyimYili(20);
        int mudurtazminat = mudur.tazminatHesapla();
        int mudurizin = mudur.izinHesapla();

        Isci isci = new Isci();
        isci.setIsim("Kaan");
        isci.setDeneyimYili(20);

        int iscitazminat = isci.tazminatHesapla();
        int isciizin=isci.izinHesapla();

        System.out.println("müdür tazminat: " + mudurtazminat);
        System.out.println("İşçi tazminat: " + iscitazminat);
        System.out.println("müdür izin: "+mudurizin);
        System.out.println("işçi izin: "+isciizin);

    }

}
