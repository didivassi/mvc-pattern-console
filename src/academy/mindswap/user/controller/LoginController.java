package academy.mindswap.user.controller;

import academy.mindswap.user.UserDB;
import academy.mindswap.user.view.LoginView;
import academy.mindswap.user.view.View;

public class LoginController implements Controller {

    UserDB userDB;
    View view;
    Controller nextController;

    public LoginController(){

    }


    @Override
    public void init() {
        view.show();
        nextController.init();
    }

    public boolean doAuthenticate(String username, String password){

        return userDB.selectUser(username,password).isPresent();
    }

    @Override
    public void setView(View view) {
        this.view =view;
    }

    @Override
    public void setNextController(Controller controller) {
        nextController=controller;
    }


    public  void setDB(UserDB userDB){
        this.userDB=userDB;
    }
}
