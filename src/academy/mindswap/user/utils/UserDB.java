package academy.mindswap.user.utils;

import academy.mindswap.user.models.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserDB {

    private final List<User> users;

    public UserDB() {
        users = new LinkedList<>();
    }


    public List<User> getUsers() {
        return users;
    }

    public Optional<User> getUserById(int id) {
        return getUsers()
                .stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }

    public Optional<User> getUserByUserAndPass(String username, String password) {
        return users
                .stream()
                .filter(e -> e.getUserName().equals(username) && e.getPassword().equals(password))
                .findFirst();
    }

    public void insertUser(User user) {
        users.add(user);
    }

    public boolean updateUsername(int userId, String username) {
        getUserById(userId).get().setUserName(username);
        return true;
    }

    public boolean updateEmail(int userId, String email) {
        getUserById(userId).get().setEmail(email);
        return true;
    }

    public boolean updatePassword(int userId, String password) {
        getUserById(userId).get().setPassword(password);
        return true;
    }

    public boolean deleteUser(int userId) {
        users.remove(getUserById(userId));
        return true;
    }


    public void populate() {
        for (int i = 0; i < 5; i++) {
            String username = "user".concat(String.valueOf(i));
            User user = new User(i, username, username.concat("@mindswap.academy"), "pass".concat(String.valueOf(i)));
            insertUser(user);
        }
    }
}
