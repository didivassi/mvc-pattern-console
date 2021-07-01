package academy.mindswap.user.controllers;

import academy.mindswap.user.views.View;

public interface Controller {

    void init();
    void setView(View view);
    void setNextController(Controller controller);
    void setUserId(int userId);
}
