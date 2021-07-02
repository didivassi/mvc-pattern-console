package academy.mindswap;

import academy.mindswap.user.controllers.*;
import academy.mindswap.user.services.AuthenticationService;
import academy.mindswap.user.services.UserService;

import academy.mindswap.user.utils.UserDB;
import academy.mindswap.user.views.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        UserDB userDB=new UserDB();
        userDB.populate();

        //Create views
        LoginView loginView= new LoginView();
        WelcomeView welcomeView = new WelcomeView();
        MenuView menuView = new MenuView();
        UserListView userListView = new UserListView();
        FormView formView=new FormView();
        EndView endView=new EndView();

        //Create controllers
        LoginController loginController = new LoginController();
        WelcomeController welcomeController=  new WelcomeController();
        MenuController menuController= new MenuController();
        UserListController userListController = new UserListController();
        FormController formController = new FormController();
        EndController endController =  new EndController();


        //Create services
        UserService userService = new UserService();
        AuthenticationService  authenticationService = new AuthenticationService();

        //Set services DB
        userService.setUserDB(userDB);
        authenticationService.setUserDB(userDB);


        //Set controller views
        loginController.setView(loginView);
        welcomeController.setView(welcomeView);
        menuController.setView(menuView);
        userListController.setView(userListView);
        formController.setView(formView);
        endController.setView(endView);

        //Set view controllers
        loginView.setController(loginController);
        welcomeView.setController(welcomeController);
        menuView.setController(menuController);
        userListView.setController(userListController);
        formView.setController(formController);
        endView.setController(endController);

        //Set controller next controller
        loginController.setNextController(welcomeController);
        welcomeController.setNextController(menuController);
        userListController.setNextController(menuController);
        formController.setNextController(menuController);

        //Set specific controllers
        menuController.setUserListController(userListController);
        menuController.setFormController(formController);
        menuController.setEndController(endController);

        //set controller services
        loginController.setAuthenticationService(authenticationService);
        loginController.setUserService(userService);
        userListController.setUserService(userService);
        formController.setUserService(userService);

        loginController.init();



    }
}
