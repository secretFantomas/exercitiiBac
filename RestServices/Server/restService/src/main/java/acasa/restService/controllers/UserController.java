package acasa.restService.controllers;

import acasa.restService.User;
import acasa.restService.UserDataBaseEmulator;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dan.puiu on 21.04.2018.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String getUser(){
        User user = UserDataBaseEmulator.getUser();
        String message = new Gson().toJson(user);
        return message;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String setUser(@RequestBody String message){

        User user = null;
        try {
            user = new Gson().fromJson(message, User.class);
        }catch(Exception e){
            return "Unable to deserialize request body to user. More details: " + e.getMessage();
        }
        UserDataBaseEmulator.setUser(user);


        return "Done";
    }

    

}
