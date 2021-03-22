package Abstract2;

import java.util.ArrayList;

public abstract class BaseAbstractClass {

    public double ortalamaCalismaSaati(){
        ArrayList<Sporcu> list=getSporcular();
        double toplamCalismaSaati=0;
        for(Sporcu sporcu:list){
            toplamCalismaSaati+=sporcu.getGunlukCalismaSaati();
        }
        double ortalama=toplamCalismaSaati/list.size();
        return ortalama;
    }

    public abstract ArrayList<Sporcu> getSporcular();
}
