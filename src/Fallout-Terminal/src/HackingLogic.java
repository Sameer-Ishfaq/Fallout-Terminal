public class HackingLogic {
        private WordGenerator wordGenerator = new WordGenerator();
        private Terminal_UI terminal_ui = new Terminal_UI();
        private AttemptTracker attemptTracker = new AttemptTracker();


    public int calculateLikeness(String password, String guess){
        int count = 0;
        //gets and checks each character of the user's guess and the password
        for(int i = 0; i <password.length(); i++){
            if(password.charAt(i) == guess.charAt(i)){
                count++; //Any matching character will increase the count simulating the likeness
            }
        }
        return count;
    }
    public void errorMitigation(){

    }
}
