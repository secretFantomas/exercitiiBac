package acasa.restService;

/**
 * Created by dan.puiu on 21.04.2018.
 */
public class UserDataBaseEmulator {

    private static User lastUser = new User("UserDefault",-100);

    public static void setUser(User user){
        lastUser = user;
    }

    public static User getUser(){
        return lastUser;
    }

    public static void deleteUser(){
        lastUser = null;
    }



}
