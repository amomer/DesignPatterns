package state;

import java.util.ArrayList;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    public MusicBox(){
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new Spanish(this);
    }

    public void pressStarButton(){
        state.pressStarButton();
    }

    public void pressHappyButton(){
        state.pressHappyButton();
    }

    public void pressEnglishButton(){
        state.pressEnglishButton();
    }

    public void pressFrenchButton(){
        state.pressFrenchButton();
    }

    public void pressSpanishButton(){
        state.pressSpanishButton();
    }

    public setState(State state){
        this.state = state;
    }

    public State getEnglishState(){
        return englishState;
    }

    public State getFrenchState(){
        return frenchState;
    }

    public State getSpanishState(){
        return spanishState;
    }

    public playSong(String songName, ArrayList<String> lyrics){
        System.out.println("Playing: " + songName);
        for(i=0;i<lyrics.size();i++)
            System.out.println(lyrics.get(i));
    }
}