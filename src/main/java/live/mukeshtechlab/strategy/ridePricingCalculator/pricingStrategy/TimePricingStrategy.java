package live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy;

import live.mukeshtechlab.strategy.ridePricingCalculator.PricingType;
import live.mukeshtechlab.strategy.ridePricingCalculator.RideDetails;

public class TimePricingStrategy implements PricingStrategy {

    private static final double BASE_FARE = 5.0; // Base fare amount
    private static final double PER_MINUTE_RATE = 0.5; // Rate per minute

    @Override
    public PricingType getPricingType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculateRidePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
