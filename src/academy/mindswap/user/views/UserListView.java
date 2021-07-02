package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.controllers.UserListController;
import academy.mindswap.user.utils.IOUtils;

public class UserListView implements View {
    UserListController userListController;

    @Override
    public void show() {

        IOUtils.sendMessageToConsole("Listing users");
        userListController.getUsers()
                .forEach(user -> IOUtils
                        .sendMessageToConsole(String.format("%s | %s", user.getUserName(), user.getEmail())));
        IOUtils.sendMessageToConsole("\n");

    }

    @Override
    public void setController(Controller controller) {
        userListController = (UserListController) controller;
    }

}
