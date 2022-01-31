package decorator;

import java.util.Random;
/**
 * takes in phrase and does initial changes
 * @author Amjad Omer
 */
public class EasyPassword extends Password{
    private String phrase;
    /**
     * initializes phrase
     * @param phrase
     */
    public EasyPassword(String phrase){
        this.phrase = phrase;
    }
    /**
    * removes white space and adds a random number to the end of the string
    */
    public String getPassword(){
        this.phrase = this.phrase.replaceAll("\\s", "");
        int max = 100;
        int min = 0;
        Random randomInt = new Random();
        int addedInt = min + randomInt.nextInt(max);
        return this.phrase + addedInt;
    }
}
