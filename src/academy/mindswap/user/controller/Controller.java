package academy.mindswap.user.controller;

import academy.mindswap.user.view.View;

public interface Controller {

    void run();
    void setView(View view);
    void setNextController(Controller controller);
}
