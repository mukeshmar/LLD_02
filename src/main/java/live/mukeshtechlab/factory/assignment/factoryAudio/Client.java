package live.mukeshtechlab.factory.assignment.factoryAudio;

public class Client {
    public static void main(String[] args) {
        AudioPlayer player = AudioPlayerFactory.createAudioPlayer(MediaFormat.MP3, 25, 1.0);
        player.play();
        player.pause();
        player.stop();
        System.out.println(player.getVolume());
        System.out.println(player.supportsType());
        player.setVolume(50);
        System.out.println(player.getVolume());
        player.getPlayBackRate();
    }
}
