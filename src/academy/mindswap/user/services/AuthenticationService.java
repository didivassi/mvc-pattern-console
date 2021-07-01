package academy.mindswap.user.services;


import academy.mindswap.user.models.User;
import academy.mindswap.user.utils.UserDB;

import java.util.Optional;

public class AuthenticationService implements AuthenticationServices{

    UserDB userDB;


    public Optional<User> authenticate(String username, String password){
        return userDB.getUserByUserAndPass(username,password);
    }


    public void setUserDB(UserDB userDB){
        this.userDB=userDB;
    }
}
