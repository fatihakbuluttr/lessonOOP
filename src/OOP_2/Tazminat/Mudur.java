package OOP_2.Tazminat;

public class Mudur extends Personel{
    public Mudur(){
    }
    public int tazminatHesapla() {

    int maas=deneyimYili*100;
    return  maas;
    }

    @Override
    public int izinHesapla() {
        izinGunu=deneyimYili*10;
        return izinGunu;
    }
}
