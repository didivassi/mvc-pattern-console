package academy.mindswap.user.services;

import academy.mindswap.user.models.User;
import academy.mindswap.user.utils.UserDB;

import java.util.List;
import java.util.Optional;

public class UserService implements UserServices {

    private UserDB userDB;

    @Override
    public List<User> getUsers() {
        return userDB.getUsers();
    }

    @Override
    public Optional<User> getUser(int id) {
        return userDB.getUserById(id);
    }

    @Override
    public boolean editUsername(int id, String username) {
        userDB.updateUsername(id, username);
        return true;
    }

    @Override
    public boolean editPassword(int id, String password) {
        userDB.updatePassword(id, password);
        return true;
    }

    @Override
    public boolean editEmail(int id, String email) {
        userDB.updateEmail(id, email);
        return true;
    }

    @Override
    public boolean deleteUser(int id) {
        userDB.deleteUser(id);
        return true;
    }

    public void setUserDB(UserDB userDB) {
        this.userDB = userDB;
    }


}
