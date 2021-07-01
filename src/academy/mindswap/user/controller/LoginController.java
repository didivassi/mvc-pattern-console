package academy.mindswap.user.controller;

import academy.mindswap.user.UserDB;
import academy.mindswap.user.model.User;
import academy.mindswap.user.view.LoginView;
import academy.mindswap.user.view.View;
import academy.mindswap.user.view.WelcomeView;

import java.util.Optional;

public class LoginController implements Controller {

    UserDB userDB;
    View view;
    Controller nextController;

    public LoginController(){

    }


    @Override
    public void run() {
        LoginView login = (LoginView) view;
        login.run();
        String[]  userDetails= login.sendInputToController();
        Optional<User> user = userDB.selectUser(userDetails[0],userDetails[1]);
        if(user.isPresent()){
          nextController.run();
          return;
        }
        run();
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
