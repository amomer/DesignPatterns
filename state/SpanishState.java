package state;

import java.util.ArrayList;

public class SpanishState implements State{
    private MusicBox box;

    public SpanishState(MusicBox box){
        this.box = box;
    }

    public void pressStarButton(){
        String songNameSS = "Brilla Brilla Pequeña Estrella\n";
        ArrayList<String> lyricsSS = new ArrayList<String>();
        lyricsSS.add("Brilla brilla pequeña estrella\n");
        lyricsSS.add("Cómo me pregunto lo que eres\n");
        lyricsSS.add("Por encima del mundo tan arriba\n");
        lyricsSS.add("Como un diamante en el cielo\n");
        lyricsSS.add("Brilla brilla pequeña estrella\n");
        lyricsSS.add("Cómo me pregunto lo que eres\n");
        box.playSong(songNameSS,lyricsSS);
    }

    public void pressHappyButton(){
        String songNameSH = "Si estás contento y lo sabes\n";
        ArrayList<String> lyricsSH = new ArrayList<String>();
        lyricsSH.add("Si eres feliz y lo sabes, aplaude\n");
        lyricsSH.add("Si eres feliz y lo sabes, aplaude\n");
        lyricsSH.add("Si eres feliz y lo sabes, aplaude\n");
        lyricsSH.add("Si eres feliz y lo sabes, aplaude\n");
        box.playSong(songNameSH,lyricsSH);
    }

    public void pressEnglishButton(){
        box.setState(box.getEnglishState());
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
