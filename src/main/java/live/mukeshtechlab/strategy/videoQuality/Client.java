package live.mukeshtechlab.strategy.videoQuality;

import live.mukeshtechlab.strategy.videoQuality.qualityAdjustmentStrategy.QualityAdjustmentStrategy;

public class Client {
    public static void main(String[] args) {
        // Create a new Video object with a URL, LOW quality, and 5000 kbps bitrate
        Video video = new Video(
                "https://example.com/video.mp4", // videoUrl
                VideoQuality.LOW // initial videoQuality
        );
        video.setBitrate(5000); // set initial bitrate to 5000 kbps

        System.out.println(video.getBitrate()); // print initial bitrate

        // Get a QualityAdjustmentStrategy based on the desired video quality (HIGH)
        QualityAdjustmentStrategy qualityAdjustmentStrategy = QualityAdjustmentStrategyFactory.
                getQualityAdjustmentStrategy(VideoQuality.HIGH);

        // Create a VideoStreamingManager with the video and quality adjustment strategy
        VideoStreamingManager videoStreamingManager = new VideoStreamingManager(
                video, qualityAdjustmentStrategy
        );

        // Stream the video using the video streaming manager
        videoStreamingManager.streamVideo();

        // Print the updated bitrate after streaming (may have changed due to quality adjustment)
        System.out.println(video.getBitrate());
    }
}