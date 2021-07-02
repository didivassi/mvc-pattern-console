package academy.mindswap.user.controllers;

import academy.mindswap.user.services.UserServices;
import academy.mindswap.user.utils.FormLabels;
import academy.mindswap.user.views.FormView;
import academy.mindswap.user.views.View;

public class FormController implements Controller {
    FormView view;
    Controller nextController;
    UserServices userService;
    int userId;

    @Override
    public void init() {

        view.show();
        nextController.setUserId(userId);
        nextController.init();
    }

    public void execute(FormLabels label, String newValue) {
        switch (label) {
            case USERNAME:
                if (userService.editUsername(userId, newValue)) {
                    view.showSuccess(label);
                    return;
                }
            case EMAIL:
                if (userService.editEmail(userId, newValue)) {
                    view.showSuccess(label);
                    return;
                }
            case PASSWORD:
                if (userService.editPassword(userId, newValue)) {
                    view.showSuccess(label);
                    return;
                }
            case DELETE:
                if (userService.deleteUser(userId)) {
                    view.showSuccess(label);
                    return;
                }

        }
        view.showFailure(label);
    }


    @Override
    public void setView(View view) {
        this.view = (FormView) view;
    }

    public void setViewLabel(FormLabels label) {
        view.setLabel(label);
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
