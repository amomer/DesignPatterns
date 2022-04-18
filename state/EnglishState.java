package state;
/**
 * The english state class
 * @author Amjad Omer
 * @implements State
 */
import java.util.ArrayList;

public class EnglishState implements State{
    private MusicBox box;
    /**
     * initializes box to this state
     * @param box Music Box
     */
    public EnglishState(MusicBox box){
        this.box = box;
    }
    /**
     * sets songname and lyrics to twinkle twinkle in english
     * and plays the song
     */
    public void pressStarButton(){
        String songNameES = "Twinkle Twinkle Little Star";
        ArrayList<String> lyricsES = new ArrayList<String>();
        lyricsES.add("Twinkle twinkle little star");
        lyricsES.add("How I wonder what you are");
        lyricsES.add("Up above the world so high");
        lyricsES.add("Like a diamond in the sky");
        lyricsES.add("Twinkle twinkle little star");
        lyricsES.add("How I wonder what you are\n");
        box.playSong(songNameES,lyricsES);
    }
    /**
     * sets songname and lyrics to happy and you know it in english
     * and plays the song
     */
    public void pressHappyButton(){
        String songNameEH = "If You're Happy and you Know it";
        ArrayList<String> lyricsEH = new ArrayList<String>();
        lyricsEH.add("If you're happy and you know it, clap your hands");
        lyricsEH.add("If you're happy and you know it, clap your hands");
        lyricsEH.add("If you're happy and you know it, clap your hands");
        lyricsEH.add("If you're happy and you know it, clap your hands\n");
        box.playSong(songNameEH,lyricsEH);
    }
    /**
     * prompts user that the state is already english
     */
    public void pressEnglishButton(){
        System.out.println("You are already in English");
    }
    /**
     * changes states to french
     */
    public void pressFrenchButton(){
        box.setState(box.getFrenchState());
        System.out.println("Switching to French");
    }
    /**
     * changes state to spanish
     */
    public void pressSpanishButton(){
        box.setState(box.getSpanishState());
        System.out.println("Switching to Spanish");
    }
}
