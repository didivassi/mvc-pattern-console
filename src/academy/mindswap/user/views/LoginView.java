package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.controllers.LoginController;
import academy.mindswap.user.utils.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginView implements View {

    String username;
    String password;
    LoginController loginController;

    @Override
    public void show(){
        IOUtils.sendMessageToConsole("Username:");
        username=IOUtils.readInputFromConsole();
        IOUtils.sendMessageToConsole("Password:");
        password=IOUtils.readInputFromConsole();

        if(!loginController.doAuthenticate(username,password)){
            show();
        }

    }

    @Override
    public void setController(Controller controller) {
        loginController=(LoginController) controller;
    }
}
