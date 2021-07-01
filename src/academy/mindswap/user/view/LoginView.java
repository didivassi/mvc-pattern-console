package academy.mindswap.user.view;

import academy.mindswap.user.controller.LoginController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginView implements View {

    String username;
    String password;

    @Override
    public void run(){
        sendMessageToConsole("Username:");
        username=readInputFromConsole();
        sendMessageToConsole("Password:");
        password=readInputFromConsole();
    }

    @Override
    public void sendMessageToConsole(String message) {
            System.out.println(message);
    }

    public String readInputFromConsole(){
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        try {
            return in.readLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    public String[] sendInputToController(){
        return new String[] {username,password};
    }
}
