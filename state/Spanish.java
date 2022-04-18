package state;

import java.util.ArrayList;

public class Spanish implements State{
    private MusicBox box;

    public SpanishState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton(){
        String songNameSS = "Brilla Brilla Pequeña Estrella\n";
        ArrayList<String> lyricsSS = new ArrayList<String>;
        lyrics.add("Brilla brilla pequeña estrella\n");
        lyrics.add("Cómo me pregunto lo que eres\n");
        lyrics.add("Por encima del mundo tan arriba\n");
        lyrics.add("Como un diamante en el cielo\n");
        lyrics.add("Brilla brilla pequeña estrella\n");
        lyrics.add("Cómo me pregunto lo que eres\n");
        playSong(songNameSS,lyricsSS);
    }

    public void pressHappyButton(){
        String songNameSH = "Si estás contento y lo sabes\n";
        ArrayList<String> lyricsSH = new ArrayList<String>;
        lyrics.add("Si eres feliz y lo sabes, aplaude\n");
        lyrics.add("Si eres feliz y lo sabes, aplaude\n");
        lyrics.add("Si eres feliz y lo sabes, aplaude\n");
        lyrics.add("Si eres feliz y lo sabes, aplaude\n");
        playSong(songNameSH,lyricsSH);
    }

    public void pressEnglishButton(){
        box.setState(box.getEnglishState);
        System.out.println("Switching to English");
    }

    public void pressFrenchButton(){
        box.setState(box.getFrenchState());
        System.out.println("Switching to French");
    }

    public void pressSpanishButton(){
        System.out.println("You are already in Spanish");
    }
}
