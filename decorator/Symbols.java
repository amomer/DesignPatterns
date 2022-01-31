package decorator;
/**
 * replaces letters with symbols
 * @author Amjad Omer
 */
public class Symbols extends PasswordDecorator{
    /**
     * initializes password
     * @param passwordBeginning
     */
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
        this.passwordBeginning = passwordBeginning;
        password = passwordBeginning.getPassword();
    }
    /**
     * replaces certain letters with numbers or symbols
     * @return password
     */
    public String getPassword(){
            password = password.replaceAll("a", "\\@");
            password = password.replaceAll("b", "8");
            password = password.replaceAll("e", "3");
            password = password.replaceAll("g", "9");
            password = password.replaceAll("i", "\\!");
            password = password.replaceAll("o", "0");
            password = password.replaceAll("s", "\\$");
            password = password.replaceAll("t", "7");
        return password;
    }
}