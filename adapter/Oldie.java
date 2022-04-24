/**
 * Oldie object class
 * @author Amjad Omer
 */
package adapter;

public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;
    /**
     * setting variables
     * @param artistName
     * @param songTitle
     * @param recordTitle
     * @param category
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category){
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }
    /**
     * getter
     * @return artist's name
     */
    public String getArtistName(){
        return artistName;
    }
    /**
     * getter
     * @return song and record titles
     */
    public String getDisplayTitle(){
        return songTitle + ":" + recordTitle;
    }
    /**
     * getter
     * @return genre
     */
    public String getCategory(){
        if(category == "Country and Western")
            category = "Country";
        if(category == "Classic Rock")
            category = "Rock";
        if(category == "Rock")
            return category;
        else
            category = "Other";
        return category;
    }
}
