package OOP_1;

public class MainClass {
    public static void main(String[] args) {
        Arac bmw1=new Arac(2020,"red","BMV",100000);
        Arac bmw2=new Arac();
        bmw2.setModel(2021);
        bmw2.setRenk("grey");
        bmw2.setMarka("BMW");
        bmw2.setFiyat(120000);

        // bmw1'in bilgilerini alalim
        int bmw1_fiyat = bmw1.getFiyat();
        String bmw1_marka = bmw1.getMarka();
        int bmw1_model = bmw1.getModel();
        String bmw1_renk = bmw1.getRenk();





        DortIslem islem=new DortIslem();
        int a=islem.topla(16,10);
        System.out.println(a);

        System.out.println("------------------------");

        car araba1=new car(2000,"kırmızı");
        System.out.println(car.araba_sayisi);

        car araba2=new car(2020,"mavi");
        System.out.println(car.araba_sayisi);











    }
}
