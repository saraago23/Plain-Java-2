package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create a program that simulates a simple login process.
 * Implement a custom exception InvalidLoginException and
 * validate the login credentials.
 */
public class U4LoginSimulation {

    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        U4LoginSimulation application= new U4LoginSimulation();
       boolean vazhdo=true;
        do{
            System.out.println("Choose an option: ");
            System.out.println("1.Add a user");
            System.out.println("2.Log in user");
            Scanner input= new Scanner(System.in);
            String nr = input.next();

            switch (nr){
                case "1":
                    application.addUser();
                     break;
                case "2":
                    try {
                        application.logInPerson();
                    } catch (InvalidLoginException e) {
                        System.out.println(e.getMessage());

                    }
                    break;
                default:
                    System.out.println("Thank you");
                    vazhdo=false;
            }

        }while(vazhdo);

    }

    public void addUser(){
        System.out.println("----- Signing up -----");
        System.out.println("Enter your username: ");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("Vendosni password");
        String password = input.next();
        User newUser=new User(username,password);
        users.add(newUser);
    }
    public void logInPerson() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = input.next();
        System.out.println("Enter your password");
        String password = input.next();
        for(User user: users){
            if (!(user.getUsername().equalsIgnoreCase(username)&&user.getPassword().equalsIgnoreCase(password))) {
                throw new InvalidLoginException();
            } else {
                System.out.println("You have successfully logged in");
            }
        }
    }
}
