package decorator;

import java.util.Random;
/**
 * randomizes caps of letters in string
 * @author Amjad Omer
 */
public class RandomCasing extends PasswordDecorator {
    /**
     * initializes password
     * @param passwordBeginning
     */
    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }
    /**
     * 50% change to change a letter to either upper or lower case
     * @return password
     */
    public String getPassword(){
        Random chanceOfRandomCasing = new Random();
        for (int i = 0; i<password.length(); i++){
            if(Character.isDigit(password.charAt(i)) == false){
                if(chanceOfRandomCasing.nextInt(10) < 5){
                    password = password.substring(0, i-1) + password.substring(i-1, i+1).toUpperCase() + password.substring(i+1,password.length());
                }
                else {
                	password = password.substring(0, i-1) + password.substring(i-1, i+1).toLowerCase() + password.substring(i+1,password.length());
                }
            }
        }
        return password;
    }
}
