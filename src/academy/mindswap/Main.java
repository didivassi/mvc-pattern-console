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

        WelcomeController welcomeController=  new WelcomeController();
        LoginView loginView= new LoginView();

        loginController.setView(loginView);
        welcomeController.setView(new WelcomeView());

        loginView.setController(loginController);

        loginController.setNextController(welcomeController);
        loginController.init();



    }
}
