package live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy;

import live.mukeshtechlab.strategy.ridePricingCalculator.PricingType;
import live.mukeshtechlab.strategy.ridePricingCalculator.RideDetails;

public class DistancePricingStrategy implements PricingStrategy {

    private static final double BASE_FARE = 5.0; // Base fare amount
    private static final double PER_KILOMETER_RATE = 2.0; // Rate per kilometer

    @Override
    public PricingType getPricingType() {
        return PricingType.DISTANCE_BASED;
    }

    @Override
    public Double calculateRidePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance();
    }
}
