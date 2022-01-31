package decorator;

import java.util.Random;

public class EasyPassword extends Password{
    private String phrase;
    public EasyPassword(String phrase){
        this.phrase = phrase;
    }

    public String getPassword(){
        this.phrase = this.phrase.replaceAll("\\s", "");
        int max = 100;
        int min = 0;
        Random randomInt = new Random();
        int addedInt = min + randomInt.nextInt(max);
        return this.phrase + addedInt;
    }
}
