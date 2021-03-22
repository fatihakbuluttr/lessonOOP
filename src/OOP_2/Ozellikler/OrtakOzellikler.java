package OOP_2.Ozellikler;

public class OrtakOzellikler {
    private  String  ad;
    private  String  soyad;
    private  int  yas;
    private  int  telno;

    public OrtakOzellikler (String ad,String soyad,int yas,int telno){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.telno=telno;
    }


    public void yazdir(){
        System.out.println("Ad: "+this.ad);
        System.out.println("soyad: "+this.soyad);
        System.out.println("yas: "+this.yas);
        System.out.println("telno: "+this.telno);
    }
}
