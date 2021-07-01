package academy.mindswap.user.controllers;

import academy.mindswap.user.models.User;
import academy.mindswap.user.services.AuthenticationServices;
import academy.mindswap.user.services.UserService;
import academy.mindswap.user.services.UserServices;
import academy.mindswap.user.views.View;

import java.util.Optional;

public class LoginController implements Controller {

    AuthenticationServices authenticationService;
    UserServices userService;
    View view;
    Controller nextController;
    int userId;

    @Override
    public void init() {
        view.show();
        nextController.setUserId(userId);
        nextController.init();
    }

    public boolean doAuthenticate(String username, String password){
        Optional<User> user = authenticationService.authenticate(username,password);
        user.ifPresent(value -> setUserId(value.getId()));
        return user.isPresent();
    }

    @Override
    public void setView(View view) {
        this.view =view;
    }

    @Override
    public void setNextController(Controller controller) {
        nextController=controller;
    }

    @Override
    public void setUserId(int userId) {
        this.userId=userId;
    }

    public void setAuthenticationService(AuthenticationServices authenticationService){
     this.authenticationService=authenticationService;
    }

    public void setUserService(UserServices userService) {
        this.userService = userService;
    }
}
