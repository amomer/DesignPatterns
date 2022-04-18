package state;
/**
 * The spanish state class
 * @author Amjad Omer
 * @implements State
 */
import java.util.ArrayList;

public class SpanishState implements State{
    private MusicBox box;
    /**
     * initializes box to this state
     * @param box Music Box
     */
    public SpanishState(MusicBox box){
        this.box = box;
    }
    /**
     * sets songname and lyrics to twinkle twinkle in spanish
     * and plays the song
     */
    public void pressStarButton(){
        String songNameSS = "Brilla Brilla Pequeña Estrella";
        ArrayList<String> lyricsSS = new ArrayList<String>();
        lyricsSS.add("Brilla brilla pequeña estrella");
        lyricsSS.add("Cómo me pregunto lo que eres");
        lyricsSS.add("Por encima del mundo tan arriba");
        lyricsSS.add("Como un diamante en el cielo");
        lyricsSS.add("Brilla brilla pequeña estrella");
        lyricsSS.add("Cómo me pregunto lo que eres\n");
        box.playSong(songNameSS,lyricsSS);
    }
    /**
     * sets songname and lyrics to happy and you know it in spanish
     * and plays the song
     */
    public void pressHappyButton(){
        String songNameSH = "Si estás contento y lo sabes";
        ArrayList<String> lyricsSH = new ArrayList<String>();
        lyricsSH.add("Si eres feliz y lo sabes, aplaude");
        lyricsSH.add("Si eres feliz y lo sabes, aplaude");
        lyricsSH.add("Si eres feliz y lo sabes, aplaude");
        lyricsSH.add("Si eres feliz y lo sabes, aplaude\n");
        box.playSong(songNameSH,lyricsSH);
    }
    /**
     * changes state to english
     */
    public void pressEnglishButton(){
        box.setState(box.getEnglishState());
        System.out.println("Switching to English");
    }
    /**
     * changes state to french
     */
    public void pressFrenchButton(){
        box.setState(box.getFrenchState());
        System.out.println("Switching to French");
    }
    /**
     * prompts user that the state is already spanish
     */
    public void pressSpanishButton(){
        System.out.println("You are already in Spanish");
    }
}
