package acasa.restService.controllers;

import acasa.restService.UserDataBaseEmulator;
import com.google.gson.Gson;
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
        return new Gson().toJson(UserDataBaseEmulator.getUser());
    }

}
