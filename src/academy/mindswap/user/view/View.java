package academy.mindswap.user.view;


import academy.mindswap.user.controller.Controller;

public interface View {

    void sendMessageToConsole(String Message);
    void show();
    void setController(Controller controller);

}
