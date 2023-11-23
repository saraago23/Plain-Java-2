package exceptions;

public class InvalidLoginException extends Exception{
    public InvalidLoginException() {
        super("Incorrect username or password"+ "\n" + "This user does not exist in our system ");
    }
}
