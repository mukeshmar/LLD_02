package live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy;

import live.mukeshtechlab.strategy.ridePricingCalculator.PricingType;
import live.mukeshtechlab.strategy.ridePricingCalculator.RideDetails;

public interface PricingStrategy {
    public PricingType getPricingType();
    public Double calculateRidePrice(RideDetails rideDetails);
}
