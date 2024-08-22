package live.mukeshtechlab.decorator.iceCream;

public class ChocoCone implements IceCream{
    @Override
    public Double getCost() {
        return 40.0;
    }

    @Override
    public String getDescription() {
        return "Choco Cone";
    }
}
