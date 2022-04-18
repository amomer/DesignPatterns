package state;

import java.util.ArrayList;

public class FrenchState implements State{
    private MusicBox box;

    public FrenchState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton(){
        String songNameFS = "Brille Brille Petite étoile\n";
        ArrayList<String> lyricsFS = new ArrayList<String>();
        lyricsFS.add("Brille brille petite étoile\n");
        lyricsFS.add("Je me demande vraiment ce que tu es\n");
        lyricsFS.add("Au-dessus du monde si haut\n");
        lyricsFS.add("Comme un diamant dans le ciel\n");
        lyricsFS.add("Brille brille petite étoile\n");
        lyricsFS.add("Je me demande vraiment ce que tu es\n");
        box.playSong(songNameFS,lyricsFS);
    }

    public void pressHappyButton(){
        String songNameFH = "Si Tu as D' la Joie au Coeur\n";
        ArrayList<String> lyricsFH = new ArrayList<String>();
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        lyricsFH.add("Si tu as d' la joie au coeur, Frappe des mains\n");
        box.playSong(songNameFH,lyricsFH);
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
