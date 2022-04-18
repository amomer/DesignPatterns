package state;
/**
 * The Music Box object class
 * @author Amjad Omer
 */
import java.util.ArrayList;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;
    /**
     * initialized states and defaulted english
     */
    public MusicBox(){
        System.out.println("Creating Our Music Box\nStarting up the Music Box");
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = getEnglishState();
    }
    /**
     * initializes pressing the star button
     */
    public void pressStarButton(){
        state.pressStarButton();
    }
    /**
     * initializes pressing the happy button
     */
    public void pressHappyButton(){
        state.pressHappyButton();
    }
    /**
     * initializes pressing the english button
     */
    public void pressEnglishButton(){
        state.pressEnglishButton();
    }
    /**
     * initializes pressing the french button
     */
    public void pressFrenchButton(){
        state.pressFrenchButton();
    }
    /**
     * initializes pressing the spanish button
     */
    public void pressSpanishButton(){
        state.pressSpanishButton();
    }
    /**
     * sets the current state of the music box
     * @param state to be changed to
     */
    public void setState(State state){
        this.state = state;
    }
    /**
     * getter for english
     * @return english state
     */
    public State getEnglishState(){
        return englishState;
    }
    /**
     * getter for french
     * @return french state
     */
    public State getFrenchState(){
        return frenchState;
    }
    /**
     * getter for spanish
     * @return spanish state
     */
    public State getSpanishState(){
        return spanishState;
    }
    /**
     * plays the chosen song's name and lyrics in the
     * language of the current state
     * @param songName string with song to be played
     * @param lyrics string arraylist with played song's lyrics
     */
    public void playSong(String songName, ArrayList<String> lyrics){
        System.out.println("\nPlaying: " + songName);
        for(int i=0;i<lyrics.size();i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        System.out.println(lyrics.get(i));
        }
    }
}
