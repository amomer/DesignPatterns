package decorator;

import java.util.Random;
/**
 * adds symbols after character in the string
 * @author Amjad Omer
 */
public class SpecialChars extends PasswordDecorator{
    /**
     * initializes password
     * @param passwordBeginning
     */
    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }
    /**
     * 30% chance to add a random symbol after each character in the string
     * @return password
     */
    public String getPassword(){
        Random chanceOfSymbol = new Random();
        Random typeOfSymbol = new Random();
        for(int i = 0; i < password.length(); i++){
            if(chanceOfSymbol.nextInt(10) < 3){
                int symbolCoice = typeOfSymbol.nextInt(7);
                if(symbolCoice == 0){
                    password = password.substring(0,i) + "*" + password.substring(i,password.length());
                }
                else if(symbolCoice == 1){
                	password = password.substring(0,i) + "!" + password.substring(i,password.length());
                }
                else if(symbolCoice == 2){
                	password = password.substring(0,i) + "%" + password.substring(i,password.length());
                }
                else if(symbolCoice == 3){
                	password = password.substring(0,i) + "+" + password.substring(i,password.length());
                }
                else if(symbolCoice == 4){
                	password = password.substring(0,i) + "." + password.substring(i,password.length());
                }
                else if(symbolCoice == 5){
                	password = password.substring(0,i) + "{" + password.substring(i,password.length());
                }
                else {
                	password = password.substring(0,i) + "}" + password.substring(i,password.length());
                }
            }
        }
        return password;
    }
}