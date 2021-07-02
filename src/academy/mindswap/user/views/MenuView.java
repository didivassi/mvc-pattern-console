package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.controllers.MenuController;
import academy.mindswap.user.utils.IOUtils;
import academy.mindswap.user.utils.Messages;

public class MenuView  implements View{


    Controller menuController;
    @Override
    public void show() {
        IOUtils.sendMessageToConsole(Messages.MENU_LAYOUT);
        String option=IOUtils.readInputFromConsole();
        ((MenuController) menuController).chooseOption(option);

    }

    public void sendNotValid(int min, int max){
        IOUtils.sendMessageToConsole(String.format("You must input a number between %d and %d",min, max) );
    }

    @Override
    public void setController(Controller controller) {
        menuController=controller;
    }
}
