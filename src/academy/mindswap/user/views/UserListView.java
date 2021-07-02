package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.controllers.UserListController;
import academy.mindswap.user.utils.IOUtils;
import academy.mindswap.user.utils.Messages;

public class UserListView implements View {
    UserListController userListController;

    @Override
    public void show() {

        IOUtils.sendMessageToConsole(Messages.LISTING_USERS);
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
