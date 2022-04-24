/**
 * Adapter class to make an oldie tune a Song
 * @author Amjad Omer
 */
package adapter;

public class SongAdapter extends Song{
    private Tune tune;
    /**
     * sets tune object
     * @param tune
     */
    public SongAdapter(Tune tune){
        this.tune = tune;
    }
    /**
     * getter
     * @return song title
     */
    public String getTitle(){
        String[] temp = tune.getDisplayTitle().split(":");
        return temp[0];
    }
    /**
     * getter
     * @return album title
     */
    public String getAlbum(){
        String[] temp = tune.getDisplayTitle().split(":");
        return temp[1];
    }
    /**
     * getter
     * @return artist first name
     */
    public String getArtistFirstName(){
        String[] temp = tune.getArtistName().split(" ");
        return temp[0];
    }
    /**
     * getter
     * @return artist last name
     */
    public String getArtistLastName(){
        String[] temp = tune.getArtistName().split(" ");
        return temp[1];
    }
    /**
     * getter
     * @return genre
     */
    public String getGenre(){
        return tune.getCategory();
    }
}
