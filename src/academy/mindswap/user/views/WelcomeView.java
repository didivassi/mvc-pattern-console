package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.utils.IOUtils;
import academy.mindswap.user.utils.Messages;

public class WelcomeView implements View {


    @Override
    public void show() {
        IOUtils.sendMessageToConsole(Messages.WELCOME);
    }

    @Override
    public void setController(Controller controller) {

    }
}
