package live.mukeshtechlab.strategy.ridePricingCalculator;

import live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy.PricingStrategy;

public class PricingManager {

    public Double calculateRidePrice(PricingType pricingType, RideDetails rideDetails){
        PricingStrategy pricingStrategy = PricingStrategyFactory.getPricingStrategy(pricingType);
        return pricingStrategy.calculateRidePrice(rideDetails);
    }

}
