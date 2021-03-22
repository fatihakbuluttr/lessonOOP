package OOP_2.Ozellikler;

public class Yonetici extends OrtakOzellikler{
private  String spor="Atletizm";

public Yonetici(String ad,String soyad,int yas,int telno,String spor){
    super(ad,soyad,yas,telno);
    this.spor=spor;
}
public void projeBaslat(String baslat){
    System.out.println("Yeni proje durumu: "+baslat);
}

}
