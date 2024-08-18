package live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy;

import live.mukeshtechlab.strategy.videoQuality.Video;
import live.mukeshtechlab.strategy.videoQuality.VideoCodec;
import live.mukeshtechlab.strategy.videoQuality.VideoQuality;

public class HighQuality implements QualityAdjustmentStrategy {
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }

    @Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }
}
