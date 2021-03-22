package OOP_1;

public class car {
    private int model;
    private String renk;
    public static int araba_sayisi;

    public car(int _model, String _renk) {
        this.model = _model;
        renk = _renk;
        this.araba_sayisi++;
    }

}
