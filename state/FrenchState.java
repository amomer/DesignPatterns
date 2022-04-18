package state;

import java.util.ArrayList;

public class FrenchState implements State{
    private MusicBox box;

    public FrenchsState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton(){
        String songNameFS = "Brille Brille Petite étoile\n";
        ArrayList<String> lyricsFS = new ArrayList<String>;
        lyrics.add("Brille brille petite étoile\n");
        lyrics.add("Je me demande vraiment ce que tu es\n");
        lyrics.add("Au-dessus du monde si haut\n");
        lyrics.add("Comme un diamant dans le ciel\n");
        lyrics.add("Brille brille petite étoile\n");
        lyrics.add("Je me demande vraiment ce que tu es\n");
        playSong(songNameFS,lyricsFS);
    }

    public void pressHappyButton(){
        String songNameFH = "Si Tu as D' la Joie au Coeur\n";
        ArrayList<String> lyricsFH = new ArrayList<String>;
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        playSong(songNameFH,lyricsFH);
    }

    public void pressEnglishButton(){
        box.setState(box.getEnglishState());
        System.out.println("Switching to English");
    }

    public void pressFrenchButton(){
        System.out.println("You are already in French");
    }

    public void pressSpanishButton(){
        box.setState(box.getSpanishState());
        System.out.println("Switching to Spanish");
    }
}
