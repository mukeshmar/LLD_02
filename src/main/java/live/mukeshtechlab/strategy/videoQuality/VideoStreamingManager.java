package live.mukeshtechlab.strategy.videoQuality;

import live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy.QualityAdjustmentStrategy;

public class VideoStreamingManager {
    private Video video;
    private QualityAdjustmentStrategy qualityAdjustmentStrategy;

    public VideoStreamingManager(Video video, QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.video = video;
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
    }

    public Video streamVideo() {
        return qualityAdjustmentStrategy.adjust(video);
    }
}