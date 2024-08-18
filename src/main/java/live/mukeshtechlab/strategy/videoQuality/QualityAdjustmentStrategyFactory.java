package live.mukeshtechlab.strategy.videoQuality;

import live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy.HighQuality;
import live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy.LowQuality;
import live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy.MediumQuality;
import live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy.QualityAdjustmentStrategy;

public class QualityAdjustmentStrategyFactory {
    public static QualityAdjustmentStrategy getQualityAdjustmentStrategy(VideoQuality videoQuality){
        if(videoQuality.equals(VideoQuality.LOW)){
            return new LowQuality();
        }
        else if(videoQuality.equals(VideoQuality.MEDIUM)){
            return new MediumQuality();
        }
        else if (videoQuality.equals(VideoQuality.HIGH)){
            return new HighQuality();
        }
        throw new IllegalArgumentException("Unsupported video quality!");
    }
}
