/**
 * Track class extending the Song abstract class
 * @author Amjad Omer
 */
package adapter;

public class Track extends Song{
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;
    /**
     * setting variables
     * @param title
     * @param album
     * @param firstName
     * @param lastName
     * @param genre
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre){
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }
    /**
     * getter
     * @return String title
     */
    public String getTitle(){
        return title;
    }
    /**
     * getter
     * @return String album
     */
    public String getAlbum(){
        return album;
    }
    /**
     * getter
     * @return String firstName
     */
    public String getArtistFirstName(){
        return firstName;
    }
    /**
     * getter
     * @return String lastName
     */
    public String getArtistLastName(){
        return lastName;
    }
    /**
     * getter
     * @return String ret (genre) 
     */
    public String getGenre(){
        String ret = "Other";
        if(genre.name() == "ROCK")
            ret = "Rock";
        if(genre.name() == "POP")
            ret = "Pop";
        if(genre.name() == "HIPHOP")
            ret = "HipHop";
        if(genre.name() == "JAZZ")
            ret = "Jazz";
        if(genre.name() == "COUNTRY")
            ret = "Country";
        return ret;
    }
}
