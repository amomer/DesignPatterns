/**
 * abstract class for Song objects
 * @author Amjad Omer
 */
package adapter;

public abstract class Song {
    protected abstract String getTitle();
    protected abstract String getAlbum();
    protected abstract String getArtistFirstName();
    protected abstract String getArtistLastName();
    protected abstract String getGenre();
    /**
     * Method to display the song info when played
     * @return current song's info
     */
    public String toString(){
        String ret = getTitle() + "\nAlbum: " + getAlbum() + "\nBy: " + getArtistFirstName() + " " + getArtistLastName() + "\nGenre: " + getGenre() + "\n";
        return ret;
    }
}
