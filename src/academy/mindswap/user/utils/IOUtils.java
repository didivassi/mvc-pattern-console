package academy.mindswap.user.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtils {

   public static void sendMessageToConsole(String message) {
        System.out.println(message);
    }

    public static String readInputFromConsole(){
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        try {
            return in.readLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return "";
    }
}
