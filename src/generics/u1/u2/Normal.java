package generics.u1.u2;

public class Normal {

    private String message;

    public Normal(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Normal normal=new Normal("Hello ");
        Print print= new Print();

        print.printSomething(normal.getMessage());
    }
}
