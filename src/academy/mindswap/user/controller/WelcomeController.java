package academy.mindswap.user.controller;

import academy.mindswap.user.view.View;

public class WelcomeController implements Controller {

    View view;
    public WelcomeController(){

    }
    @Override
    public void run() {
      view.run();
    }

    @Override
    public void setView(View view) {
        this.view =view;
    }

    @Override
    public void setNextController(Controller controller) {

    }
}
