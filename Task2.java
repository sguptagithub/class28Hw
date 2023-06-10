package class28Hw;

public class Task2 {


    /*Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.*/

    public static void checkUserName(String userName) throws RuntimeException{

        if (userName.length()<5){

            throw new RuntimeException("User name is invalid");
        }

    }

    public static void main(String[] args) {

        String userName="Mary";

        checkUserName(userName);

    }

}