package academy.mindswap.user.controller;

import academy.mindswap.user.view.View;

public class WelcomeController implements Controller {

    View view;
    public WelcomeController(){

    }
    @Override
    public void init() {
      view.show();
    }

    @Override
    public void setView(View view) {
        this.view =view;
    }

    @Override
    public void setNextController(Controller controller) {

    }
}
