package academy.mindswap.user.controllers;

import academy.mindswap.user.models.User;
import academy.mindswap.user.services.UserServices;
import academy.mindswap.user.views.View;

import java.util.List;

public class UserListController implements Controller {

    View view;
    Controller nextController;
    UserServices userService;
    int userId;

    @Override
    public void init() {
        view.show();
        nextController.setUserId(userId);
        nextController.init();
    }

    public List<User> getUsers() {
        return userService.getUsers();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserService(UserServices userService) {
        this.userService = userService;
    }
}
