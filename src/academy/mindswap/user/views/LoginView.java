package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.controllers.LoginController;
import academy.mindswap.user.utils.IOUtils;
import academy.mindswap.user.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginView implements View {

    String username;
    String password;
    LoginController loginController;

    @Override
    public void show() {
        IOUtils.sendMessageToConsole(Messages.INPUT_USERNAME);
        username = IOUtils.readInputFromConsole();
        IOUtils.sendMessageToConsole(Messages.INPUT_PASSWORD);
        password = IOUtils.readInputFromConsole();

        if (!loginController.doAuthenticate(username, password)) {
            show();
        }

    }

    @Override
    public void setController(Controller controller) {
        loginController = (LoginController) controller;
    }
}
