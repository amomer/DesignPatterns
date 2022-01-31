package decorator;

import java.util.Random;

public class RandomCasing extends PasswordDecorator {

    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }

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
