public class Game {

    private final WordGenerator wordGenerator = new WordGenerator();
    private final HackingLogic hackingLogic = new HackingLogic();
    private final AttemptTracker attemptTracker = new AttemptTracker();
    private final Terminal_UI terminal_ui = new Terminal_UI();

    /*VALIDATION CHECK
    -User wins if the password is guessed
    -Wrong guess reduces the number of guesses.
    -User is penalised for different types of guesses including the right type of guess i.e, empty input, words smaller / longer than the password,
     and alphanumerical combinations.
     */

    public void start(){
        String password = wordGenerator.getRandomWord();

        terminal_ui.displayHeader();
        terminal_ui.displayWords(wordGenerator.getWords()); //display each word

        while(attemptTracker.hasAttemptsLeft()){

            terminal_ui.displayAttempts(attemptTracker.getRemainingGuesses()); //get current guesses
            System.out.print("PASSWORD: ");
            String guess = terminal_ui.getGuess(); //get the user's guess. Input will be turned into uppercase.

            //guess.length() != password.length() ||

            if(!guess.equals(password)){
                attemptTracker.wrongGuess();
            }

            if(guess.equals(password)){ //While loop wasn't executing due to semicolon being put on line 23. Fixed
                terminal_ui.successfullGuess();
                return;
            }
            int likeness = hackingLogic.calculateLikeness(password, guess); //Likeness wasn't appearing as variable wasn't being used. Fixed by implementing in terminal_UI
            terminal_ui.displayLikeness(likeness);


        }
        terminal_ui.failedAttempt();
        System.out.println("PASSWORD WAS: " + password);
    }

}
