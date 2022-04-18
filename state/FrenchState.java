package state;
/**
 * The french state class
 * @author Amjad Omer
 * @implements State
 */
import java.util.ArrayList;

public class FrenchState implements State{
    private MusicBox box;
    /**
     * initializes box to this state
     * @param box Music Box
     */
    public FrenchState(MusicBox box){
        this.box = box;
    }
    /**
     * sets songname and lyrics to twinkle twinkle in french
     * and plays the song
     */
    public void pressStarButton(){
        String songNameFS = "Brille Brille Petite étoile";
        ArrayList<String> lyricsFS = new ArrayList<String>();
        lyricsFS.add("Brille brille petite étoile");
        lyricsFS.add("Je me demande vraiment ce que tu es");
        lyricsFS.add("Au-dessus du monde si haut");
        lyricsFS.add("Comme un diamant dans le ciel");
        lyricsFS.add("Brille brille petite étoile");
        lyricsFS.add("Je me demande vraiment ce que tu es\n");
        box.playSong(songNameFS,lyricsFS);
    }
    /**
     * sets songname and lyrics to happy and you know it in french
     * and plays the song
     */
    public void pressHappyButton(){
        String songNameFH = "Si Tu as D' la Joie au Coeur";
        ArrayList<String> lyricsFH = new ArrayList<String>();
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        box.playSong(songNameFH,lyricsFH);
    }
    /**
     * changes state to english
     */
    public void pressEnglishButton(){
        box.setState(box.getEnglishState());
        System.out.println("Switching to English");
    }
    /**
     * prompts user that the state is already french
     */
    public void pressFrenchButton(){
        System.out.println("You are already in French");
    }
    /**
     * changes state to spanish
     */
    public void pressSpanishButton(){
        box.setState(box.getSpanishState());
        System.out.println("Switching to Spanish");
    }
}
