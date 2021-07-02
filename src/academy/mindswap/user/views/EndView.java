package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.utils.IOUtils;
import academy.mindswap.user.utils.Messages;

public class EndView implements View {
    Controller controller;

    @Override
    public void show() {
        IOUtils.sendMessageToConsole(Messages.GOODBYE);
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
