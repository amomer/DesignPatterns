package state;

import java.util.ArrayList;

public class EnglishState implements State{
    private MusicBox box;

    public EnglishState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton(){
        String songNameES = "Twinkle Twinkle Little Star\n";
        ArrayList<String> lyricsES = new ArrayList<String>;
        lyrics.add("Twinkle twinkle little star\n");
        lyrics.add("How I wonder what you are\n");
        lyrics.add("Up above the world so high\n");
        lyrics.add("Like a diamond in the sky\n");
        lyrics.add("Twinkle twinkle little star\n");
        lyrics.add("How I wonder what you are\n");
        playSong(songNameES,lyricsES);
    }

    public void pressHappyButton(){
        String songNameEH = "If You're Happy and you Know it\n";
        ArrayList<String> lyricsEH = new ArrayList<String>;
        lyrics.add("If you're happy and you know it, clap your hands\n");
        lyrics.add("If you're happy and you know it, clap your hands\n");
        lyrics.add("If you're happy and you know it, clap your hands\n");
        lyrics.add("If you're happy and you know it, clap your hands\n");
        playSong(songNameEH,lyricsEH);
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
