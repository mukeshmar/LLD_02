package live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy;

import live.mukeshtechlab.strategy.videoQuality.Video;
import live.mukeshtechlab.strategy.videoQuality.VideoCodec;
import live.mukeshtechlab.strategy.videoQuality.VideoQuality;

public class MediumQuality implements QualityAdjustmentStrategy {
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
}
