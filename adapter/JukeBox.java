/**
 * JukeBox object class
 * @author Amjad Omer
 */
package adapter;

import java.util.HashMap;

public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;
    /**
     * initializing hashmap
     */
    public JukeBox(){
        songs = new HashMap<String, Song>();
        currentSong = 0;
    }
    /**
     * adds song to hashmap with the title as the key
     * @param song to be added
     */
    public void addSong(Song song){
        songs.put(song.getTitle().toLowerCase(),song);
    }
    /**
     * plays given song if the title is found in the hashmap
     * @param songName of song to be played
     */
    public void play(String songName){
        if(songs.containsKey(songName.toLowerCase()))
            System.out.println((songs.get(songName.toLowerCase())).toString());
        else
            System.out.println("Sorry, the song entered is currently unavailable.\n");
    }
}
