package Abstract2;

public class MainClass {
    public static void main(String[] args) {
        ATakimi aTakimi=new ATakimi();
        double aTakimiCalismaSaati= aTakimi.ortalamaCalismaSaati();
        System.out.println("aTakimiCalismaSaati: "+aTakimiCalismaSaati);

        BTakimi bTakimi=new BTakimi();
        double bTakimiCalismaSaati= bTakimi.ortalamaCalismaSaati();
        System.out.println("bTakimiCalismaSaati: "+bTakimiCalismaSaati);
    }


}
