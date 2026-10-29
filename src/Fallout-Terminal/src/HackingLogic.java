public class HackingLogic {
        private WordGenerator wordGenerator = new WordGenerator();
        private Terminal_UI terminal_ui = new Terminal_UI();
        private AttemptTracker attemptTracker = new AttemptTracker();


    public int calculateLikeness(String password, String guess){
        int likeness = 0;

        int limit = Math.min(password.length(), guess.length()); //limi
        //gets and checks each character of the user's guess and the password
        for(int i = 0; i < limit; i++){
            if(password.charAt(i) == guess.charAt(i)){
                likeness++; //Any matching character will increase the count simulating the likeness
            }
        }
        return likeness;
    }
    public void errorMitigation(){

    }
}
