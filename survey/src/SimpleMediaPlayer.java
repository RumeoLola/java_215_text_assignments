public class SimpleMediaPlayer implements MediaPlayer {
    private String currentSong;
    private String status;

    // Constructor
    public SimpleMediaPlayer() {
        this.currentSong = "";
        this.status = "idle";
    }

    // Getter for currentSong
    public String getCurrentSong() {
        return currentSong;
    }

    // Setter for currentSong
    public void setCurrentSong(String songName) {
        this.currentSong = songName;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Implementation of play method
    @Override
    public void play(String songName) {
        setCurrentSong(songName);
        status = "playing";
    }

    // Implementation of pause method
    @Override
    public void pause() {
        if (!currentSong.isEmpty()) {
            status = "paused";
        }
    }

    // Implementation of stop method
    @Override
    public void stop() {
        if (!currentSong.isEmpty()) {
            status = "idle";
            currentSong = "";
        }
    }

    // Implementation of displayStatus method
    @Override
    public String displayStatus() {
        if (!currentSong.isEmpty() && status.equals("playing")) {
            return "Currently playing: " + currentSong;
        } else {
            return "Media player is " + status;
        }
    }
}