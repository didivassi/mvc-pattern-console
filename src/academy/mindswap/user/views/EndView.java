package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;

public class EndView implements View {
    Controller controller;

    @Override
    public void show() {
        System.out.println("Good Bye");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
