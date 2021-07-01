package academy.mindswap.user.view;

import academy.mindswap.user.controller.WelcomeController;

public class WelcomeView implements View {

    @Override
    public void sendMessageToConsole(String message) {
        System.out.println(message);
    }

    @Override
    public void run() {
        sendMessageToConsole("Welcome to restricted area: ");
    }
}
