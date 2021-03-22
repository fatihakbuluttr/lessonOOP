package Abstract1;

public abstract class CalisanSinif {
    public static final String UNIVERSITE="ünversite";
    public static final String YUKSEKOKUL="yüksek okul";
    public static final String LISE="lise";

    private String isim;
    private int deneyimYili;

    public int getMaas(){
        int uniKatsayi=1;
        switch (getMezuniyet()){
            case UNIVERSITE:
                uniKatsayi=4;
                break;
            case YUKSEKOKUL:
                uniKatsayi=2;
                break;
            case LISE:
                uniKatsayi=1;
                break;
        }
        int yabanciDil;
        if(getYabanciDil()){
            yabanciDil=3;
        }else {
            yabanciDil=1;
        }
        int deneyimYili=getDeneyimYili();
         int maas=100*uniKatsayi*yabanciDil*deneyimYili;
         return  maas;
    }

    public abstract boolean getYabanciDil();
    public abstract String  getMezuniyet();
    public abstract int getDeneyimYili();



}
