package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.utils.IOUtils;

public class WelcomeView implements View {


    @Override
    public void show() {
        IOUtils.sendMessageToConsole("Welcome to restricted area: ");
    }

    @Override
    public void setController(Controller controller) {

    }
}
