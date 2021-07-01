package academy.mindswap.user;

import academy.mindswap.user.model.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserDB {

    private List<User> users;

    public UserDB(){
        users=new LinkedList<>();
    }

    public Optional<User> selectUser(String username, String password){
        return users
                .stream()
                .filter(e-> e.getUserName().equals(username) && e.getPassword().equals(password))
                .findFirst();
    }

    public void insertUser(User user){
        users.add(user);
    }

    public void populate(){
        for (int i = 0; i < 5; i++) {
            User user=new User("user".concat(String.valueOf(i)),"pass".concat(String.valueOf(i)));
            insertUser(user);
        }
    }
}
