public class AttemptTracker {
    private int guesses = 4;

    public int wrongGuess(){
        return guesses--;
    }

    public int getRemainingGuesses(){
        return guesses;
    }

    public boolean hasAttemptsLeft(){
        return guesses > 0; //True if guesses remain above 0
    }
}
