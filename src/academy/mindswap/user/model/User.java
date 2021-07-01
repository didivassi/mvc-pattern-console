package academy.mindswap.user.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class User {
    private String userName;
    private String email;
    private String password;

    public User(String userName, String password){
        this.userName=userName;
        this.password=password;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
