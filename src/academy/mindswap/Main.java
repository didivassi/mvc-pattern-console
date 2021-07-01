package academy.mindswap;

import academy.mindswap.user.UserDB;
import academy.mindswap.user.controller.LoginController;

import academy.mindswap.user.controller.WelcomeController;
import academy.mindswap.user.view.LoginView;
import academy.mindswap.user.view.WelcomeView;

public class Main {

    public static void main(String[] args) {
	// write your code here


        UserDB userDB= new UserDB();
        userDB.populate();

        LoginController loginController = new LoginController();
        loginController.setDB(userDB);

        loginController.setView(new LoginView());

        WelcomeController welcomeController=  new WelcomeController(); ;
        welcomeController.setView(new WelcomeView());

        loginController.setNextController(welcomeController);

        loginController.run();



    }
}
