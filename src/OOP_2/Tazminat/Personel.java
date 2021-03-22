package OOP_2.Tazminat;

public class Personel {
    String isim;
    int deneyimYili;
    int izinGunu;

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setDeneyimYili(int deneyimYili) {
        this.deneyimYili = deneyimYili;
    }

    public int izinHesapla(){
        izinGunu=deneyimYili*5;
        return izinGunu;

    }
}
