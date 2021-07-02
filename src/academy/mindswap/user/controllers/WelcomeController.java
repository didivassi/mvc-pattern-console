package academy.mindswap.user.controllers;

import academy.mindswap.user.views.View;

public class WelcomeController implements Controller {

    View view;
    Controller nextController;
    int userId;

    @Override
    public void init() {
        view.show();
        nextController.setUserId(userId);
        nextController.init();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void setNextController(Controller controller) {
        this.nextController = controller;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }


}
