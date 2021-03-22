package OOP_1;

public class Arac {

    private int model;
    private String renk;
    private String marka;
    private int fiyat;

    public Arac(int model, String renk, String marka, int fiyat) {
        this.model = model;
        this.renk = renk;
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public Arac() {
    }
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
