public class Player {
    private final String username;
    private long highScore;

    public Player(String username) {
        this.username = username;
        this.highScore = Long.MAX_VALUE; // higher value means no score yet
    }

    public String getUserName() {
        return username;
    }

    public long getHighScore() {
        return highScore;
    }

    public void setHighScore(long newScore) {
        if (newScore < highScore) {
            this.highScore = newScore;
        }
    }

    @Override
    public String toString() {
        return "Player: " + username + ", High Score: " + highScore + " seconds";
    }
}
