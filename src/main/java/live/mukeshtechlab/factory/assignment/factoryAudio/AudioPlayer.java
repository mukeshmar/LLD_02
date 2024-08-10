package live.mukeshtechlab.factory.assignment.factoryAudio;

public abstract class AudioPlayer {
    protected int volume;
    protected double playBackRate;

    // Constructor
    public AudioPlayer(int volume, double playBackRate){
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    // Abstract methods for the AudioPlayer class
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract MediaFormat supportsType();


    // Setter
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Invalid volume level");
        }
    }

    // Getter
    public int getVolume() {
        return volume;
    }
    public double getPlayBackRate() {
        return playBackRate;
    }

}