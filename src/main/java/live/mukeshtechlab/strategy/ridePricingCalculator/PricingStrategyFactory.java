package live.mukeshtechlab.strategy.ridePricingCalculator;

import live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy.DistancePricingStrategy;
import live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy.PricingStrategy;
import live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy.SurgePricingStrategy;
import live.mukeshtechlab.strategy.ridePricingCalculator.pricingStrategy.TimePricingStrategy;

public class PricingStrategyFactory {
    public static PricingStrategy getPricingStrategy(PricingType pricingType){
        if(pricingType.equals(PricingType.TIME_BASED)){
            return new TimePricingStrategy();
        }
        else if (pricingType.equals(PricingType.DISTANCE_BASED)){
            return new DistancePricingStrategy();
        }
        else if (pricingType.equals(PricingType.SURGE)){
            return new SurgePricingStrategy();
        }
        throw new IllegalArgumentException("Invalid pricing type");
    }
}
