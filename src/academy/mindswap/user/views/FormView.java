package academy.mindswap.user.views;

import academy.mindswap.user.controllers.Controller;
import academy.mindswap.user.controllers.FormController;
import academy.mindswap.user.utils.FormLabels;
import academy.mindswap.user.utils.IOUtils;

import java.awt.*;

public class FormView implements View {
    FormController formController;
    FormLabels label;

    @Override
    public void show() {
        IOUtils.sendMessageToConsole(label.toString());
        String newValue = IOUtils.readInputFromConsole();
        formController.execute(label, newValue);
    }

    public void showSuccess(FormLabels label) {
        IOUtils.sendMessageToConsole(String.format("%s changed with success\n", label.toString()));
    }

    public void showFailure(FormLabels label) {
        IOUtils.sendMessageToConsole(String.format("%s could not be changed\n", label.toString()));
    }

    public void setLabel(FormLabels label) {
        this.label = label;
    }

    @Override
    public void setController(Controller controller) {
        formController = (FormController) controller;
    }
}
