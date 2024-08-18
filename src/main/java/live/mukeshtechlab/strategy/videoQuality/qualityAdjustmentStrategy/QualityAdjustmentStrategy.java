package live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy;

import live.mukeshtechlab.strategy.videoQuality.Video;
import live.mukeshtechlab.strategy.videoQuality.VideoQuality;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();
    Video adjust(Video video);
}