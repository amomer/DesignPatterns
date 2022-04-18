package state;

import java.util.ArrayList;

public class EnglishState implements State{
    private MusicBox box;

    public EnglishState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton(){
        String songNameES = "Twinkle Twinkle Little Star\n";
        ArrayList<String> lyricsES = new ArrayList<String>();
        lyricsES.add("Twinkle twinkle little star\n");
        lyricsES.add("How I wonder what you are\n");
        lyricsES.add("Up above the world so high\n");
        lyricsES.add("Like a diamond in the sky\n");
        lyricsES.add("Twinkle twinkle little star\n");
        lyricsES.add("How I wonder what you are\n");
        box.playSong(songNameES,lyricsES);
    }

    public void pressHappyButton(){
        String songNameEH = "If You're Happy and you Know it\n";
        ArrayList<String> lyricsEH = new ArrayList<String>();
        lyricsEH.add("If you're happy and you know it, clap your hands\n");
        lyricsEH.add("If you're happy and you know it, clap your hands\n");
        lyricsEH.add("If you're happy and you know it, clap your hands\n");
        lyricsEH.add("If you're happy and you know it, clap your hands\n");
        box.playSong(songNameEH,lyricsEH);
    }

    public void pressEnglishButton(){
        System.out.println("You are already in English");
    }

    public void pressFrenchButton(){
        box.setState(box.getFrenchState());
        System.out.println("Switching to French");
    }

    public void pressSpanishButton(){
        box.setState(box.getSpanishState());
        System.out.println("Switching to Spanish");
    }
}
