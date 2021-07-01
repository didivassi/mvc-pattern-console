package academy.mindswap.user.views;


import academy.mindswap.user.controllers.Controller;

public interface View {


    void show();
    void setController(Controller controller);

}
