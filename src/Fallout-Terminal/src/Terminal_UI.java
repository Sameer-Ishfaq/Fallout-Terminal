import java.util.Scanner;

public class Terminal_UI {
    private final Scanner scanner = new Scanner(System.in);
    private final WordGenerator wordGenerator = new WordGenerator();

    public void displayWords(String[] words){
        for(String word: words){
            System.out.println(word); //Print out each word
        }
        System.out.println();
    }

    public void displayHeader(){
        System.out.println("======================================");
        System.out.println("ROBCO INDUSTRIES (TM) TERMLINK PROTOCOL\nENTER PASSWORD NOW");
        System.out.println("======================================");
    }

    public String getGuess(){
        // System.out.println("PASSWORD: ");
        return scanner.nextLine().toUpperCase(); //User doesn't need to type uppercase. Already done for them
    }
    public void displayLikeness(int likeness){
        System.out.println(">ACCESS DENIED    " + ">LIKENESS: " + likeness + "/" + wordGenerator.getRandomWord().length()); //gets x/6
    }

    public void displayAttempts(int attempts) {
        System.out.println(">ATTEMPTS REMAINING: " + attempts);
    }

    public void successfullGuess(){
        System.out.println("ACCESS GRANTED\n+35XP");
    }
    public void failedAttempt(){
        System.out.println("TERMINAL LOCKED\nPLEASE CONTACT AN ADMINISTRATOR");
    }

}
