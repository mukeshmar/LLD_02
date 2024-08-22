package live.mukeshtechlab.decorator.iceCream;

public class OrangeCone implements IceCream {
    @Override
    public Double getCost() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "OrangeCone";
    }
}
