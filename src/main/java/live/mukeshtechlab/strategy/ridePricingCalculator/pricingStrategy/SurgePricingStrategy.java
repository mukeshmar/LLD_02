package live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy;

import live.mukeshtechlab.strategy.ridePricingCalculator.PricingType;
import live.mukeshtechlab.strategy.ridePricingCalculator.RideDetails;

public class SurgePricingStrategy implements PricingStrategy {

    private static final double BASE_FARE = 5.0; // Base fare amount
    private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier


    @Override
    public PricingType getPricingType() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculateRidePrice(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
