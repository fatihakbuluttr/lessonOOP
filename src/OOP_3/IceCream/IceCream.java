package OOP_3.IceCream;

public class IceCream {
    private String flavors;
    private int numSprinkless;

    public IceCream(String flavors, int numSprinkless) {
        this.flavors = flavors;
        this.numSprinkless = numSprinkless;
    }
    public int getValue(){
        int sweetnessValue=0;
        switch (this.getFlavors()){
            case "Plain":sweetnessValue=0;break;
            case "Vanilla":
            case "ChocolateChip":sweetnessValue=5;break;
            case "Strawberry":
            case "Chocolate":sweetnessValue=10;break;
        }
        return sweetnessValue+this.numSprinkless;
    }

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    public int getNumSprinkless() {
        return numSprinkless;
    }

    public void setNumSprinkless(int numSprinkless) {
        this.numSprinkless = numSprinkless;
    }
}
