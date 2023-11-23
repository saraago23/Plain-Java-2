package exceptions;

/**
 * Create a method performDivision that performs a
 * division operation and handle the exceptions within this method.
 */
public class U3Division {
    public static void main(String[] args) {
        System.out.println(performDivision(3,0));
    }

    public static double performDivision(int a, int b){
        double c=0;
        try{
           c= (double) a /b;
        }catch(Exception e){
                System.out.println("You can't divide any number by zero");
        }
        return c;
    }

}
