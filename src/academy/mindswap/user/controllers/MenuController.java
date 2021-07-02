package academy.mindswap.user.controllers;

import academy.mindswap.user.utils.FormLabels;
import academy.mindswap.user.utils.IOUtils;
import academy.mindswap.user.views.MenuView;
import academy.mindswap.user.views.UserListView;
import academy.mindswap.user.views.View;

import java.awt.*;

public class MenuController implements Controller {

    final int MIN_CHOICE = 1;
    final int MAX_CHOICE = 5;
    View view;
    Controller nextController;
    UserListController userListController;
    FormController formController;
    int userId;
    private EndController endController;

    public void chooseOption(String option) {
        int optionNumber;

        try {
            optionNumber = Integer.parseInt(option);
        } catch (NumberFormatException e) {
            ((MenuView) view).sendNotValid(MIN_CHOICE, MAX_CHOICE);
            view.show();
            return;
        }

        if (optionNumber < MIN_CHOICE || optionNumber > MAX_CHOICE) {
            ((MenuView) view).sendNotValid(MIN_CHOICE, MAX_CHOICE);
            view.show();
            return;
        }

        doOption(optionNumber);
        nextController.setUserId(userId);
        nextController.init();

    }

    private void doOption(int optionNumber) {
        switch (optionNumber) {
            case 1 -> setNextController(userListController);
            case 2 -> {
                formController.setViewLabel(FormLabels.USERNAME);
                setNextController(formController);
            }
            case 3 -> {
                formController.setViewLabel(FormLabels.EMAIL);
                setNextController(formController);
            }
            case 4 -> {
                formController.setViewLabel(FormLabels.PASSWORD);
                setNextController(formController);
            }
            case 5 -> {
                formController.setViewLabel(FormLabels.DELETE);
                formController.setNextController(endController);
                setNextController(formController);
            }
        }
    }

    @Override
    public void init() {
        view.show();
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

    public void setUserListController(UserListController userListController) {
        this.userListController = userListController;
    }

    public void setFormController(FormController formController) {
        this.formController = formController;
    }

    public void setEndController(EndController endController) {
        this.endController = endController;
    }


}
