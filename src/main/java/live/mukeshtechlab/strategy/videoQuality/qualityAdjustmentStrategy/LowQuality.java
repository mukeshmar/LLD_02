package live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy;

import live.mukeshtechlab.strategy.videoQuality.Video;
import live.mukeshtechlab.strategy.videoQuality.VideoCodec;
import live.mukeshtechlab.strategy.videoQuality.VideoQuality;

public class LowQuality implements QualityAdjustmentStrategy {
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @Override
    public Video adjust (Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }
}
