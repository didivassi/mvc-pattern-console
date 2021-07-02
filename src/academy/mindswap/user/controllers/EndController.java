package academy.mindswap.user.controllers;

import academy.mindswap.user.views.View;

public class EndController implements Controller{

    View view;

    @Override
    public void init() {
        view.show();
        System.exit(0);
    }

    @Override
    public void setView(View view) {
        this.view=view;
    }

    @Override
    public void setNextController(Controller controller) {

    }

    @Override
    public void setUserId(int userId) {

    }
}
