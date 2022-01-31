package decorator;

import java.util.Random;

public class SpecialChars extends PasswordDecorator{
    
    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }

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