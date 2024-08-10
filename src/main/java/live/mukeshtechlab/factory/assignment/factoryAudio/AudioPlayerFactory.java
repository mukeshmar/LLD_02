package live.mukeshtechlab.factory.assignment.factoryAudio;

public class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(MediaFormat playerType, int volume, double playBackRate){
        if(playerType.equals(MediaFormat.FLAC)){
            return new FLACPlayer(volume, playBackRate);
        }
        else if (playerType.equals(MediaFormat.MP3)){
            return new MP3Player(volume, playBackRate);
        }
        else if (playerType.equals(MediaFormat.WAV)){
            return new WAVPlayer(volume, playBackRate);
        }
        return null;
    }
}