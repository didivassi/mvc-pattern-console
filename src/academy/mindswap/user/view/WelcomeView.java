package academy.mindswap.user.view;

import academy.mindswap.user.controller.Controller;
import academy.mindswap.user.controller.WelcomeController;

public class WelcomeView implements View {

    @Override
    public void sendMessageToConsole(String message) {
        System.out.println(message);
    }

    @Override
    public void show() {
        sendMessageToConsole("Welcome to restricted area: ");
    }

    @Override
    public void setController(Controller controller) {

    }
}
