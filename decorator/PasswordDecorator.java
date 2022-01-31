package decorator;
/**
 * Decorator class
 * @author Amjad Omer
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;
   /**
    * initializes the passwordBeginning Password class
    * @param passwordBeginning
    */
    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }
    /**
     * abstract getpassword method 
     */
    public abstract String getPassword();
}
