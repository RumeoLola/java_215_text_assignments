public interface MediaPlayer {
    // Plays the media file
    void play(String songName);

    // Pauses the currently playing media
    void pause();

    // Stops the media playback
    void stop();

    // Shows information about the current status
    String displayStatus();
}