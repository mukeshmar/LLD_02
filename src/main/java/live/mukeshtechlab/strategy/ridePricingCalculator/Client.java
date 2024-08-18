package live.mukeshtechlab.strategy.ridePricingCalculator;

public class Client {
    public static void main(String[] args) {
        PricingManager pricingManager = new PricingManager();

        RideDetails r1 = new RideDetails(200.0, 24);

        System.out.println(pricingManager.calculateRidePrice(PricingType.DISTANCE_BASED, r1));
        System.out.println(pricingManager.calculateRidePrice(PricingType.TIME_BASED, r1));
        System.out.println(pricingManager.calculateRidePrice(PricingType.SURGE, r1));

    }
}
