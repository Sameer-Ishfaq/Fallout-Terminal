import java.util.Random;

public class WordGenerator {



    private final String[] words ={
            "TARGET",
            "BROKEN",
            "PLANET",
            "MARKET",
            "TRAVEL",
            "CASTLE",
            "DOCTOR",
            "MEMORY",
            "FUTURE",
            "ENGINE",
            "SILVER",
            "HUNTER",
            "EDITOR",
            "CHANCE",
            "PUZZLE",
            "PYTHON",
//            "POLICE",
//            "GARDEN",
//            "POCKET",
//            "VICTOR"
    };
    private final Random rand = new Random();


    public String getRandomWord(){
        return words[rand.nextInt(words.length)]; //get a random word via an element of the array
    }
    public String[] getWords(){
        return words;
    } //getter
}
