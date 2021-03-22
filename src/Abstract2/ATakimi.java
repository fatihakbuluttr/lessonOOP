package Abstract2;

import java.util.ArrayList;

public class ATakimi extends BaseAbstractClass{
    @Override
    public ArrayList<Sporcu> getSporcular() {
        return getList();
    }
    private ArrayList<Sporcu> getList(){
        ArrayList<Sporcu> list=new ArrayList<>();
        list.add(new Sporcu("mehmet",30,5));
        list.add(new Sporcu("ali",35,7));
        list.add(new Sporcu("murat",41,7));
        return list;
    }
}
