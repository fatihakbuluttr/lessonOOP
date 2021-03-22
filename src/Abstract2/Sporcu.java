package Abstract2;

public class Sporcu {
    private String isim;
    private  int yas;
    private  double gunlukCalismaSaati;

    public Sporcu(String isim, int yas, double gunlukCalismaSaati) {
        this.isim = isim;
        this.yas = yas;
        this.gunlukCalismaSaati = gunlukCalismaSaati;
    }

    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }

    public double getGunlukCalismaSaati() {
        return gunlukCalismaSaati;
    }
}
