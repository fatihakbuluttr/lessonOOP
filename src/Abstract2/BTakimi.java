package Abstract2;

import java.util.ArrayList;

public class BTakimi extends BaseAbstractClass{
    @Override
    public ArrayList<Sporcu> getSporcular() {
        return getList();
    }
    private ArrayList<Sporcu> getList(){
        ArrayList<Sporcu> list=new ArrayList<>();
        list.add(new Sporcu("veli",22,8));
        list.add(new Sporcu("vedat",34,3));
        list.add(new Sporcu("vasfi",39,5));
        return list;
    }

}
